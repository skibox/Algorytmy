package Lista3.zadanie27;

public class Sudoku {
	public static boolean checkRows(int[][] rows) {
		int perfectRowSum = 45;
		int currentRowSum = 0;

		for (int i = 0; i < rows.length; i++) {
			for (int j = 0; j < rows[i].length; j++) {
				currentRowSum += rows[i][j];
			}
			if (currentRowSum == perfectRowSum) {
				currentRowSum = 0;
				continue;
			} else
				return false;
		}
		return true;
	}

	public static boolean checkColumns(int[][] columns) {
		int perfectColumnSum = 45;
		int currentColumnSum = 0;

		for (int i = 0; i < columns.length; i++) {
			for (int j = 0; j < columns[i].length; j++) {
				currentColumnSum += columns[j][i];
			}
			if (currentColumnSum == perfectColumnSum) {
				currentColumnSum = 0;
				continue;
			} else
				return false;
		}
		return true;
	}

	public static boolean checkSingleBlock(int[][] singleBlock, int x, int y) {
		int perfectBlockSum = 45;
		int singleBlockSum = 0;

		for (int i = x - 1; i <= x + 1; i++) {
			for (int j = y - 1; j <= y + 1; j++) {
				singleBlockSum += singleBlock[i][j];
			}
		}
		if (singleBlockSum == perfectBlockSum)
			return true;
		else
			return false;
	}

	public static boolean checkBlocks(int[][] blocks) {
		
		boolean isOk = true;
		
		for (int i = 0; i < blocks.length; i++) {
			for (int j = 0; j < blocks.length; j++) {
				if		(i == 1 && j == 1) isOk = checkSingleBlock(blocks, i, j);
				else if	(i == 1 && j == 4) isOk = checkSingleBlock(blocks, i, j);
				else if	(i == 1 && j == 7) isOk = checkSingleBlock(blocks, i, j);
				else if	(i == 4 && j == 1) isOk = checkSingleBlock(blocks, i, j);
				else if	(i == 4 && j == 4) isOk = checkSingleBlock(blocks, i, j);
				else if	(i == 4 && j == 7) isOk = checkSingleBlock(blocks, i, j);
				else if	(i == 7 && j == 1) isOk = checkSingleBlock(blocks, i, j);
				else if	(i == 7 && j == 4) isOk = checkSingleBlock(blocks, i, j);
				else if	(i == 7 && j == 7) isOk = checkSingleBlock(blocks, i, j);
				
				if (isOk == false) return false;
			}
		}
		return isOk;
	}
	public static void main(String[] args) {
		int[][] sudoku = {
			{5, 3, 4, 6, 7, 8, 9, 1, 2},
			{6, 7, 2, 1, 9, 5, 3, 4, 8},
			{1, 9, 8, 3, 4, 2, 5, 6, 7},
			{8, 5, 9, 7, 6, 1, 4, 2, 3},
			{4, 2, 6, 8, 5, 3, 7, 9, 1},
			{7, 1, 3, 9, 2, 4, 8, 5, 6},
			{9, 6, 1, 5, 3, 7, 2, 8, 4},
			{2, 8, 7, 4, 1, 9, 6, 3, 5},
			{3, 4, 5, 2, 8, 6, 1, 7, 9}  };
	
		if(checkRows(sudoku)) 		System.out.println("Rz�dy OK");
		else 						System.out.println("Rz�dy nieOK");
		
		if(checkColumns(sudoku)) 	System.out.println("Kolumny OK");
		else 						System.out.println("Kolumny nieOK");
		
		if(checkBlocks(sudoku)) 	System.out.println("Bloki OK");
		else 						System.out.println("Bloki nieOK");
	
	}
}