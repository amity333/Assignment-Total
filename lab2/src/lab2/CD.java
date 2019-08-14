package lab2;

public class CD extends MediaItem {
	private String Artist;
	private String Genre;

	CD() {
		Artist = "abc";
		Genre = "xyz";
	}

	public String getArtist() {
		return Artist;
	}

	public void setArtist(String artist) {
		Artist = artist;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	@Override
	public String toString() {
		return "CD [Artist=" + Artist + ", Genre=" + Genre + ", getRuntime()=" + getRuntime()
				+ ", getIdentity_Number()=" + getIdentity_Number() + ", getTitle()=" + getTitle()
				+ ", getNumber_of_copies()=" + getNumber_of_copies() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CD c = new CD();
		System.out.println(c);

	}

}
