package Lista4.zadanie4;


import java.util.Scanner;

public class Circle {

	private double radius = 1.0;
	
	public Circle() {
		
	}

	public Circle(double radius) {
		if(checkRadius(radius)) setRadius(radius);
		else setRadius(changeRadius());
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if(checkRadius(radius)) this.radius = radius;
		else this.radius = changeRadius();
	}
	
	public double getArea() {
		return Math.PI*Math.pow(getRadius(), 2);
	}
	
	public double getCircumference() {
		return 2*getRadius()*Math.PI;
	}
	
	public boolean checkRadius(double radius) {
		if (radius <= 0.0) {
			System.out.println("Podano b��dny promie�.");
			return false;
		}
		else return true;
	}
	
	public double changeRadius() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();
	}
	
	@Override
	public String toString() {
		
		return "Circle[radius = " + getRadius() + ", area = " + Math.round(getArea()) + ", circumference = " + Math.round(getCircumference()) + "]\n";
	}
}
