package Zajecia0303.zadanie3;

public class FirstAmbulance implements Ambulance{
	private boolean isBusy;
	private String mission;
	
	public FirstAmbulance() {
		this.setBusy(false);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
	public void driveToAccident() {
		setBusy(true);
		
	}

	public boolean isBusy() {
		return isBusy;
	}

	public void setBusy(boolean isBusy) {
		this.isBusy = isBusy;
	}

}
