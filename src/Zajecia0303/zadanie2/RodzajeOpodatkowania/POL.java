package Zajecia0303.zadanie2.RodzajeOpodatkowania;

public class POL implements vatInterface {
	public static final double POL_VAT = 0.23;

	@Override
	public double calculateVat(int input) {
		return input * POL_VAT;
	}
	
}