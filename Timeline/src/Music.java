public class Music {

	private String artist;
	private String title;
	private String genre;
	private double duration;
	private float year;
	//private List<Integer> list;
	
	
	
	
	public Music(String initArtist, String initTitle, String initGenre, double initDuration, float initYear)
	{	
		artist =  initArtist;
		title= initTitle;
		genre = initGenre;
		duration = initDuration;
		year = initYear;
	}
	
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public float getYear() {
		return year;
	}

	public void setYear(float year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	

	
	
}
