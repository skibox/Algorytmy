package RandomAlgorithms.Angle;

public class AngleDemo {
	public static void main(String[] args) {
		Angle angle1 = new Angle(Math.PI/6);
		Angle angle2 = new Angle(30);
		Angle angle3 = new Angle(1,6,40);
		Angle angle4 = new Angle(30,53);
		
		System.out.println("Sin(30) = " + angle1.sin());
		System.out.println("Cos(30) = " + angle1.cos());
		System.out.println("Tan(30) = " + angle1.tan());
		System.out.println("Cot(30) = " + angle1.cot());
		System.out.println("Sec(30) = " + angle1.sec());
		System.out.println("Csx(30) = " + angle1.csx());
		System.out.println("Radian(30) = " + angle1.radian());
		System.out.println("Degree(30) = " + angle1.degree());
		System.out.println("Angle1 (30deg): " + angle1.toString());
		System.out.println("Angle3 (1o6'40\"): " + angle3.toString());
		System.out.println("Angle4 (30o53'): " + angle4.toString());
		System.out.println("Angle4 sin(30o53') = " + angle4.sin());
		
		Angle angle5 = new Angle("5o20\"10'");
		System.out.println("Angle from String(5o20\\\"10') : " + angle5);
		
		angle5.setOfSin(0.5);
		System.out.println("Set of sin(0,5) : " + angle5);
		angle5.setOfCos(0.5);
		System.out.println("Set of cos(0,5) : " + angle5);
		angle5.setOfTan(0.5);
		System.out.println("Set of tan(0,5) : " + angle5);
//		angle5.setOfCot(0); //TODO
//		System.out.println(angle5);
		angle5.setOfSec(0.5);
		System.out.println("Set of sec(0,5) : " + angle5);
		angle5.setOfCsx(0.5);
		System.out.println("Set of csx(0,5) : " + angle5);
		angle5.setOfPoint(4, 4);
		System.out.println("Set of point(4,4) : " + angle5);
		angle5.setOfPoint(-5,2);
		System.out.println("Set of point(-5,2) : " + angle5);
		angle5.setOfPoint(-27, -3);
		System.out.println("Set of point(-27,-3) : " + angle5);
		
		System.out.println();System.out.println();
		
		System.out.println(Angle.sum(angle1, angle5));
		
		System.out.println(angle5.mult(2));
		System.out.println(angle5.div(4));
		
		System.out.println();
		System.out.println();
		
		Angle angle6 = Angle.inputAngle("45");
		System.out.println("Angle from String(45) : " + angle6);
		Angle angle7 = Angle.inputAngle("45o40\"15'");
		System.out.println("Angle from String(45o40\"15') : " + angle7);
		Angle angle8 = Angle.inputAngle("25.5");
		System.out.println("Angle from String(25.5) : " + angle8);
	}
}
