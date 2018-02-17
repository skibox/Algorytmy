package Testy.firstTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorDivisionSpec {
	private double expected;
	private double a;
	private double b;
	
	public CalculatorDivisionSpec(double expected, double a, double b) {
		this.expected = expected;
		this.a = a;
		this.b = b;
	}
	
	@Parameters
	public static Collection<Double[]> dividedNumbers(){
		return Arrays.asList(new Double[][] {
			{1.5, 10.0, 6.67},
			{4.6, 2.3, 0.5},
			{10.0, 2.5, 0.25}
		});
	}
	
	@Test
	public void divisionTest() {
		Calculator calculator = new Calculator();
		assertEquals(expected, calculator.division(a, b), 0.01);
	}
}
