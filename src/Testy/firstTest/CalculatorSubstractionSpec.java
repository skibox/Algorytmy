package Testy.firstTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorSubstractionSpec{
	private double expected;
	private double a;
	private double b;
	
	public CalculatorSubstractionSpec(double expected, double a, double b) {
		this.expected = expected;
		this.a = a;
		this.b = b;
	}
	
	@Parameters
	public static Collection<Double[]> substractedNumbers(){
		return Arrays.asList(new Double[][] {
			{3.5, 10.0, 6.5},
			{-10.0, -5.5, 4.5},
			{0.0, -10.0, -10.0},
			{4.4, 10.0, 5.6}
		});
	}
	
	@Test
	public void substractionTest() {
		Calculator calculator = new Calculator();
		assertEquals(expected, calculator.subtraction(a, b), 0);
	}
}
