package Testy.firstTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TripleSpec {
	private int expected;
	private String input;
	
	public TripleSpec(int expected, String input) {
		this.expected = expected;
		this.input = input;
	}
	
	@Parameters
	public static Collection<Object[]> tripleNumber(){
		return Arrays.asList(new Object[][] {
			{1, "abcXXXabc"},
			{3, "xxxabyyyycd"},
			{0, "a"}
		});
	}
	
	@Test
	public void tripleTest() {
		Calculator calculator = new Calculator();
		assertEquals(expected, calculator.countTriple(input));
	}
}
