package Zajecia0303.zadanie2.RodzajeOpodatkowania;

public class USA implements vatInterface {
	public static final double USA_VAT = 0.15;

	@Override
	public double calculateVat(int input) {
		return input * USA_VAT;
	}
	
}