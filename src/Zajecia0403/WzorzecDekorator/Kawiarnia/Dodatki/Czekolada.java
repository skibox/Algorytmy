package Zajecia0403.WzorzecDekorator.Kawiarnia.Dodatki;

import Zajecia0403.WzorzecDekorator.Kawiarnia.Napoj;

public class Czekolada extends SkladnikDekorator{
	Napoj napoj;
	
	public Czekolada(Napoj napoj) {
		this.napoj = napoj;
	}
	
	@Override
	public String getName() {
		return napoj.getName() + " z czekoladą";
	}
	
	@Override
	public double price() {

		return 1.0 + napoj.price();
	}

}
