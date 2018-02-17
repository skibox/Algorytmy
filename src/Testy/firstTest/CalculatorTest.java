package Testy.firstTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void additionShouldReturnFour() {
		Calculator calculator = new Calculator();
		assertEquals(4.0, calculator.addition(3, 1), 0);
	}
	@Test
	public void additionShouldReturnFiveAndHalf() {
		Calculator calculator = new Calculator();
		assertEquals(5.6, calculator.addition(3, 2.5), 0.1);
	}
	@Test
	public void additionShouldReturnZero() {
		Calculator calculator = new Calculator();
		assertEquals(0.0, calculator.addition(0, 0), 0);
	}
	@Test
	public void divisionShouldReturnTwo() {
		Calculator calculator = new Calculator();
		assertEquals(2.0, calculator.division(8, 4), 0.0);
	}
	@Test
	public void substractionShouldReturnZero() {
		Calculator calculator = new Calculator();
		assertEquals(0.0, calculator.subtraction(15.5, 15.0), 0.5);
	}

}
