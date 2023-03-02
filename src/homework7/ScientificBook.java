package homework7;

public class ScientificBook extends Book {

	private String scientificArea;

	public ScientificBook(String name, String author, int numPages, String scientificArea) {
		super(name, author, numPages);
		this.scientificArea = scientificArea;

	}

	@Override
	public String toString() {
		return "The book " + this.name + " by " + this.author + " with " + this.numOfPages + " pages in "
				+ this.scientificArea + " area.";
	}

}
