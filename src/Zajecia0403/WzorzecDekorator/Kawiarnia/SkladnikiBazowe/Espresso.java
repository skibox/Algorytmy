package Zajecia0403.WzorzecDekorator.Kawiarnia.SkladnikiBazowe;

import Zajecia0403.WzorzecDekorator.Kawiarnia.Napoj;

public class Espresso extends Napoj {
	
	@Override
	public String getName() {
		return "Espresso";
	}

	@Override
	public double price() {
		return 5.0;
	}
}
