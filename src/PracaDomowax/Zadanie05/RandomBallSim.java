package app;

import java.util.concurrent.ThreadLocalRandom;

public class RandomBallSim {
	public static void main(String[] args) {
		
		int[] box = new int[10];
		int ballCount = 20;
		
		for (int i = 0; i < ballCount; i++) {
			box[ThreadLocalRandom.current().nextInt(0,10)]++;
		}
		
		for (int i = 0; i < box.length; i++) {
			System.out.printf("Do urny %d wpad³o %d kul, co stanowi %.0f%% wszystkich kul\n",
							   i+1, box[i], (double)box[i]*100/20);
		;
		}
	}
}
