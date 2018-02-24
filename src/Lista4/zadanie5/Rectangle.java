package Lista4.zadanie5;


import java.util.Scanner;

public class Rectangle {
	private float length;
	private float width;

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(float length, float width) {
		if(checkSide(length) && checkSide(width)) {
			setLength(changeSide());
			setWidth(changeSide());
		}
		else if(checkSide(length) && !checkSide(width)) {
			setLength(changeSide());
			setWidth(width);
		}
		else if(!checkSide(length) && checkSide(width)) {
			setWidth(changeSide());
			setLength(length);
		}
		else {
			setLength(length);
			setWidth(width);
		}
		
	}
	
	public double getArea() {
		return getWidth()*getLength();
	}
	
	public double getPerimeter() {
		return 2*getWidth() + 2*getLength();
	}
	
	public boolean checkSide(double side) {
		if (side <= 0.0) {
			System.err.println("Podano b��dny bok.");
			return true;
		}
		else return false;
	}
	
	public float changeSide() {
		boolean end = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj now� warto�� dla boku: ");
		float output = scan.nextFloat();
		
		while(!end) {
			if(checkSide(output)) {
				output = changeSide();
			}
			else end = true;
		}
		scan.close();
		return output;
	}
	
	@Override
	public String toString() {
		return "Rectangle[length = " + String.format("%.2f, ", getLength()) + String.format("width = %.2f]", getWidth()); 
	}
}
