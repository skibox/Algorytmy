package Zajecia0303.zadanie2;

import java.util.concurrent.ThreadLocalRandom;

import Zajecia0303.zadanie2.RodzajeOpodatkowania.CZE;
import Zajecia0303.zadanie2.RodzajeOpodatkowania.GER;
import Zajecia0303.zadanie2.RodzajeOpodatkowania.POL;
import Zajecia0303.zadanie2.RodzajeOpodatkowania.USA;

public class VATdemo {
	public static void main(String[] args) {
		
		Produkt[] products = new Produkt[5];
		
		for (int i = 0; i < products.length; i++) {
			int netto = ThreadLocalRandom.current().nextInt(2000);
			products[i] = new Produkt(netto);
			
			products[i].doCalculate(netto);
			System.out.println("Kwota netto: " + netto);
			System.out.println("GER vat = " + new GER().calculateVat(netto));
			System.out.println("POL vat = " + new POL().calculateVat(netto));
			System.out.println("USA vat = " + new USA().calculateVat(netto));
			System.out.println("CZE vat = " + new CZE().calculateVat(netto));
		}
		
		

	}
}
