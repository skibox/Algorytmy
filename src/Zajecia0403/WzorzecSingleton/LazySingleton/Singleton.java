package Zajecia0403.WzorzecSingleton.LazySingleton;

public class Singleton {
	private static Singleton uniqueInstance;
	
	private Singleton() {
		
	}
	
	//logic
	
	public static synchronized Singleton getInstance() {
		if(uniqueInstance == null)
			uniqueInstance = new Singleton();
		
		return uniqueInstance;
	}
	
	public void printSomething() {
		System.out.println("No jestem.");
	}
	
}
