package lab2;

public class Book extends WrittenItem {

	@Override
	public String toString() {
		return "Book [getAuthor()=" + getAuthor() + ", getIdentity_Number()=" + getIdentity_Number() + ", getTitle()="
				+ getTitle() + ", getNumber_of_copies()=" + getNumber_of_copies() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrittenItem T = new Book();
		// Book T=new Book();
		System.out.println(T);

	}

}
