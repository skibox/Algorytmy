package Zajecia1103.Adnotacje.zadanko;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyDocumentation {
	String author() default "Robert";
	String comment() default "komentarz";
}
