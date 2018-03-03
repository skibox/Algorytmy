package Zajecia0303.zadanie2;

import Zajecia0303.zadanie2.RodzajeOpodatkowania.CZE;

public class Produkt extends VAT {
	private int netto;

	public Produkt(int netto) {
		this.netto = netto;
		vatInterface = new CZE();
	}

	public int getNetto() {
		return netto;
	}

	public void setNetto(int netto) {
		this.netto = netto;
	}

}
