package Zajecia0402.Stos1;

import java.util.Stack;

public class Systems {
	private static final int BIN = 2;
	private static final int HEX = 16;
	private static final int OCT = 8;

	public String toBinaryString(int value) {
		Stack<Integer> binary = new Stack<>();
		StringBuilder output = new StringBuilder();
		int L = value;

		while (L != 0) {
			binary.push(L % BIN);
			L /= BIN;
		}

		while (!binary.isEmpty()) {
			output.append(binary.peek() + " ");
			binary.pop();
		}

		return output.toString();
	}

	public String toHexString(int value) {
		Stack<Integer> hex = new Stack<>();
		StringBuilder output = new StringBuilder();
		int L = value;

		while (L != 0) {
			hex.push(L % HEX);
			L /= HEX;
		}

		while (!hex.isEmpty()) {
			output.append(Integer.toHexString(hex.peek()));
			hex.pop();
		}

		return output.toString();
	}

	public String toOctalString(int value) {
		Stack<Integer> octal = new Stack<>();
		StringBuilder output = new StringBuilder();
		int L = value;

		while (L != 0) {
			octal.push(L % OCT);
			L /= OCT;
		}

		while (!octal.isEmpty()) {
			output.append(octal.peek() + " ");
			octal.pop();
		}

		return output.toString();
	}

}
