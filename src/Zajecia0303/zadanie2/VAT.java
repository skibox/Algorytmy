package Zajecia0303.zadanie2;

import Zajecia0303.zadanie2.RodzajeOpodatkowania.vatInterface;

public abstract class VAT {
	protected vatInterface vatInterface;
	
	public void setVatInterface(vatInterface vatInterface) {
		this.vatInterface = vatInterface;
	}
	
	public double doCalculate(int input) {
		return vatInterface.calculateVat(input);
	}
	
}
