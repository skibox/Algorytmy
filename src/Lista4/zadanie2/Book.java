package Lista4.zadanie2;


import java.util.ArrayList;

public class Book {
	private ArrayList<Author> author = new ArrayList<Author>();
	private String bookTitle;
	private String ISBN;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String bookTitle, String ISBN) {
		setBookTitle(bookTitle);
		setISBN(ISBN);
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public ArrayList<Author> getAuthor() {
		return author;
	}

	public void setAuthor(ArrayList<Author> author) {
		this.author = author;
	}

	public void addAuthorToList(Author addedAuthor) {
		author.add(addedAuthor);
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder("Tytu�: " + getBookTitle() + " Autorzy: ");
		
		for(int i = 0; i < author.size() ; i++) {
			output.append(author.get(i).getFirstName());
			output.append(", ");
			output.append(author.get(i).getLastName());
			output.append(", ");
			output.append(author.get(i).getHomeland());
			output.append(" ");	
			
		}
		output.append("ISBN: " + getISBN());
		
		return output.toString();
	}
}
