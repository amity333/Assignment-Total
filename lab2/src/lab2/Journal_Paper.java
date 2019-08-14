package lab2;

public class Journal_Paper extends WrittenItem {
	private int year_published;

	Journal_Paper() {
		year_published = 2018;

	}

	public int getYear_published() {
		return year_published;
	}

	public void setYear_published(int year_published) {
		this.year_published = year_published;
	}

	@Override
	public String toString() {
		return "Journal_Paper [year_published=" + year_published + ", getAuthor()=" + getAuthor()
				+ ", getIdentity_Number()=" + getIdentity_Number() + ", getTitle()=" + getTitle()
				+ ", getNumber_of_copies()=" + getNumber_of_copies() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Journal_Paper W = new Journal_Paper();
		System.out.println(W);

	}

}
