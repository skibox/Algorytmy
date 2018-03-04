package Zajecia0403.WzorzecAdapter.KaczoIndyk;

public class IndykAdapter implements Kaczka{
	Indyk indyk;
	
	public IndykAdapter(Indyk indyk) {
		this.indyk = indyk;
	}
	
	@Override
	public void kwacz() {
		indyk.gulgaj();
	}

	@Override
	public void lec() {
		for(int i = 0; i < 5; i++) {
			indyk.lec();
		}
	}

}
