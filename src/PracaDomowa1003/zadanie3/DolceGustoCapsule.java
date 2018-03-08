package PracaDomowa1003.zadanie3;

import java.util.Random;

public class DolceGustoCapsule implements DolceGusto {
	
	private int[][] dolce;
	private int tempX;
	private int tempY;
	
	public DolceGustoCapsule(int x, int y) {
		Random rand = new Random();
		tempX = x;
		tempY = y;
		
		dolce = new int[x][y];
		
		for (int i = 0; i < dolce.length; i++) {
			for (int j = 0; j < dolce[i].length; j++) {
				dolce[i][j] = rand.nextInt(2);
			}
		}
	}
	
	public int getTempX() {
		return tempX;
	}

	public int getTempY() {
		return tempY;
	}

	@Override
	public int[][] getDolce() {
		return dolce;
	}

	@Override
	public void setDolce(int[][] dolce) {
		this.dolce = dolce;
		
	}

	@Override
	public void printDolce() {
		for (int i = 0; i < dolce.length; i++) {
			for (int j = 0; j < dolce[i].length; j++) {
				System.out.printf("%d ", dolce[i][j]);
			}
			System.out.println();
		}
	}
	

}
