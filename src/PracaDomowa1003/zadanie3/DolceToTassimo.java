package PracaDomowa1003.zadanie3;

import PracaDomowa1003.zadanie3.DolceGusto;
import PracaDomowa1003.zadanie3.Tassimo;

public class DolceToTassimo implements Tassimo{
	public DolceGusto dolce;
	int[][] payload;
	
	public DolceToTassimo(DolceGusto dolceGusto) {
		dolce = dolceGusto;
		payload = new int[dolce.getTempY()][dolce.getTempX()];
	}

	@Override
	public int[][] getTassimo() {
		for (int i = 0; i < payload.length; i++) {
			for (int j = 0; j < payload[i].length; j++) {
				payload[i][j] = dolce.getDolce()[j][i];
				
				if(payload[i][j] == 1) payload[i][j] = 0;
				else payload[i][j] = 1;
			}
		}	
		
		return payload;
	}

	@Override
	public void setTassimo(int[][] tassimo) {
		
	}

	@Override
	public void printTassimo() {
		for (int i = 0; i < payload.length; i++) {
			for (int j = 0; j < payload[i].length; j++) {
				System.out.printf("%d ", payload[i][j]);
			}
			System.out.println();
		}
	}

}
