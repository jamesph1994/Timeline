import java.util.Objects;

public class Music {
	private String artist;
	private String title;
	private String genre;
	private double duration;
	private int year;
	
	//Constructor for music objects.
	public Music(String initArtist, String initTitle, String initGenre, double initDuration, int initYear){	
		artist =  initArtist;
		title= initTitle;
		genre = initGenre;
		duration = initDuration;
		year = initYear;
	}
	
	//Method that pulls the title and question if it exists.
	@Override 
	public boolean equals(Object obj){
		if (this == obj) {
			return true;
		}else if (obj == null){
			return false;		        
		}else if (obj instanceof Music) {
			Music music = (Music) obj;
			
		if (music.getArtist().equals(this.getArtist()) && (music.getTitle().equals(this.getTitle())))		 {
				return true;
			}
		 }
			return false;
	}
	
	@Override
	public int hashCode(){ //Overrides the obects from being placed in a different buckets.
		int hash = 7;
		hash = 31 * hash + Objects.hashCode(this.getArtist());
		hash = 31 * hash + Objects.hashCode(this.getTitle());
		return hash;
	}
	
	public String getArtist() {    //Getters and Setters to call values.
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
