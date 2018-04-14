package Projekty.Angle;

public class AngleDemo {
	public static void main(String[] args) {
		Angle angle1 = new Angle(Math.PI/6);
		Angle angle2 = new Angle(30);
		Angle angle3 = new Angle(1,6,40);
		Angle angle4 = new Angle(30,53);
		
		System.out.println(angle1.sin());
		System.out.println(angle1.cos());
		System.out.println(angle1.tan());
		System.out.println(angle1.cot());
		System.out.println(angle1.sec());
		System.out.println(angle1.csx());
		System.out.println(angle1.radian());
		System.out.println(angle1.degree());
		System.out.println(angle1.toString());
		System.out.println(angle3.toString());
		System.out.println(angle4.toString());
		System.out.println(angle4.sin());
		
		Angle angle5 = new Angle("5o20\"10'");
		System.out.println(angle5);
		
		angle5.setOfSin(0.5);
		System.out.println(angle5);
	}
}
