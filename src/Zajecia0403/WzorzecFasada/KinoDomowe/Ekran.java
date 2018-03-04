package Zajecia0403.WzorzecFasada.KinoDomowe;

public class Ekran {
	boolean active;
	String source;
	
	public void slideDown(){
		active = true;
	}
	
	public void slideUp() {
		active = false;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	
}
