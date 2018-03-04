package Zajecia0403.WzorzecDekorator.Kawiarnia.Dodatki;

import Zajecia0403.WzorzecDekorator.Kawiarnia.Napoj;

public class Mleko extends SkladnikDekorator{
	Napoj napoj;
	
	public Mleko(Napoj napoj) {
		this.napoj = napoj;
	}
	
	@Override
	public String getName() {
		return napoj.getName() + " z mlekiem";
	}
	
	@Override
	public double price() {

		return 0.5 + napoj.price();
	}

}
