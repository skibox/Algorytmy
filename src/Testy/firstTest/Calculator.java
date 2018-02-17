package Testy.firstTest;

public class Calculator {
	public Calculator() {
		
	}
	
	public double addition(double x, double y) {
		return x + y;
	}
	
	public double subtraction(double x, double y) {
		return x - y;
	}
	
	public double multiplication(double x, double y) {
		return x * y;
	}
	
	public double division(double x, double y) {
		return x/y;
	}
	
	public boolean isEven(double a) {
		return (a%2 == 0);
	}
	
	public int nFibonacci(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		int n1 = 0;
		int n2 = 1;
		int n3 = n1 + n2;
		
		for(int i = 2; i < n; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		
		return n3;
	}
	
	public int countTriple(String input) {
		int counter = 0;
		
		for(int i = 0; i < input.length() - 2; i++){
			if(input.charAt(i) == input.charAt(i + 1))
				if(input.charAt(i) == input.charAt(i + 2))
					counter++;
		}
		
		return counter;
	}
}
