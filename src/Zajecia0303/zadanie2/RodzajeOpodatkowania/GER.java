package Zajecia0303.zadanie2.RodzajeOpodatkowania;

public class GER implements vatInterface {
	public static final double GER_VAT = 0.3;

	@Override
	public double calculateVat(int input) {
		return input * GER_VAT;
	}

}