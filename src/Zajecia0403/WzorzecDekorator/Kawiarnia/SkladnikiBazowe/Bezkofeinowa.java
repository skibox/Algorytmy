package Zajecia0403.WzorzecDekorator.Kawiarnia.SkladnikiBazowe;

import Zajecia0403.WzorzecDekorator.Kawiarnia.Napoj;

public class Bezkofeinowa extends Napoj{
	
	@Override
	public String getName() {
		return "Bezkofeinowa";
	}
	
	@Override
	public double price() {
		return 10.0;
	}
}
