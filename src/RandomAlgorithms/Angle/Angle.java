package RandomAlgorithms.Angle;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Angle {
	
	public static double RIGHT_ANGLE = Math.PI/2;
	public static double STRAIGHT_ANGLE = Math.PI;
	public static double FULL_ANGLE = 2*Math.PI;
	public static double RADIAN = Math.PI;
	public static double DEGREE = Math.PI/180;
	public static double ARCMINUTE = Math.PI/180/60;
	public static double ARCSECOND = Math.PI/180/60/60;
	
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
		this.radianAngle = parseAngleFromDMS(input).radianAngle;
	}
	
	public Angle(double pX, double pY) {
		setOfPoint(pX, pY);
	}
	
	public static Angle inputAngle(String degree) {
		try {
			return new Angle(Integer.parseInt(degree));
		} catch (NumberFormatException e) {
			if (degree.contains("o"))
				return parseAngleFromDMS(degree);
			else
				return new Angle(parseDoubleDegreeToDMS(Double.parseDouble(degree)));
		}
	}

	private static String parseDoubleDegreeToDMS(double degree) {
		int degrees = (int) Math.floor(degree);
		double degreeMinuteDiff = degree - degrees;
		int minutes = (int) Math.floor(60 * degreeMinuteDiff);
		double minuteSecondDiff = 60 * degreeMinuteDiff - minutes;
		int seconds = (int) Math.floor(60 * minuteSecondDiff);

		return degrees + "o" + minutes + "\"" + seconds + "'";
	}

	public static Angle parseAngleFromDMS(String input) {
		int degreeEndIndex = input.indexOf("o");
		int minuteEndIndex = input.indexOf("\"");

		int degree = Integer.parseInt(input.substring(0, degreeEndIndex));
		int minute = Integer.parseInt(input.substring(degreeEndIndex + 1, minuteEndIndex));
		int second = Integer.parseInt(input.substring(minuteEndIndex + 1, input.length() - 1));

		double currentRadianAngle = (degree * Math.PI / 180) + (minute * Math.PI / 10800) + (second * Math.PI / 648000);

		return new Angle(currentRadianAngle);
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
	//TODO
	public void setOfCot(double value) {
		this.radianAngle = 1/Math.atan(value);
	}

	public void setOfSec(double value) {
		this.radianAngle = Math.acos(value);
	}

	public void setOfCsx(double value) {
		this.radianAngle = Math.asin(value);
	}

	public void setOfPoint(double pX, double pY) {
		setOfTan(Math.abs(pY)/Math.abs(pX));
	}
	
	public Angle add(int degree) {
		return new Angle(this.degree() + degree);
	}
	
	public Angle sub(int degree) {
		return new Angle(this.degree() - degree);
	}
	
	public static Angle sum(Angle angle1, Angle angle2) {	
		return new Angle(angle1.radianAngle + angle2.radianAngle);
	}
	
	public static Angle diff(Angle angle1, Angle angle2) {	
		return new Angle(angle1.radianAngle - angle2.radianAngle);
	}
	
	public Angle mult(double var) {	
		return new Angle(this.radianAngle * var);
	}
	
	public Angle div(double var) {	
		return new Angle(this.radianAngle / var);
	}
	
	public static Angle prod(Angle angle, double var) {
		return new Angle(angle.radianAngle * var);
	}
	
	public static Angle quot(Angle angle, double var) { 
		return new Angle(angle.radianAngle / var);
	}
	
	public Angle compl() {
		return new Angle(Angle.RIGHT_ANGLE - this.radianAngle);
	}
	
	public Angle suppl() {
		return new Angle(Angle.FULL_ANGLE - this.radianAngle);	
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

}
