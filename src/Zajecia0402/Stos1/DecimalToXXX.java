package Zajecia0402.Stos1;

public class DecimalToXXX {

	public static void main(String[] args) {
		Systems convert = new Systems();
		int value = 6163;
		System.out.printf("%d in binary = %s\n", value, convert.toBinaryString(value));
		System.out.printf("%d in hex = %s\n", value, convert.toHexString(value));
		System.out.printf("%d in octal = %s\n", value, convert.toOctalString(value));

	}
}
