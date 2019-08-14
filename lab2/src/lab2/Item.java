package lab2;

public abstract class Item {
	private int identity_Number;
	private String title;
	private int number_of_copies;

	public Item(int identity_Number, String title, int number_of_copies) {
		super();
		this.identity_Number = identity_Number;
		this.title = title;
		this.number_of_copies = number_of_copies;
	}

	Item() {
		identity_Number = 142;
		title = "Wings";
		number_of_copies = 100;

	}

	public int getIdentity_Number() {
		return identity_Number;
	}

	public void setIdentity_Number(int identity_Number) {
		this.identity_Number = identity_Number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumber_of_copies() {
		return number_of_copies;
	}

	public void setNumber_of_copies(int number_of_copies) {
		this.number_of_copies = number_of_copies;
	}

}
