package Zajecia1103.Refleksja.Zadanie;

import java.util.Date;

public class Document {
	private String[] authors = new String[10];
	private Date date;
	private int authorCount = 0;

	public Document(Date date) {
		this.date = date;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void addAuthor(String name) {
		if (authorCount < 10) {
			authors[authorCount] = name;
			authorCount++;

		}
	}

	public Date getDate() {
		return date;
	}
}
