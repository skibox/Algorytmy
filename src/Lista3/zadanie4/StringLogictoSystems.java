package Lista3.zadanie4;

import java.util.Arrays;

public class StringLogictoSystems {

	public static String[] bin(int inputDecimal) {
		String[] outputBinary = new String[10];
		boolean end = false;
		
		int i = outputBinary.length;
		while(!end) {
			if(inputDecimal%2 == 0) outputBinary[i - 1] = "0";
			else outputBinary[i - 1] = "1";
			inputDecimal /= 2;
			i--;
			if(inputDecimal == 0) end = true;
		}
		
		return outputBinary;
	}

	public static String[] oct(int inputDecimal) {
		String[] outputOctal = new String[10];
		boolean end = false;
		
		int i = outputOctal.length;
		while(!end) {
			if(inputDecimal%8 == 0) outputOctal[i - 1] = "0";
			else outputOctal[i - 1] = String.valueOf(inputDecimal%8);
			inputDecimal /= 8;
			i--;
			if(inputDecimal == 0) end = true;
		}
		
		return outputOctal;
	}

	public static String[] hex(int inputDecimal) {
		String[] outputHexadecimal = new String[10];
		boolean end = false;
		
		int i = outputHexadecimal.length;
		while(!end) {
			if(inputDecimal%16 == 0) outputHexadecimal[i - 1] = "0";
			else outputHexadecimal[i - 1] = String.valueOf(inputDecimal%16);
			inputDecimal /= 16;
			i--;
			if(inputDecimal == 0) end = true;
		}
		
		return outputHexadecimal;
	}

	public static void main(String[] args) {
		System.out.println("240 (B) = " + Arrays.toString(bin(240)));
		System.out.println("240 (O) = " + Arrays.toString(oct(240)));
		System.out.println("240 (H) = " + Arrays.toString(hex(240)));
	}
}
