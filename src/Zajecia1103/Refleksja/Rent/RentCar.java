package Zajecia1103.Refleksja.Rent;

public class RentCar {
	private int rate;
	private String type;
	
	public int price;
	
	public RentCar(int length) {
		if(length < 455) {
			this.rate = 35;
			this.type = "Small";
		}
		else if(length >= 455 && length < 495) {
			this.rate = 45;
			this.type = "Medium";
		}
		else if(length >= 495) {
			this.rate = 55;
			this.type = "Big";
		}
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void computeRentalCost(int numberOfDays) {
		price = numberOfDays * rate;
		System.out.println("Cena: " + price);
	}
	
	
}
