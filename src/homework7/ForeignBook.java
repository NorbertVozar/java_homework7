package homework7;

public class ForeignBook extends Book {

	private String language;

	public ForeignBook(String name, String author, int numOfPages, String language) {
		super(name, author, numOfPages);
		this.language = language;
	}

	public ForeignBook(String name, String author, int numOfPages) {
		super(name, author, numOfPages);
		this.language = "English";
	}

	@Override
	public String toString() {
		return "The book " + this.name + " by " + this.author + " with " + this.numOfPages + " pages in "
				+ this.language + " language.";
	}

}
