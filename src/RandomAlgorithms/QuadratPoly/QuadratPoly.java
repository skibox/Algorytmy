package RandomAlgorithms.QuadratPoly;

public class QuadratPoly {
	private int 	a;
	private int 	b; 
	private int 	c;
	private double 	delta;
	private int[] values = new int[3];
	
	public QuadratPoly(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c; 
		
		values[0] = a;
		values[1] = b;
		values[2] = c;
	}
	
	public double value(double x) {
		return a * x * x + b * x + c;
	}

	public double getDelta() {
		return b * b - 4 * a * c;
	}

	public double sgnDelta() {
		return Math.signum(getDelta());
	}

	public double getX1() {
		return (-b + Math.sqrt(getDelta())) / 2 * a;
	}

	public double getX2() {
		return (-b - Math.sqrt(getDelta())) / 2 * a;
	}

	public double getP() {
		return -(b / 2 * a);
	}

	public double getQ() {
		return -(getDelta() / 4 * a);
	}
	
	public boolean isAPositive() {
		return (a > 0);
	}
	
	public String getRange() {
		if(isAPositive()) return "[" + getQ() + ", inf)";
		else return "(-inf, " + getQ() + "]";
	}
	
	public int[] getDerivativeValues() {
		int[] output = new int[values.length - 1];
		output[0] = 2*a;
		output[1] = b;
		
		return output;
	}
	
	public double[] getExtremum() {
		double[] extremum = new double[2];
		int[] derivative = getDerivativeValues();
		extremum[1] = -derivative[1]/derivative[0];
		extremum[0] = value(extremum[1]);
		
		return extremum;
		
	}
	
	public String getVertex() {
		return "[p = " + getP() + ", q = " + getQ() + "]";
	}
	
	public String polynomialLargerThanZero() {
		if(getDelta() > 0) return "(-inf, " + getX2() + ") u (" + getX1() + ", inf)";
		else if (getDelta() == 0) return "inf / " + getX1();
		else return "-----";
	}
	
	public String polynomialLargerOrEqualZero() {
		if(getDelta() > 0) return "(-inf, " + getX2() + "] u [" + getX1() + ", inf)";
		else if (getDelta() == 0) return "inf";
		else return "-----";
	}
	
	public QuadratPoly mult(int multi) {
		return new QuadratPoly(this.a * multi, this.b*multi, this.c*multi);
	}
	
	public String solution() {
		if(getDelta() > 0) return "{" + getX2() + ","+ getX1() + "}";
		else if(getDelta() == 0) return "{" + getX1() + "}";
		else return "{}";
	}
	
	public QuadratPoly add(QuadratPoly qPoly) {
		return new QuadratPoly(this.a + qPoly.a, this.b + qPoly.b, this.c+qPoly.c);
	}
	
	public QuadratPoly sub(QuadratPoly qPoly) {
		return new QuadratPoly(this.a - qPoly.a, this.b - qPoly.b, this.c-qPoly.c);
	}
	
	@Override
	public String toString() {
		StringBuilder sBuilder = new StringBuilder();
		int counter = 0;
		for (int i : values) {
			if(counter > 0 && i > 0) sBuilder.append("+");
			if(counter != 2) {
				if(i == 0) {}
				else if(i == 1) 	sBuilder.append("x");
				else if(i == -1) 	sBuilder.append("-x");
				else 				sBuilder.append(i + "x");
				
				if(counter == 0 && i != 0) 	sBuilder.append("^2");
				counter++;
			}
			else sBuilder.append(i);
		}
		
		return sBuilder.toString();
	}
	
	
	
}
