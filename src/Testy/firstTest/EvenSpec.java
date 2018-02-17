package Testy.firstTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class EvenSpec {
	private boolean expected;
	private double a;
	
	public EvenSpec(boolean expected, double a) {
		this.expected = expected;
		this.a = a;
	}
	
	@Parameters
	public static Collection<Object[]> evenNumber(){
		return Arrays.asList(new Object[][] {
			{Boolean.TRUE, 2.0},
			{Boolean.FALSE, 3.0},
			{Boolean.TRUE, 16.0}
		});
	}
	
	@Test
	public void evenTest() {
		Calculator calculator = new Calculator();
		assertEquals(expected, calculator.isEven(a));
	}
}
