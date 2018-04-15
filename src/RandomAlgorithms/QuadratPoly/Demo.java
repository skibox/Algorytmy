package RandomAlgorithms.QuadratPoly;

public class Demo {
	public static void main(String[] args) {
		QuadratPoly qPoly1 = new QuadratPoly(1, 4, -5);
		QuadratPoly qPoly2 = new QuadratPoly(1, 4, 4);
		
		
		//Funkcja
		System.out.println(qPoly1);
		//X1
		System.out.println("X1 = " + qPoly1.getX1());
		//X2
		System.out.println("X2 = " + qPoly1.getX2());
		//Delta
		System.out.println("Delta = " + qPoly1.getDelta());
		//P
		System.out.println("P = " + qPoly1.getP());
		//Q
		System.out.println("Q = " + qPoly1.getQ());
		//Range
		System.out.println(qPoly1.getRange());
		//Extremum
		System.out.print("Ekstremum [...] na x = [...] ");
		for (Double d : qPoly1.getExtremum()) {
			System.out.print(d + " ");
		}
		System.out.println();
		// > 0
		System.out.println(" >0 " + qPoly1.polynomialLargerThanZero());
		// >= 0
		System.out.println(" >=0 " + qPoly1.polynomialLargerOrEqualZero());
		//Solution
		System.out.println("Solution : " + qPoly1.solution());
		
		System.out.println(); System.out.println();
		
		//Funkcja

		System.out.println(qPoly2);
		//X1
		System.out.println("X1 = " + qPoly2.getX1());
		//X2
		System.out.println("X2 = " + qPoly2.getX2());
		//Delta
		System.out.println("Delta = " + qPoly2.getDelta());
		//P
		System.out.println("P = " + qPoly2.getP());
		//Q
		System.out.println("Q = " + qPoly2.getQ());
		//Range
		System.out.println(qPoly2.getRange());
		//Extremum
		System.out.print("Ekstremum [...] na x = [...] ");
		for (Double d : qPoly2.getExtremum()) {
			System.out.print(d + " ");
		}
		System.out.println();
		// > 0
		System.out.println(" >0 " + qPoly2.polynomialLargerThanZero());
		// >= 0
		System.out.println(" >=0 " + qPoly2.polynomialLargerOrEqualZero());
		//Solution
		System.out.println("Solution : " + qPoly2.solution());
		
	}
}
