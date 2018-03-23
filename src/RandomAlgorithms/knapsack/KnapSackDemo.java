package RandomAlgorithms.knapsack;

import java.math.BigInteger;
import java.util.Random;

public class KnapSackDemo {
	public static BigInteger[] generateSuperincreasingSequence(int length) {
		Random random 			= new Random();
		BigInteger[] sequence 	= new BigInteger[length];
		BigInteger sum 			= BigInteger.ZERO;
		
		sequence[0] = BigInteger.ONE.add(BigInteger.valueOf(random.nextInt(3)));
		for(int i = 1; i < sequence.length; i++) {
			for(int j = 0; j < i; j++) {
				sum = sum.add(sequence[j]);
			}
			sequence[i] = sum.add(BigInteger.ONE).add(BigInteger.valueOf(random.nextInt(15)));

			sum = BigInteger.ZERO;
		}
		
		return sequence;
	}
	
	public static BigInteger generateSumOfW(BigInteger[] w) {
		BigInteger sum = BigInteger.ZERO;
		for (int i = 0; i < w.length; i++) {
			sum = sum.add(w[i]);
		}
		return sum;
	}
	
	public static BigInteger generateQ(BigInteger wSum) {
		Random random = new Random();
		BigInteger q = wSum.add(BigInteger.valueOf(random.nextInt(250)));
		return q;
	}
	
	public static BigInteger generateRCoprimeToQ(BigInteger q) {
		BigInteger r = q.divide(BigInteger.valueOf(4));
		while(NWWc(q, r).compareTo(q.multiply(r)) == -1) {
			r = r.add(BigInteger.ONE);
		}
		return r;
	}
	
	public static BigInteger NWWc(BigInteger q, BigInteger r) {
		BigInteger nww = q.multiply(r).divide(q.gcd(r));
		return nww;
	}
	
	public static BigInteger[] generateBetaSequence(BigInteger[] w, BigInteger r, BigInteger q) {
		BigInteger[] beta = new BigInteger[w.length];
		
		for (int i = 0; i < beta.length; i++) {
			beta[i] = w[i].multiply(r).remainder(q);
		}
		
		return beta;
	}
	
	public static int selectLargestButLessOrEqual(BigInteger[] w, BigInteger chose) {
		for (int i = w.length - 1; i >= 0; i--) {
			if (w[i].compareTo(chose) == -1 || w[i].compareTo(chose) == 0) return i;
		}
		return -1;
	}
	
	public static BigInteger generateC(String a, BigInteger[] beta) {
		BigInteger c = BigInteger.ZERO;
		for (int i = 0; i < beta.length; i++) {
			BigInteger added;
			if(a.substring(i, i + 1).equals("1")){
				added = beta[i].multiply(BigInteger.ONE);
			}
			else {
				added = beta[i].multiply(BigInteger.ZERO);
			}
			c = c.add(added);
		}
		return c;
	}
	
	public static int[] decrypt(String a, BigInteger c, BigInteger r, BigInteger q, BigInteger[] w) {
		BigInteger rInverse 	= r.modInverse(q);
		BigInteger tempy		= (c.multiply(rInverse)).remainder(q);
		
		int[] decrypted = new int[a.length()];
		int tempIndex 	= 0;
		
		while(!tempy.equals(BigInteger.ZERO)) {
			tempIndex = selectLargestButLessOrEqual(w, tempy);
			decrypted[tempIndex] = 1;
			tempy = tempy.subtract(w[tempIndex]);
		}
		
		return decrypted;
	}
	
	
	public static void main(String[] args) {
		
		String a 			= "110010010011011001010010101001100101010100101010010101010010110101010100101";
		BigInteger[] w 		= generateSuperincreasingSequence(a.length());
		BigInteger wSum 	= generateSumOfW(w);
		BigInteger q 		= generateQ(wSum);
		BigInteger r 		= generateRCoprimeToQ(q);
		BigInteger[] beta 	= generateBetaSequence(w, r, q);
		BigInteger c 		= generateC(a, beta);
		
		int[] decrypted		= decrypt(a, c, r, q, w);

		System.out.println("Should get: ");
		for(int i = 0; i < a.length(); i++) {
			System.out.print(a.charAt(i) + " ");
		}
		
		System.out.println();
		System.out.println("Got: ");
		for (int i = 0; i < decrypted.length; i++) {
			System.out.print(decrypted[i] + " ");
		}
	}
}

