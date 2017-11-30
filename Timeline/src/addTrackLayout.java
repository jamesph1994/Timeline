import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class addTrackLayout extends JFrame{
	
	private JTextField artist;     //Initialising textfields & combobox.
	private JTextField trackTitle;
	private JComboBox<String> genre;
	private JTextField duration;
	private JTextField year;
	
	private JLabel artistLabel;  //Initialising field Labels.
	private JLabel titleLabel;
	private JLabel genreLabel;
	private JLabel durationLabel;
	private JLabel yearLabel;
	private JLabel addLabel;
	
	private String addArtist;  //Initialising types.
	private String addTitle;
	private String addGenre;
	private double addDuration;
	private int addYear;
	
	private static final long serialVersionUID = 1L;
	
	public static void addWindow(){
		//create a new window from the time line class
			addTrackLayout add = new addTrackLayout("Add Track");
			//This tells Java we want to Exit the application on close
			add.setPreferredSize(new Dimension(700, 550));
		    add.pack();
		    add.setLocationRelativeTo(null);
		    add.setVisible(true);				
			}

	public addTrackLayout(String title){	
		super (title);
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new GridBagLayout());
		String[] genreString = {"Pop", "Rock", "Jazz", "Country", "Rap", "Dance"}; //Array with strings.
		
		addLabel = new JLabel("Add Record");
		artistLabel = new JLabel("Artist Name:");
		titleLabel = new JLabel("Track Title:");
		genreLabel = new JLabel("Genre:");
		durationLabel = new JLabel("Duration:");
		yearLabel = new JLabel("Release Year:");
		
		artist = new JTextField(15);
		trackTitle = new JTextField(15);
		genre = new JComboBox<String>(genreString);
		duration = new JTextField(15);
		year = new JTextField(15);
		
		ArrayList<Music> music = TimelineLayout.music;
		
		JButton addButton = new JButton("Add");
		addButton.setActionCommand("add");
	   
			//Actions for buttons.
			addButton.addActionListener(new ActionListener(){
					
					public void actionPerformed(ActionEvent e){
						addArtist = artist.getText();  //Storing text in to variable
						addTitle = trackTitle.getText();
						addGenre = (String) genre.getSelectedItem();
						try{
							addDuration = Double.parseDouble(duration.getText()); 
						}catch(Exception g){
							g.getMessage();  //Catching exception if field is null
						}
						try{
							addYear = Integer.parseInt(year.getText()); 
						}catch(Exception g){
							g.getMessage();     //Catching exception if field is null
						}
						
						Music m = new Music(addArtist, addTitle, addGenre, addDuration, addYear); //Create new music object.
								
						if(addArtist.isEmpty() || addTitle.isEmpty() || addGenre.isEmpty() || duration.getText().isEmpty() || year.getText().isEmpty()){
							JOptionPane.showMessageDialog(null, "Please fill in all empty fields."); //if textboxes empty, prompt user.
						}
						else if (addYear <= 1959 || addYear >= 2011 ){ //Cannot accept years earlier than Eras on timeline.
							JOptionPane.showMessageDialog(null, "Enter a year between 1960 - 2010");
						}
						else if (!(music.contains(m))){ //If music arraylist does not contain object, add. Using override and hashmap in Music class.
							music.add(m);
							JOptionPane.showMessageDialog(null, "Track added");			
						}
						else{
							JOptionPane.showMessageDialog(null, "Track already exists");
						}	
					}		
				});
		
		//set a background colour for the window
		contentPane.setBackground(Color.WHITE);
				
		//Position labels and buttons using grid
		GridBagConstraints c = new GridBagConstraints();
				
		c.fill = GridBagConstraints.PAGE_START;
		
		c.gridx = 2;
		c.gridy = 0;
		c.insets = new Insets(20, 10, 20, 40);
		c.gridwidth = 2;
		contentPane.add(addLabel, c);
		
		c.gridx = 2;
		c.gridy = 1;
		c.insets = new Insets(20, 10, 20, 40);
		c.gridwidth = 2;
		contentPane.add(artist, c);
		
		c.gridx = 2;
		c.gridy = 2;
		c.insets = new Insets(20, 10, 20, 40);
		c.gridwidth = 2;
		contentPane.add(trackTitle, c);
		
		c.gridx = 2;
		c.gridy = 3;
		c.insets = new Insets(20, 10, 20, 40);
		c.gridwidth = 2;
		contentPane.add(genre, c);
		
		c.gridx = 2;
		c.gridy = 4;
		c.insets = new Insets(20, 10, 20, 40);
		c.gridwidth = 2;
		contentPane.add(duration, c);
		
		c.gridx = 2;
		c.gridy = 5;
		c.insets = new Insets(20, 10, 20, 40);
		c.gridwidth = 2;
		contentPane.add(year, c);
		
		c.gridx = 2;
		c.gridy = 6;
		c.insets = new Insets(20, 10, 20, 40);
		c.gridwidth = 2;
		contentPane.add(addButton, c);
		
		c.gridx = 1;
		c.gridy = 1;
		c.insets = new Insets(20, 10, 20, 40);
		c.gridwidth = 1;
		contentPane.add(artistLabel, c);
		
		c.gridx = 1;
		c.gridy = 2;
		c.insets = new Insets(20, 10, 20, 40);
		c.gridwidth = 1;
		contentPane.add(titleLabel, c);
		
		c.gridx = 1;
		c.gridy = 3;
		c.insets = new Insets(20, 10, 20, 40);
		c.gridwidth = 1;
		contentPane.add(genreLabel, c);
		
		c.gridx = 1;
		c.gridy = 4;
		c.insets = new Insets(20, 10, 20, 40);
		c.gridwidth = 1;
		contentPane.add(durationLabel, c);
		
		c.gridx = 1;
		c.gridy = 5;
		c.insets = new Insets(20, 10, 20, 40);
		c.gridwidth = 1;
		contentPane.add(yearLabel, c);
		
		setContentPane(contentPane);
	}
}

