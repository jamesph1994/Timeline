
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class musicLayout extends JFrame{

	private static final long	serialVersionUID = 1L;
	
	//declaring JLabels
	private JLabel eraLabel;
	private JLabel artistLabel;
	private JLabel titleLabel;
	private JLabel genreLabel;
	private JLabel durationLabel;
	private JLabel yearLabel;
	private int pos = 0; 
	ArrayList<Music> era = TimelineLayout.myMusicList;
	ArrayList<Music> songs;
	
	
	public void navigateRecords(int i){

		artistLabel.setText("Artist: " + songs.get(i).getArtist());
		titleLabel.setText("Title: " + songs.get(i).getTitle());
		genreLabel.setText("Genre: " + songs.get(i).getGenre());
		durationLabel.setText("Duration: " + Double.toString(songs.get(i).getDuration()));
		yearLabel.setText("Year: " + songs.get(i).getYear());
	}
	
	public void sixtiesMusic(String timePeriod)
	{
		songs = new ArrayList<>();
		try
		{
			
		
		for (Music song:era)
		{
			if (song.getYear() >= 1960 && song.getYear() <= 1969)
			{
				songs.add(song);
			}	
		}
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "No records exist in this era");
		}
	}
	
	public void seventiesMusic(String timePeriod)
	{
		songs = new ArrayList<>();
		
		for (Music song:era)
		{
			if (song.getYear() >= 1970 && song.getYear() <= 1979)
			{
				songs.add(song);
			}	
		}
	}
	
	public void eightiesMusic(String timePeriod)
	{
		songs = new ArrayList<>();
		
		for (Music song:era)
		{
			if (song.getYear() >= 1980 && song.getYear() <= 1989)
			{
				songs.add(song);
			}	
		}
	}
	
	public void ninetiesMusic(String timePeriod)
	{
		songs = new ArrayList<>();
		
		for (Music song:era)
		{
			if (song.getYear() >= 1990 && song.getYear() <= 1999)
			{
				songs.add(song);
			}	
		}
	}
	
	public void noughtiesMusic(String timePeriod)
	{
		songs = new ArrayList<>();
		
		for (Music song:era)
		{
			if (song.getYear() >= 2000 && song.getYear() <= 2009)
			{
				songs.add(song);
			}	
		}
	}
	
	
	public musicLayout(String title){
		
		super (title); 
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new GridBagLayout());
		;
		
			//If the windows title is Sixties, then run this statement.
			if(title.equals("Sixties")){
			
				sixtiesMusic("60");
				try
				{
				
				// Are there actually any 60s songs.	
				eraLabel = new JLabel("Sixties");
				artistLabel = new JLabel("Artist: " +songs.get(0).getArtist());
				titleLabel = new JLabel("Title: " +songs.get(0).getTitle());
				genreLabel = new JLabel("Genre: " + songs.get(0).getGenre());
				durationLabel = new JLabel("Duration: " + Double.toString(songs.get(0).getDuration()));
				yearLabel = new JLabel("Year: " + songs.get(0).getYear());
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, "nothing exists");
				}
			}
			
			else if(title.equals("Seventies")){
						
				seventiesMusic("70");
				
				// Are there actually any 70s songs.	
				eraLabel = new JLabel("Seventies");
				artistLabel = new JLabel("Artist: " +songs.get(0).getArtist());
				titleLabel = new JLabel("Title: " +songs.get(0).getTitle());
				genreLabel = new JLabel("Genre: " + songs.get(0).getGenre());
				durationLabel = new JLabel("Duration: " + Double.toString(songs.get(0).getDuration()));
				yearLabel = new JLabel("Year: " + songs.get(0).getYear());
				}
				
			else if(title.equals("Eighties")){
						
				eightiesMusic("80");
				
				// Are there actually any 80s songs.	
				eraLabel = new JLabel("Eighties");
				artistLabel = new JLabel("Artist: " +songs.get(0).getArtist());
				titleLabel = new JLabel("Title: " +songs.get(0).getTitle());
				genreLabel = new JLabel("Genre: " + songs.get(0).getGenre());
				durationLabel = new JLabel("Duration: " + Double.toString(songs.get(0).getDuration()));
				yearLabel = new JLabel("Year: " + songs.get(0).getYear());
				}
				
				
			else if(title.equals("Nineties")){
				
				ninetiesMusic("90");
						
					// Are there actually any 90s songs.
					eraLabel = new JLabel("Nineties");
					artistLabel = new JLabel("Artist: " +songs.get(0).getArtist());
					titleLabel = new JLabel("Title: " +songs.get(0).getTitle());
					genreLabel = new JLabel("Genre: " + songs.get(0).getGenre());
					durationLabel = new JLabel("Duration: " + Double.toString(songs.get(0).getDuration()));
					yearLabel = new JLabel("Year: " + songs.get(0).getYear());
					}
				
			else if(title.equals("Noughties")){
						
				noughtiesMusic("00");
				
					// Are there actually any 00s songs.	
					eraLabel = new JLabel("Noughties");
					artistLabel = new JLabel("Artist: " +songs.get(0).getArtist());
					titleLabel = new JLabel("Title: " +songs.get(0).getTitle());
					genreLabel = new JLabel("Genre: " + songs.get(0).getGenre());
					durationLabel = new JLabel("Duration: " + Double.toString(songs.get(0).getDuration()));
					yearLabel = new JLabel("Year: " + songs.get(0).getYear());
					}
				
			else{
					JOptionPane.showMessageDialog(null, "No records in Era");
				}
			
		

		//creating buttons
		JButton navRightButton = new JButton(">");
		navRightButton.setActionCommand("Next Record");
		
		JButton navLeftButton = new JButton("<");
		navLeftButton.setActionCommand("Previous Record");

		JButton navLastButton = new JButton(">>");
		navLastButton.setActionCommand("Last Record");
		
		JButton navStartButton = new JButton("<<");
		navStartButton.setActionCommand("First Record");
		
		JButton returnButton = new JButton("Return");
		returnButton.setActionCommand("Return");
		
		
		//Actions for buttons.
		navRightButton.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				
				pos++;
				
				if(pos < songs.size()){
					navigateRecords(pos);
				}
				else{
					pos = songs.size() - 1;
					navigateRecords(pos);
					JOptionPane.showMessageDialog(null, "No more songs");
				}
			}
		});
		
		navLeftButton.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				
				pos --;
				
				if(pos > 0){
					navigateRecords(pos);
				}
				else{
					pos = 0;
					navigateRecords(pos);
					JOptionPane.showMessageDialog(null, "No more songs");
				}
			}
		});

		
		navStartButton.addActionListener(new ActionListener(){
	
			public void actionPerformed(ActionEvent e){
				
				//navigate to the first element of the arrayList
				navigateRecords(0);
			}
		});

		navLastButton.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
		
				pos = era.size() - 1;
				navigateRecords(pos);
			}
		});
		
		returnButton.addActionListener(new ActionListener(){
	
			public void actionPerformed(ActionEvent e){
		

			}
		});
		
		//set a background colour for the window
		contentPane.setBackground(Color.WHITE);
		
		//Position labels and buttons using grid
		GridBagConstraints c = new GridBagConstraints();
		
		c.fill = GridBagConstraints.PAGE_START;
		c.gridx = 2;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 20, 15);
		c.gridwidth = 2;
		contentPane.add(eraLabel, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 5;
		contentPane.add(artistLabel, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 5;
		contentPane.add(titleLabel, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 4;
		c.gridwidth = 5;
		contentPane.add(durationLabel, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 5;
		c.gridwidth = 5;
		contentPane.add(genreLabel, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 6;
		c.gridwidth = 5;
		contentPane.add(yearLabel, c);
		
	
		c.gridx = 2;
		c.gridy = 7;
		c.ipady = 0;   
		c.gridwidth = 1;
		contentPane.add(navRightButton, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 7;
		c.ipady = 0;       //reset to default
		c.gridwidth = 1;
		contentPane.add(navLeftButton, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.ipady = 0;       //reset to default
		c.gridwidth = 1;
		c.gridy = 7;
		contentPane.add(navLastButton, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 7;
		c.ipady = 0;       //reset to default
		c.gridwidth = 1;
		contentPane.add(navStartButton, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.PAGE_END;
		c.gridx = 11;
		c.gridy = 8;
		contentPane.add(returnButton, c);
		
		
		setContentPane(contentPane);
		
	}
	
	
}
