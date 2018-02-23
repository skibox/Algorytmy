package Lista4.zadanie1;

public class Rectangle {
	Point point1;
	Point point2;
	Point point3;
	Point point4;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public void printPoints() {
		System.out.println(point1.toString());
		System.out.println(point2.toString());
		System.out.println(point3.toString());
		System.out.println(point4.toString());
	}

	public void printChosenPoint(int x) {
		switch (x) {
		case 1:
			System.out.println(point1.toString());
			break;
		case 2:
			System.out.println(point2.toString());
			break;
		case 3:
			System.out.println(point3.toString());
			break;
		case 4:
			System.out.println(point4.toString());
			break;
		default:
			break;
		}
	}

}
