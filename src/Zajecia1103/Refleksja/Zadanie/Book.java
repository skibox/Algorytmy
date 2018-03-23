package Zajecia1103.Refleksja.Zadanie;

import java.util.Date;

public class Book extends Document{
	private String title;
	
	public Book(String title, Date date) {
		super(date);
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
}
