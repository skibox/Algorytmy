package Lista2.zadanie5;

public class Array {

	public static void main(String[] args) {
		System.out.println("Zadanie 1: ");
		int[][] array1 = new int[4][];

		array1[0] = new int[4];
		array1[1] = new int[2];
		array1[2] = new int[1];
		array1[3] = new int[3];
		int counter1 = 10;

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array1[i][j] = counter1;
				counter1--;
			}
		}

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				System.out.printf("tab[%d, %d] = %d\t", i, j, array1[i][j]);
			}
			System.out.println();
		}

		System.out.println("Zadanie 2: \n\n");
		System.out.println("Zadanie 3: ");
		int[][][] array3 = new int[10][10][10];

		for (int x = 0; x < array3.length; x++) {
			for (int y = 0; y < array3[x].length; y++) {
				for (int z = 0; z < array3[x][y].length; z++) {
					array3[x][0][0] = x;
					array3[0][y][0] = y;
					array3[0][0][z] = z;
				}
			}
		}
		for (int x = 1; x < array3.length; x++) {
			for (int y = 1; y < array3[x].length; y++) {
				for (int z = 1; z < array3[x][y].length; z++) {
					array3[x][y][z] = x * y * z;
				}
			}
		}
		// System.out.println("Podaj 3 liczby do przemno�enia: ");
		// int x = scan.nextInt();
		// int y = scan.nextInt();
		// int z = scan.nextInt();
		// scan.nextLine();

		// System.out.println("Wynik: ");
		// System.out.println(array3[x][y][z]);

		System.out.println("Zadanie 4: ");
		int[][] array4 = new int[10][10];
		int counter2 = 0;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if ((i + j == 9) || (i == j)) {
					array4[i][j] = 1;
					counter2++;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("%d\t", array4[i][j]);
			}
			System.out.println();
		}
		System.out.println("Suma element�w wyr�nionych: " + counter2);

		System.out.println("Zadanie 5: ");
		int[][] array5 = new int[10][10];
		int counter3 = 0;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i + j == 9) {
					array5[i][j] = i;
					counter3 += i;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("%d\t", array5[i][j]);
			}
			System.out.println();
		}
		System.out.println("Suma element�w wyr�nionych: " + counter3);

		System.out.println("Zadanie 6: ");
		int[][] array6 = new int[10][10];
		int firstColumnSum = 0;
		int secondColumnSum = 0;

		for (int i = 0; i < array6.length; i++) {
			for (int j = 0; j < array6[i].length; j++) {
				if (j == 0) {
					array6[i][j] = i;
					firstColumnSum += i;
				}
				if (j == 1) {
					array6[i][j] = i * i;
					secondColumnSum += i * i;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("%d\t", array6[i][j]);
			}
			System.out.println();
		}

		System.out.println("Suma element�w z 1 kolumny: " + firstColumnSum);
		System.out.println("Suma element�w z 2 kolumny: " + secondColumnSum);
	}

}
