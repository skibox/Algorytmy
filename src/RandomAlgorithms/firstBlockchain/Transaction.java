package RandomAlgorithms.firstBlockchain;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;

import org.apache.xalan.xsltc.trax.OutputSettings;
import org.bson.NewBSONDecoder;

public class Transaction {
	public String transactionId;
	public PublicKey sender;
	public PublicKey reciepient;
	public float value;
	public byte[] signature;
	
	public ArrayList<TransactionInput> inputs = new ArrayList<>();
	public ArrayList<TransactionOutput> outputs = new ArrayList<>();
	
	private static int sequence = 0;
	
	public Transaction(PublicKey from, PublicKey to, float value, ArrayList<TransactionInput> inputs) {
		this.sender = from;
		this.reciepient = to;
		this.value = value;
		this.inputs = inputs;
	}
	
	private String calculateHash() {
		sequence++;
		return StringUtil.applySha256(
				StringUtil.getStringFromKey(sender) +
				StringUtil.getStringFromKey(reciepient) + 
				Float.toString(value)
				);
	}
	
	public void generateSignature(PrivateKey privateKey) {
		String data = StringUtil.getStringFromKey(sender) + StringUtil.getStringFromKey(reciepient);
		signature = StringUtil.applyECDSASig(privateKey, data);
	}
	
	public boolean verifySignature() {
		String data = StringUtil.getStringFromKey(sender) + StringUtil.getStringFromKey(reciepient);
		return StringUtil.verifyEXDSASig(sender, data, signature);
	}
	
	public boolean processTransaction() {
		
		if(verifySignature() == false) {
			System.out.println("#Transaction signature failed to verify");
			return false;
		}
		
		for(TransactionInput input : inputs) {
			input.UTXO = NoobChain.UTXOs.get(input.transactionOutputId);
		}
		
		if(getInputsValue() < NoobChain.minimumTransaction) {
			System.out.println("#Transaction Inputs to small: " + getInputsValue());
		}
		
		float leftOver = getInputsValue() - value;
		transactionId = calculateHash();
		outputs.add(new TransactionOutput(this.reciepient, value, transactionId));
		outputs.add(new TransactionOutput(this.sender,leftOver,transactionId));
		
		for(TransactionOutput output : outputs) {
			NoobChain.UTXOs.put(output.id, output);
		}
		
		for(TransactionInput input : inputs) {
			if(input.UTXO == null) continue;
			NoobChain.UTXOs.remove(input.UTXO.id);
		}
		
		return true;
		
	}
	
	public float getInputsValue() {
		float total = 0;
		for(TransactionInput input : inputs) {
			if(input.UTXO == null) continue;
			total += input.UTXO.value;
		}
		return total;
	}
	
	public float getOutputsValue() {
		float total = 0;
		for(TransactionOutput output : outputs) {
			total += output.value;
		}
		return total;
	}
}
