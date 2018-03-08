package PracaDomowa1003.zadanie3;

public class TassimoCapsule implements Tassimo {

	int[][] tassimo;

	public TassimoCapsule() {
		
	}

	@Override
	public int[][] getTassimo() {
		return tassimo;
	}

	@Override
	public void setTassimo(int[][] tassimo) {
		this.tassimo = tassimo;
	}

	@Override
	public void printTassimo() {
		for (int i = 0; i < tassimo.length; i++) {
			for (int j = 0; j < tassimo[i].length; j++) {
				System.out.printf("%d ", tassimo[i][j]);
			}
			System.out.println();
		}
	}

}
