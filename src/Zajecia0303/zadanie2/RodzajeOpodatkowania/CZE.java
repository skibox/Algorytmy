package Zajecia0303.zadanie2.RodzajeOpodatkowania;

public class CZE implements vatInterface {
	public static final double CZE_VAT = 0.1;

	@Override
	public double calculateVat(int input) {
		return input * CZE_VAT;
	}
	
}