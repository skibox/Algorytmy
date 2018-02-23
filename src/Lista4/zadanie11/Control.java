package Lista4.zadanie11;

public class Control {
	public static void main(String[] args) {
		MyPoint testPoint = new MyPoint();
		
		MyCircle circle1 = new MyCircle(6,11,10);
		MyPoint point2 = new MyPoint(-6, 0);
		MyCircle circle2 = new MyCircle(point2, 15);
		
		System.out.println(circle1);
		System.out.println(circle2);
		
		System.out.println();
		System.out.println("Odleg�o�� mi�dzy punktami wynosi: ");
		
		System.out.println(testPoint.distance(circle1.center, circle2.center));
		System.out.println("Pole ko�a 2: ");
		System.out.println(circle2.getArea());
		System.out.println("Obw�d ko�a 1: ");
		System.out.println(circle1.getCircumference());
	}
}
