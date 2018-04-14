package Projekty.Angle;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Angle {
	private double radianAngle;
	
	public Angle() {
		
	}
	
	public Angle(double radianAngle) {
		this.setRadianAngle(radianAngle);
	}
	
	public Angle(int degrees) {
		this.radianAngle = degrees * Math.PI / 180;
	}
	
	public Angle(int degrees, int minutes) {
		this.radianAngle = 	(degrees * Math.PI / 180) +
							(minutes * Math.PI / 10800);
	}
	
	public Angle(int degrees, int minutes, int seconds) {
		this.radianAngle = 	(degrees * Math.PI / 180) +
							(minutes * Math.PI / 10800) +
							(seconds * Math.PI / 648000);
	}
	
	public Angle(String input) {
		int degreeEndIndex = input.indexOf("o");
		int minuteEndIndex = input.indexOf("\"");
		
		int degree = Integer.parseInt(input.substring(0, degreeEndIndex));
		int minute = Integer.parseInt(input.substring(degreeEndIndex + 1,minuteEndIndex));
		int second = Integer.parseInt(input.substring(minuteEndIndex + 1, input.length() - 1));
		
		this.radianAngle = 	(degree * Math.PI / 180) +
				(minute * Math.PI / 10800) +
				(second * Math.PI / 648000);
	}

	public double getRadianAngle() {
		return radianAngle;
	}

	public void setRadianAngle(double radianAngle) {
		this.radianAngle = radianAngle;
	}

	public double sin() {
		return round(Math.sin(this.getRadianAngle()));
	}

	public double cos() {
		return round(Math.cos(this.getRadianAngle()));
	}

	public double tan() {
		return round(Math.tan(this.getRadianAngle()));
	}

	public double cot() {
		return round(1.0 / Math.tan(this.getRadianAngle()));
	}

	public double sec() {
		return round(1.0 / sin());
	}

	public double csx() {
		return round(1.0 / cos());
	}
	
	public double radian() {
		return round(this.radianAngle);
	}
	
	public double degree() {
		return round(this.radianAngle * 180 / Math.PI);
	}
	
	private static double round(double value) {
		BigDecimal bDecimal = new BigDecimal(value);
		bDecimal = bDecimal.setScale(5, RoundingMode.HALF_EVEN);
		return bDecimal.doubleValue();
	}
	
	public void setOfSin(double value) {
		this.radianAngle = Math.asin(value);
	}

	public void setOfCos(double value) {
		this.radianAngle = Math.acos(value);
	}

	public void setOfTan(double value) {
		this.radianAngle = Math.atan(value);
	}

	public void setOfCot(double value) {
		this.radianAngle = 1/Math.atan(value);
	}

	public void setOfSec(double value) {
		this.radianAngle = Math.(value);
	}

	public void setOfCsx(double value) {
		this.radianAngle = Math.asin(value);
	}

	@Override
	public String toString() {
		int degree;
		int minute;
		int second;
		
		int seconds = (int) Math.floor(degree() * 3600);
		degree = seconds / 3600; 
		minute = (seconds % 3600) / 60;
		second = (seconds % 3600) % 60;
		
		return degree + "deg. " + minute + "'" + second + "\"";
		
	}
	
//	vFraction = (value * 3600) % 3600 
//			vMinutes = vFraction / 60 
//			vSeconds = vFraction % 60 
}
