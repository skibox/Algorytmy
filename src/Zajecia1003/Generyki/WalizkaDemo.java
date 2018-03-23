package Zajecia1003.Generyki;

public class WalizkaDemo {
	public static void main(String[] args) {
		Walizka<Sweter> walizka = new Walizka<>();
		walizka.setPrzedmiot(new Sweter("Sweter"));
		walizka.getPrzedmiot().zloz();
	}
}
