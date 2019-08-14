package lab2;

public class Video extends MediaItem {
	private String Director;
	private String Genre;
	private int Year_Released;

	Video() {
		Director = "ABD";
		Genre = "Horror";
		Year_Released = 2012;

	}

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public int getYear_Released() {
		return Year_Released;
	}

	public void setYear_Released(int year_Released) {
		Year_Released = year_Released;
	}

	@Override
	public String toString() {
		return "Video [Director=" + Director + ", Genre=" + Genre + ", Year_Released=" + Year_Released
				+ ", getRuntime()=" + getRuntime() + ", getIdentity_Number()=" + getIdentity_Number() + ", getTitle()="
				+ getTitle() + ", getNumber_of_copies()=" + getNumber_of_copies() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Video MT = new Video();
		System.out.println(MT);

	}

}
