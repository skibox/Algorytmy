package PracaDomowa1003.zadanie3;

public class Demo {
	public static void main(String[] args) {
		DolceGustoCapsule dolceGustoCapsule = new DolceGustoCapsule(6, 4);
		DolceToTassimo dolceToTassimo = new DolceToTassimo(dolceGustoCapsule);
		
		dolceGustoCapsule.printDolce();
		System.out.println();
		System.out.println();
		dolceToTassimo.getTassimo();
		dolceToTassimo.printTassimo();
	}
}
	