package homework7;

public class Book {
	protected String name;
	protected String author;
	protected int numOfPages;

	public Book(String name, String author, int numOfPages) {
		this.name = name;
		this.author = author;
		this.numOfPages = numOfPages;
	}

	@Override
	public String toString() {
		return "The book " + this.name + " by " + this.author + " with " + this.numOfPages + " pages.";
	}
}
