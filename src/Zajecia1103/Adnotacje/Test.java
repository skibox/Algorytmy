package Zajecia1103.Adnotacje;

import java.lang.reflect.Method;

public class Test {
	@FirstAnnotation(id = "KAKA", wiek = 5)
	public void annotationTest() {
		System.out.println("Lorem ipsum");
	}
	
	public static void main(String[] args) throws Exception {
		Class<Test> testClazz = Test.class;
		
		Method annoMethod = Test.class.getDeclaredMethod("annotationTest");
		FirstAnnotation annotation = annoMethod.getAnnotation(FirstAnnotation.class);
		System.out.println();
		
		
	}
}
