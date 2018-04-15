package Zajecia1103.Adnotacje.zadanko;

import java.lang.reflect.Method;

public class Demo {

	@MyDocumentation(author = "Andrzej", comment = "SIEMA")
	public void test() {
		System.out.println("uuuuuuuuuu");
	}
	
	public static void main(String[] args) throws Exception{
		Class<Demo> testClass = Demo.class;
		
		Method testMethod = Demo.class.getDeclaredMethod("test");
		MyDocumentation annotation = testMethod.getAnnotation(MyDocumentation.class);
		
		System.out.println(annotation.author());
		System.out.println(annotation.comment());
		
		System.out.println("Nazwa elementu adnotacji: " + testMethod.getName());
		System.out.println("Wartość elementu adnotacji: " + testMethod.getDefaultValue());
		
	}
}
