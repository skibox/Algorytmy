package RandomAlgorithms.firstBlockchain;

import java.security.Security;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class NoobChain {
	public static ArrayList<Block> blockChain = new ArrayList<Block>();
	public static HashMap<String, TransactionOutput> UTXOs = new HashMap<>();
	public static int difficulty = 5;
	public static float minimumTransaction = 0.1f;
	
	public static Wallet walletA;
	public static Wallet walletB;
	
	public static Transaction genesisTransaction;
	
	public static Boolean isChainValid() {
		Block currentBlock;
		Block previousBlock;
		
		String hashTarget = new String(new char[difficulty]).replace('\0', '0');
		HashMap<String, TransactionOutput> tempUTXOs = new HashMap<>();
		
		tempUTXOs.put(genesisTransaction.outputs.get(0).id, genesisTransaction.outputs.get(0));
		
		for(int i = 1; i < blockChain.size(); i++) {
			currentBlock = blockChain.get(i);
			previousBlock = blockChain.get(i - 1);
			
			if(!currentBlock.hash.equals(currentBlock.calculateHash())) {
				System.out.println("Current hashes not equal");
				return false;
			}
			
			if(!previousBlock.hash.equals(currentBlock.previousHash)) {
				System.out.println("Previous hashes not equal");
				return false;
			}
			
			if(!currentBlock.hash.substring(0, difficulty).equals(hashTarget)) {
				System.out.println("This block hasnt been mined");
				return false;
			}
			
			TransactionOutput tempOutput;
			for(int j = 0; j < currentBlock.transactions.size(); j++) {
				Transaction currentTransaction = currentBlock.transactions.get(j);
				
				if(!currentTransaction.verifySignature()) {
					System.out.println("Signature on Transaction(" + j + ") is invalid");
					return false;
				}
				
				if(currentTransaction.getInputsValue() != currentTransaction.getOutputsValue()) {
					System.out.println("Inputs are not equal to outputs on Transaction(" + j + ")");
					return false;
				}
				
				for(TransactionInput input : currentTransaction.inputs) {
					tempOutput = tempUTXOs.get(input.transactionOutputId);
					
					if(tempOutput == null){
						System.out.println("Referenced input on Transaction(" + j + ") is missing");
						return false;
					}
					
					if(input.UTXO.value != tempOutput.value) {
						System.out.println("Referenced input Transaction(" + j + ") value is invalid");
						return false;
					}
					
					tempUTXOs.remove(input.transactionOutputId);
				}
				
				for(TransactionOutput output : currentTransaction.outputs) {
					tempUTXOs.put(output.id, output);
				}
				
				if(currentTransaction.outputs.get(0).reciepient != currentTransaction.reciepient) {
					System.out.println("Transaction (" + j + ") output reciepient is not who it should be");
					return false;
				}
				
				if(currentTransaction.outputs.get(1).reciepient != currentTransaction.sender) {
					System.out.println("Transaction(" + j + ") output 'change' is not sender");
					return false;
				}
			}
		}
		System.out.println("Blockchain is valid");
		return true;
	}
	
	public static void addBlock(Block newBlock) {
		newBlock.mineBlock(difficulty);
		blockChain.add(newBlock);
	}
	
	public static void main(String[] args) {
		Security.addProvider(new BouncyCastleProvider());
		
		walletA = new Wallet();
		walletB = new Wallet();
		Wallet coinBase = new Wallet();
		
		genesisTransaction = new Transaction(
				coinBase.publicKey,
				walletA.publicKey,
				100,
				null
				);
		genesisTransaction.generateSignature(coinBase.privateKey);
		genesisTransaction.transactionId = "0";
		genesisTransaction.outputs.add(new TransactionOutput(
				genesisTransaction.reciepient,
				genesisTransaction.value,
				genesisTransaction.transactionId)
				);
		
		UTXOs.put(genesisTransaction.outputs.get(0).id, genesisTransaction.outputs.get(0));
		
		System.out.println("Creating and mining genesis Block...");
		Block genesis = new Block("0");
		genesis.addTransaction(genesisTransaction);
		addBlock(genesis);
		
		Block block1 = new Block(genesis.hash);
		System.out.println("\nWalletA balance is: " + walletA.getBalance());
		System.out.println("WalletA is attempting to send funds(40) to WalletB...");
		block1.addTransaction(walletA.sendFunds(walletB.publicKey, 40));
		addBlock(block1);
		System.out.println("\nWalletA balance is: " + walletA.getBalance());
		System.out.println("WalletB balance is: " + walletB.getBalance());
		
		Block block2 = new Block(block1.hash);
		System.out.println("\nWalletA Attempting to send more funds (1000) than it has...");
		block2.addTransaction(walletA.sendFunds(walletB.publicKey, 1000f));
		addBlock(block2);
		System.out.println("\nWalletA's balance is: " + walletA.getBalance());
		System.out.println("WalletB's balance is: " + walletB.getBalance());
		
		Block block3 = new Block(block2.hash);
		System.out.println("\nWalletB is Attempting to send funds (20) to WalletA...");
		block3.addTransaction(walletB.sendFunds( walletA.publicKey, 20));
		addBlock(block3);
		System.out.println("\nWalletA's balance is: " + walletA.getBalance());
		System.out.println("WalletB's balance is: " + walletB.getBalance());
		
		isChainValid();
	}
	
//	public static void main(String[] args) {
//		Security.addProvider(new BouncyCastleProvider());
//		walletA = new Wallet();
//		walletB = new Wallet();
//		//Test public and private keys
//		System.out.println("Private and public keys:");
//		System.out.println(StringUtil.getStringFromKey(walletA.privateKey));
//		System.out.println(StringUtil.getStringFromKey(walletA.publicKey));
//		//Create a test transaction from WalletA to walletB
//		Transaction transaction = new Transaction(
//				walletA.publicKey, walletB.publicKey, 5, null);
//		transaction.generateSignature(walletA.privateKey);
//		//Verify the signature works and verify it from the public key
//		System.out.println("Is signature verified");
//		System.out.println(transaction.verifySignature());
//		
//	}
	
//	public static void main(String[] args) {
//		blockChain.add(new Block("Genesis block", 	"0"));
//		System.out.println("Mining block 1...");
//		blockChain.get(0).mineBlock(difficulty);
//		
//		blockChain.add(new Block("Second block", 	blockChain.get(blockChain.size() - 1).hash));
//		System.out.println("Mining block 2...");
//		blockChain.get(1).mineBlock(difficulty);
//		
//		blockChain.add(new Block("Third block", 	blockChain.get(blockChain.size() - 1).hash));
//		System.out.println("Mining block 3...");
//		blockChain.get(2).mineBlock(difficulty);
//		
//		System.out.println("\nBlockchain is valid: " + isChainValid());
//		
//		String blockChainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockChain);
//		System.out.println("\nThe BlockChain:");
//		System.out.println(blockChainJson);
//	}
}
