package Testy.firstTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorMultiplicationSpec {
	private double expected;
	private double a;
	private double b;
	
	public CalculatorMultiplicationSpec(double expected, double a, double b) {
		this.expected = expected;
		this.a = a;
		this.b = b;
	}
	
	@Parameters
	public static Collection<Double[]> multiplicationNumbers(){
		return Arrays.asList(new Double[][] {
			{0.0, 10.0, 0.0},
			{4.6, 2.0, 2.3},
			{10.0, 2.5, 4.0}
		});
	}
	
	@Test
	public void multiplicationTest() {
		Calculator calculator = new Calculator();
		assertEquals(expected, calculator.multiplication(a, b), 0);
	}
}
