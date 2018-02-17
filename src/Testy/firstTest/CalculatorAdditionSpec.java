package Testy.firstTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorAdditionSpec {
	private double expected;
	private double a;
	private double b;
	
	public CalculatorAdditionSpec(double expected, double a, double b) {
		this.expected = expected;
		this.a = a;
		this.b = b;
	}
	
	@Parameters
	public static Collection<Double[]> addedNumbers(){
		return Arrays.asList(new Double[][] {
			{1.0, 0.0, 1.0},
			{4.0, 2.0, 2.0},
			{10.0, 7.5, 2.5}
		});
	}
	
	@Test
	public void additionTest() {
		Calculator calculator = new Calculator();
		assertEquals(expected, calculator.addition(a, b), 0);
	}

	
	
	
}
