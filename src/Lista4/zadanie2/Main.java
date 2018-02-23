package Lista4.zadanie2;


public class Main {
	public static void main(String[] args) {
		Book[] books = new Book[2];
		
		books[0] = new Book();
		
		Author author1Book1 = new Author();
		author1Book1.setFirstName("Jan");
		author1Book1.setLastName("Kowalski");
		author1Book1.setHomeland("Polska");
		Author author2Book1 = new Author();
		author2Book1.setFirstName("John");
		author2Book1.setLastName("Wall");
		author2Book1.setHomeland("USA");
		
		books[0].addAuthorToList(author1Book1);
		books[0].addAuthorToList(author2Book1);
		books[0].setBookTitle("Ksi��ka1");
		books[0].setISBN("59023992592395");
		
// ======================================================================================================
		
		Author author1Book2 = new Author();
		author1Book2.setFirstName("A1");
		author1Book2.setLastName("B1");
		author1Book2.setHomeland("Polska");
		Author author2Book2 = new Author();
		author2Book2.setFirstName("A2");
		author2Book2.setLastName("B2");
		author2Book2.setHomeland("Niemcy");
		Author author3Book2 = new Author();
		author3Book2.setFirstName("A3");
		author3Book2.setLastName("B3");
		author3Book2.setHomeland("Anglia");
		
		books[1] = new Book();
		
		books[1].addAuthorToList(author1Book2);
		books[1].addAuthorToList(author2Book2);
		books[1].addAuthorToList(author3Book2);
		books[1].setBookTitle("Ksi��ka2");
		books[1].setISBN("65867395");
		
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].toString());
		}
	}
}
