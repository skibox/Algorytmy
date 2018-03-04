package Zajecia0403.WzorzecDekorator.Kawiarnia.SkladnikiBazowe;

import Zajecia0403.WzorzecDekorator.Kawiarnia.Napoj;

public class MocnoPalona extends Napoj {
	
	@Override
	public String getName() {
		return "Mocno palona";
	}

	@Override
	public double price() {
		return 20.0;
	}
}
