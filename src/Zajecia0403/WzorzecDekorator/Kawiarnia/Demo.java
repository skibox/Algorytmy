package Zajecia0403.WzorzecDekorator.Kawiarnia;

import Zajecia0403.WzorzecDekorator.Kawiarnia.Dodatki.Mleko;
import Zajecia0403.WzorzecDekorator.Kawiarnia.SkladnikiBazowe.Bezkofeinowa;

public class Demo {
	public static void main(String[] args) {
		Napoj bezkofeinowaZMlekiem = new Mleko(new Bezkofeinowa());
		
		System.out.println("cena " + bezkofeinowaZMlekiem.getName() + " to " + bezkofeinowaZMlekiem.price());
	}
}
