package Lista3.zadanie25;

import java.util.Stack;

public class Spiral {

	public static boolean isFinished(Stack<Integer> spiralText, int size) {
		boolean isComplete = true;

		if (spiralText.size() == size)
			return isComplete;
		else
			return !isComplete;
	}

	public static void main(String[] args) {
		int counter1 = 1;
		int Y_MAX = 10;
		int X_MAX = 4;
		int[][] array = new int[Y_MAX + 1][X_MAX + 1];

		Stack<Integer> spiralText = new Stack<Integer>();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = counter1++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

		// warunki brzegowe
		
		int Y_current = 0;
		int X_current = 0;
		int Y_currentMin = 0;
		int X_currentMin = 0;
		int Y_currentMax = Y_MAX;
		int X_currentMax = X_MAX;

		int way = 4; // initialWay -> right
		Y_currentMin++; // zeby nie brudzic kodu
		spiralText.push(array[Y_current][X_current]);

		while (!isFinished(spiralText, (Y_MAX+1)*(X_MAX+1))) {

			switch (way) {
			case 1: // up
				while (Y_current > Y_currentMin) {
					Y_current--;
					spiralText.push(array[Y_current][X_current]);
				}
				Y_currentMin++;
				way = 4;
				continue;
			case 2: // down
				while (Y_current < Y_currentMax) {
					Y_current++;
					spiralText.push(array[Y_current][X_current]);
				}
				Y_currentMax--;
				way = 3;
				continue;
			case 3: // left
				while (X_current > X_currentMin) {
					X_current--;
					spiralText.push(array[Y_current][X_current]);
				}
				X_currentMin++;
				way = 1;
				continue;
			case 4: // right
				while (X_current < X_currentMax) {
					X_current++;
					spiralText.push(array[Y_current][X_current]);
				}
				X_currentMax--;
				way = 2;
				continue;
			default:
				break;
			}

		}
		int[] output = new int[spiralText.size()];

		for (int i = output.length - 1; i >= 0; i--) {
			output[i] = spiralText.peek();
			spiralText.pop();
		}

		for (int i = 0; i < output.length; i++) {
			System.out.printf("%d ", output[i]);
		}
	}
}
