package lab2;

public abstract class MediaItem extends Item {
	private int runtime;

	MediaItem() {
		runtime = 143;
	}

	@Override
	public String toString() {
		return "MediaItem [runtime=" + runtime + ", getIdentity_Number()=" + getIdentity_Number() + ", getTitle()="
				+ getTitle() + ", getNumber_of_copies()=" + getNumber_of_copies() + "]";
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

}
