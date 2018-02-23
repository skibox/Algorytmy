package Lista4.zadanie1;

public class Point {
	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
		setX(x);
		setY(y);
	}

	public int getX() {
		return x;
	}

	public int setX(int x) {
		int temp = getX();
		this.x = x;
		return temp;
	}

	public void setX(Point point) {
		setX(point.getX());
	}

	public int getY() {
		return y;
	}

	public int setY(int y) {
		int temp = getY();
		this.y = y;
		return temp;
	}
	
	public void setY(Point point) {
		setY(point.getY());
	}

	public void setXY(Point point) {
		this.x = point.getX();
		this.y = point.getY();
	}

	public Point getXY() {
		return this;
	}

	@Override
	public String toString() {
		return "Punkt: " + getX() + " " + getY();
	}

}
