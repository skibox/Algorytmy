package Lista4.zadanie7;


public class Control {
	public static void main(String[] args) {
		Account ac1 = new Account("10", "AAA", 500);
		Account ac2 = new Account("5", "BBB", 15000);
		
		System.out.println(ac1);
		System.out.println(ac2);
		ac1.transferTo(ac2, 2500);
		System.out.println();
		System.out.println(ac1);
		System.out.println(ac2);
	}
}
