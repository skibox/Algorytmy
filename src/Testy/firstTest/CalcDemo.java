package Testy.firstTest;

public class CalcDemo {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		double x = 11;
		double y = 4.5;

		System.out.printf("%.2f + %.2f = %.2f", x, y, calc.addition(x, y));
		System.out.println();
		System.out.printf("%.2f - %.2f = %.2f", x, y, calc.subtraction(x, y));
		System.out.println();
		System.out.printf("%.2f * %.2f = %.2f", x, y, calc.multiplication(x, y));
		System.out.println();
		System.out.printf("%.2f / %.2f = %.2f", x, y, calc.division(x, y));
		System.out.println();
		
		System.out.println(calc.nFibonacci(9));
		System.out.println(calc.nFibonacci(10));
		System.out.println(calc.nFibonacci(11));
		
		System.out.println(calc.countTriple("abcXXXabc"));
		System.out.println(calc.countTriple("xxxabyyyycd"));
		System.out.println(calc.countTriple("a"));
	}
}
