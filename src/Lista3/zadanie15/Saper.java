package Lista3.zadanie15;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Saper {
	public static int closestBombsCount(boolean bombField[][], int H, int W) {
		int bombCount = 0;

		for (int i2 = H - 1; i2 < H + 2; i2++) {
			for (int j2 = W - 1; j2 < W + 2; j2++) {
				try {
					if (bombField[i2][j2] == true)
						bombCount++;
				} catch (IndexOutOfBoundsException e) {
					continue;
				}
			}
		}
		return bombCount;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sizeH = 0;
		int sizeW = 0;
		int bombPropability = 0;

		System.out.println("Podaj rozmiar planszy H W: ");
		sizeH = scan.nextInt();
		sizeW = scan.nextInt();
		scan.nextLine();

		System.out.println("Podaj prawdopodobie�stwo wyst�pienia bomby: ");
		bombPropability = scan.nextInt();
		scan.nextLine();

		boolean[][] bombField = new boolean[sizeH][sizeW];

		for (int i = 0; i < bombField.length; i++) {
			for (int j = 0; j < bombField[i].length; j++) {
				if (ThreadLocalRandom.current().nextInt(1, 100) >= bombPropability)
					bombField[i][j] = true;
			}
		}

		for (int i = 0; i < bombField.length; i++) {
			for (int j = 0; j < bombField[i].length; j++) {
				if (bombField[i][j] == true)
					System.out.print("T\t");
				else
					System.out.print("N\t");
			}
			System.out.println();
		}
		System.out.println();

		char[][] resultField = new char[sizeH][sizeW];

		for (int i = 0; i < resultField.length; i++) {
			for (int j = 0; j < resultField[i].length; j++) {
				if (bombField[i][j] == true)
					resultField[i][j] = '*';
				else {
					resultField[i][j] = Character.forDigit(closestBombsCount(bombField, i, j), 10);
				}
			}
		}

		for (int i = 0; i < resultField.length; i++) {
			for (int j = 0; j < resultField[i].length; j++) {
				System.out.printf("%c\t", resultField[i][j]);
			}
			System.out.println();
		}
		scan.close();

	}
}
