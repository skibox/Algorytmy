package Lista4.zadanie10;

public class Book {
	private String title;
	private Author author;
	private double price;
	private int qty = 0;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		return 	"Book[title = " + getTitle() + ", Author[name = " + this.getAuthor().getName() +
				", email = " + this.getAuthor().getEmail() + ", gender = " + this.getAuthor().getGender() +
				" ], price = " + getPrice() + ", qty = " + getQty() + "]";
	}
}
