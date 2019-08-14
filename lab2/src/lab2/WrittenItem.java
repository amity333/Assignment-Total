package lab2;

abstract class WrittenItem extends Item {
	private String Author;

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	WrittenItem() {
		Author = "Rishabh";
	}

	@Override
	public String toString() {
		return "WrittenItem [Author=" + Author + ", getIdentity_Number()=" + getIdentity_Number() + ", getTitle()="
				+ getTitle() + ", getNumber_of_copies()=" + getNumber_of_copies() + "]";
	}

}
