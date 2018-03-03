package Zajecia0303.WzorceProjektowe.WzorzecObserwator;

import Zajecia0303.WzorceProjektowe.WzorzecObserwator.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void deleteObsever(Observer o);
	public void notifyObservers();
}
