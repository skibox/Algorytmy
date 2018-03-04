package Zajecia0403.WzorzecDekorator.Kawiarnia.Dodatki;

import Zajecia0403.WzorzecDekorator.Kawiarnia.Napoj;

public class MlekoSojowe extends SkladnikDekorator{
	Napoj napoj;
	
	public MlekoSojowe(Napoj napoj) {
		this.napoj = napoj;
	}
	
	@Override
	public String getName() {
		return napoj.getName() + " z mlekiem sojowym";
	}
	
	@Override
	public double price() {

		return 0.8 + napoj.price();
	}

}
