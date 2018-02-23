package Lista4.zadanie11;

public class MyCircle {
	MyPoint center = new MyPoint(0,0);
	int radius = 1;
	
	public MyCircle() {

	}
	
	public MyCircle(int x, int y, int radius) {
		setCenterX(x);
		setCenterY(y);
		setRadius(radius);
	}
	
	public MyCircle(MyPoint center, int radius) {
		setCenter(center);
		setRadius(radius);
	}

	public int[] getCenterXY() {
		int[] center = new int[2];
		center[0] = this.center.getX();
		center[1] = this.center.getY();
		
		return center;
	}
	
	public void setCenterXY(int x, int y) {
		this.center.setX(x);
		this.center.setY(y);
	}

	public MyPoint getCenter() {
		return this.center;
	}

	public void setCenter(MyPoint point) {
		this.center.setX(point.getX());
		this.center.setY(point.getY());
	}
	
	public int getCenterX() {
		return this.center.getX();
	}
	
	public void setCenterX(int x) {
		this.center.setX(x);
	}
	
	public int getCenterY() {
		return this.center.getY();
	}
	
	public void setCenterY(int y) {
		this.center.setY(y);
		
	}
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI*Math.pow(getRadius(), 2);
	}
	
	public double getCircumference() {
		return Math.PI*2*getRadius();
	}
	
	public double distance(MyCircle anotherCircle) {
		MyPoint point = new MyPoint();
		return point.distance(getCenter(), anotherCircle.getCenter());
	}
	
	@Override
	public String toString() {
		MyPoint point = new MyPoint(getCenterX(), getCenterY());
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("[radius = ").append(radius).append(", center = ").append(point.toString()).append("]");
		
		return sBuilder.toString();
	}
}
