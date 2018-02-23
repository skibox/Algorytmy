package Lista3.zadanie19;

import java.util.Scanner;

public class WaterHeater {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double waterHeatCapacity = 4.184; // J/g*st.C
		
		System.out.println("Podaj ilo�� wody w kilogramach/litrach: ");
		double waterWeight 				= scan.nextDouble();
		System.out.println("Podaj pocz�tkow� i ko�c�w� temperatur� w st. Celsjusza: ");
		double waterInitialTemperature 	= scan.nextDouble();
		double waterFinalTemperature 	= scan.nextDouble();
		
		double thermalEnergy = waterHeatCapacity *
							   (waterWeight*1000) *
							   (waterFinalTemperature - waterInitialTemperature);
		
		System.out.printf("Wymagana ilo�� energii: %.2f [J]", thermalEnergy);
		scan.close();		
		
	}
}
