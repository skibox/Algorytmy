package Zajecia1103.KlasyWew;

public class Demo {
	public static void main(String[] args) {
		OuterClass oClass = new OuterClass();
		OuterClass.InnerClass iClass = oClass.instantiate();
	}
}
