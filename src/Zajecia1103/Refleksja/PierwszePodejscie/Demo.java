package Zajecia1103.Refleksja.PierwszePodejscie;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {
	public static void main(String[] args) {
		try {
			Class<?> definicjaPies = Class.forName("Zajecia1103.Refleksja.Pies");

			Pies refleksyjnyBurek = (Pies) definicjaPies.newInstance();
			
			Class<?>[] argTypes = { String.class };
			//metody
			Method method1 = definicjaPies.getMethod("setImie", argTypes);
			Object[] data = { "Burek" };
			method1.invoke(refleksyjnyBurek, data);
			Method method2 = definicjaPies.getMethod("szczekaj");
			method2.invoke(null);
			
			
			
			
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
