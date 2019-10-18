// Yunning ZHOU, MACS. A Movie class.
package cinemaManagement;

public class Movie implements Comparable{
	private String title;
	private int length;

	public Movie(String title, int length) {
		this.title = title;
		this.length = length;
	}

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String toString() {
		String s = "Title: " + title + ", Length: " + length;
		return s;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return title.compareTo(((Movie) arg0).getTitle());
	}

}
