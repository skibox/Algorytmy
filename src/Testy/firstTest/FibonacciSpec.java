package Testy.firstTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FibonacciSpec {
	private int expected;
	private int a;
	
	public FibonacciSpec(int expected, int a) {
		this.expected = expected;
		this.a = a;
	}
	
	@Parameters
	public static Collection<Integer[]> fibonacciNumber(){
		return Arrays.asList(new Integer[][] {
			{21, 9},
			{34, 10},
			{55,11}
		});
	}
	
	@Test
	public void fibonacciTest() {
		Calculator calculator = new Calculator();
		assertEquals(expected, calculator.nFibonacci(a));
	}
}
