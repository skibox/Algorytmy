package Lista4.zadanie1;

public class Rectangle2Points extends Rectangle{
	Point point1;
	Point point2;
	Point point3;
	Point point4;
	
	public Rectangle2Points(int x1, int y1, int x2, int y2) {
		point1 = new Point(x1,y1);
		point3 = new Point(x2,y2);
	}
	
	public void calculateOtherPoints() {
		point2 = new Point(point3.getX(), point1.getY());
		point4 = new Point(point1.getX(), point3.getY());
	}

}
