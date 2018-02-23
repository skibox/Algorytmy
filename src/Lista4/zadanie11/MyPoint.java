package Lista4.zadanie11;

public class MyPoint {
	private int x = 0;
	private int y = 0;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public MyPoint() {
		// TODO Auto-generated constructor stub
	}

	public MyPoint(int x, int y) {
		setXY(x, y);
	}

	public int[] getXY() {
		int[] cords = new int[2];
		cords[0] = getX();
		cords[1] = getY();

		return cords;
	}

	public void setXY(int x, int y) {
		setX(x);
		setY(y);
	}

	@Override
	public String toString() {
		return "(" + getX() + "," + getY() + ")";
	}

	public double distance(int x2, int y2) {
		return Math.sqrt(Math.pow(x2 - getX(), 2) + Math.pow(y2 - getY(), 2));
	}

	public double distance(MyPoint point) {
		return Math.sqrt(Math.pow(point.getX() - getX(), 2) + Math.pow(point.getY() - getY(), 2));
	}

	public double distance(MyPoint point1, MyPoint point2) {
		return Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));
	}

	public double distance() {
		return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
	}
}
