package Zajecia1103.Refleksja.Zadanie;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

public class Demo {
	
	@SuppressWarnings({ "unused", "unchecked", "rawtypes" })
	public static void main(String[] args) throws Exception {
		Class bookDefinition = Book.class;
		
		Constructor bookConstructor = bookDefinition.getConstructor(String.class, Date.class);
		
		Field[] bookFields = bookDefinition.getDeclaredFields();
		
		Book bookObject = (Book) bookConstructor.newInstance("Tytul1", new Date());
		
		System.out.println();
		for (Field field : bookFields) {
			System.out.println(field.getName());
		}
		
		Field title = bookDefinition.getDeclaredField("title");
		title.setAccessible(true);
		
		title.set(bookObject, "Jednak nie title");

		Method getTitle = bookDefinition.getDeclaredMethod("getTitle");
		
		System.out.println(getTitle.invoke(bookObject));
		System.out.println();
		System.out.println();
		
		Class emailDefinition = Email.class;
		
		Constructor emailConstructor = emailDefinition.getConstructor(String.class, String[].class, Date.class);
		
		Email emailObject = (Email) emailConstructor.newInstance("Temat", new String[]{"Stefan", "Andrzej"}, new Date());
		
		Method addAutor = emailDefinition.getMethod("addAuthor", String.class);
		
		addAutor.invoke(emailObject, "ASDASD");
		addAutor.invoke(emailObject, "Aasdasdsad");
		addAutor.invoke(emailObject, "Andngdngsdnd");
		
		Method getAuthors = emailDefinition.getSuperclass().getMethod("getAuthors");
		
		String[] authors = (String[]) getAuthors.invoke(emailObject);
		
		for (String string : authors) {
			System.out.println(string);
		}
		
		String[] doPodmiany = {"1", "2", "3", "4"};
		Field autorzy = emailDefinition.getSuperclass().getDeclaredField("authors");
		autorzy.setAccessible(true);
		
		autorzy.set(emailObject, doPodmiany);
		
		authors = (String[]) getAuthors.invoke(emailObject);
		System.out.println();
		System.out.println();
		for (String string : authors) {
			System.out.println(string);
		}
		
		
		
		
	}
}
