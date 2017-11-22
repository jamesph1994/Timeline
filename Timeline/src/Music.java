public class Music {

	private String artist;
	private String title;
	private String genre;
	private double duration;
	private int year;
	
	
	public Music(String initArtist, String initTitle, String initGenre, double initDuration, int initYear)
	{	
		artist =  initArtist;
		title= initTitle;
		genre = initGenre;
		duration = initDuration;
		year = initYear;
	}
	

	
	public boolean equals(Object object2) {
        if(artist == object2) { 
            return true;
        }
        else return false;
    }

    public boolean equals2(Object object2) {
        if(artist.equals(object2.equals(artist))) {
            return true;
        }
        else return false;
    }
	
	public String getArtist() {
		return artist;
	}
	
	public int hashCode()
	{
		return 31* artist.hashCode();
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	

	
	
}
