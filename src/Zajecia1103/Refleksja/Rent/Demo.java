package Zajecia1103.Refleksja.Rent;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Demo {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception {
		Class rental = RentCar.class;
		System.out.println("Pełna nazwa klasy: " + rental.getName());
		System.out.println("Sama nazwa klasy: " + rental.getSimpleName());
		System.out.println("Kanoniczna nazwa klasy: " + rental.getCanonicalName());
		System.out.println("Nazwa pakietu: " + rental.getPackage());

		Constructor[] constructors = rental.getConstructors();
		System.out.println("Konstruktory: " + Arrays.toString(constructors));

		Constructor constructor = rental.getConstructor(Integer.TYPE);
		System.out.println(constructor.toString());

		RentCar rentCar = (RentCar) constructor.newInstance(455);

		Method[] allMethods = rental.getDeclaredMethods();
		System.out.println();
		for (Method method : allMethods)
			System.out.println(method.getName());
		
		Method oneMethod = rental.getMethod("computeRentalCost", Integer.TYPE);
		System.out.println(oneMethod);
		
		oneMethod.invoke(rentCar, 4);
		
		Class[] parTypes = oneMethod.getParameterTypes();
		System.out.println("Parameter tyes of computeRentalCost() are: " + Arrays.toString(parTypes));
		
		System.out.println();
		System.out.println();
		Field[] fields = rental.getFields();
		System.out.println("Public fields are: ");
		
		for(Field singleField : fields) {
			Field field = rental.getField(singleField.getName());
			String fieldName = field.getName();
			System.out.println("Fieldname is: " + fieldName);
			
			Object fieldType = field.getType();
			System.out.println("Type of field is: " + fieldType);
			
			Object value = field.get(rentCar);
			System.out.println("Value is: " + value);	
		}
		
		Field privateField = RentCar.class.getDeclaredField("type");
		
		String name = privateField.getName();
		System.out.println("One private fieldname is: " + name);
		
		privateField.setAccessible(true);
		String fieldValue = (String) privateField.get(rentCar);
		
		System.out.println("Fieldvalue = " + fieldValue);

		privateField.set(rentCar, "Small");
		System.out.println("Fieldvalue = " + privateField.get(rentCar));
		

	}
}
