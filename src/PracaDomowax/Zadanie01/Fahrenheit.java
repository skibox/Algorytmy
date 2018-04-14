package app;

import java.util.HashSet;
import java.util.Set;

public class Fahrenheit {
    private static Set<String> hs = new HashSet<String>();
    
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		scan.useLocale(Locale.US);
//
//		System.out.println("Podaj temperatur� w stopniach Celsjusza: ");
//		double tempCelsius = scan.nextDouble();
//		scan.nextLine();
//		double tempFahrenheit = 32 + tempCelsius * 1.8;
//		double tempKelwin = tempCelsius + 273.15;
//		
//		System.out.printf("Temp w stopniach Fahrenheita to: %.2f\n", tempFahrenheit);
//		System.out.printf("Temp w stopniach Kelwina to: %.2f\n", tempKelwin);
//
//		scan.close();
		String string = "HERE";
		permutation("", string);
		System.out.println(hs);
	}
	
    private static void permutation(String prefix, String str) {
        
        int n = str.length();
        if (n == 0) 
        {
            hs.add(prefix);
        }
        else {
            for (int i = 0; i < n; i++)
               permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }

}
