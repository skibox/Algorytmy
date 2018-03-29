package RandomAlgorithms.firstBlockchain;

import java.util.ArrayList;
import java.util.Date;

public class Block {

	public String hash;
	public String previousHash;
	public String merkleRoot;
	public ArrayList<Transaction> transactions = new ArrayList<>();
	private long timeStamp; //epoch
	private int nonce;
	
	public Block(String previousHash) {
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		
		this.hash = calculateHash(); //always last
	}
	
	public String calculateHash() {
		String calculatedHash = StringUtil.applySha256(
				previousHash +
				Long.toString(timeStamp) +
				Integer.toString(nonce) +
				merkleRoot
				);
		
		return calculatedHash;
	}
	
	public void mineBlock(int difficulty) {
		merkleRoot = StringUtil.getMerkleRoot(transactions);
		String target = StringUtil.getDifficultyString(difficulty);
		while(!hash.substring(0, difficulty).equals(target)) {
			this.nonce++;
			hash = calculateHash();
		}
		
		System.out.println("Block mined! : " + hash);
	}
	
	public boolean addTransaction(Transaction transaction) {
		if(transaction == null) return false;
		if(previousHash != "0") {
			if(transaction.processTransaction() != true) {
				System.out.println("Transaction failed to process. Discarded");
				return false;
			}
		}
		transactions.add(transaction);
		System.out.println("Transaction added to Block");
		return true;
	}
}
