package Zajecia1803.Lambdy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

import com.google.common.base.Function;
import com.google.common.base.Supplier;

public class Example {
	public static void main(String[] args) {
		Checker<Integer> isOddAnonymous = new Checker<Integer>() {

			@Override
			public boolean check(Integer object) {
				return object % 2 != 0;
			}
		};

		System.out.println(isOddAnonymous.check(123));
		System.out.println(isOddAnonymous.check(124));

		Checker<Integer> isOddLambda = object -> object % 2 != 0;

		System.out.println(isOddLambda.check(123));
		System.out.println(isOddLambda.check(124));

		Checker<Integer> isFiveOrNot = x -> x == 5;

		System.out.println(isFiveOrNot.check(6));

		UnaryOperator<Integer> square = x -> x * x;
		UnaryOperator<Integer> adding = x -> x + 20;
		Supplier<String> someString = () -> "some return value";
		BiConsumer<Integer, Long> multiplier = (Integer x, Long y) -> System.out.println(x * y);

		System.out.println(square.apply(12));
		System.out.println(adding.apply(10));

		Function<Integer, Long> multiline = x -> {
			if (x != null && x % 2 == 0)
				return (long) x * x;
			else
				return 123L;
		};
		
		Dzialania addDzialania = (x, y) -> x + y;
		Dzialania substractDzialania = (x, y) -> x - y;
		Dzialania multiDzialania = (x, y) -> x * y;
		Dzialania divDzialania = (x, y) -> x / y;
		Dzialania moduloDzialania = (x, y) -> x % y;
		
		System.out.println(addDzialania.calculate(5, 10));
		System.out.println(substractDzialania.calculate(5, 10));
		System.out.println(multiDzialania.calculate(5, 10));
		System.out.println(divDzialania.calculate(5, 10));
		System.out.println(moduloDzialania.calculate(5, 10));
		
		Object objectInstance1 = new Object();
		IntSupplier equalsMethodOnObject = objectInstance1::hashCode;
		System.out.println(equalsMethodOnObject.getAsInt());
		
		ToIntFunction<Object> hashCodeMethodOnClass = Object::hashCode;
		Object objectInstance2 = new Object();
		System.out.println(hashCodeMethodOnClass.applyAsInt(objectInstance2));
		
		Supplier<Object> objectCreator = Object::new;
		System.out.println(objectCreator.get());
	
		ArrayList<Integer> numbers = (ArrayList<Integer>) Arrays.asList(1,2,3,4);
		Consumer<Integer> integerConsumer = n -> System.out.println(n);
		numbers.forEach(System.out::println);
	
	
	
	
	}
}
