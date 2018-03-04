package Zajecia0403.WzorzecSingleton.LazySingleton;

public class Demo {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.printSomething();
	}
}
