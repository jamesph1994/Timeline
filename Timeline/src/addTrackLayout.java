import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class addTrackLayout extends JFrame{
	
	private JTextField artist; 
	private JTextField trackTitle;
	private JTextField genre;
	private JTextField duration;
	private JTextField year;
	
	private String addArtist;
	private String addTitle;
	private String addGenre;
	private double addDuration;
	private float addYear;
	
	private static final long serialVersionUID = 1L;

	public addTrackLayout(String title){
		
		super (title);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new GridBagLayout());
		
		artist = new JTextField(15);
		trackTitle = new JTextField(15);
		genre = new JTextField(15);
		duration = new JTextField(15);
		year = new JTextField(15);
		
		JButton addButton = new JButton("Add");
		addButton.setActionCommand("add");
		
		
		//Actions for buttons.
				addButton.addActionListener(new ActionListener(){
					
					public void actionPerformed(ActionEvent e){
						
						addArtist = artist.getText();
						addTitle = trackTitle.getText();
						addGenre = genre.getText();
						addDuration = Double.parseDouble(duration.getText());
						addYear = Float.parseFloat(year.getText());
						
						Music m = new Music(addArtist, addTitle, addGenre, addDuration, addYear);
						
						if(TimelineLayout.music.contains(addArtist + addTitle + addGenre + addDuration + addYear)){
							
							JOptionPane.showMessageDialog(null,"already exists");
						}
						else{
							
							TimelineLayout.music.add(m);		
							JOptionPane.showMessageDialog(null,"added to db");
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
		
		setContentPane(contentPane);
		
	}
	
	public static void addWindow(){
		
		//create a new window from the time line class
				
				addTrackLayout add = new addTrackLayout("Add Track");
				//This tells Java we want to Exit the application on close
				add.setPreferredSize(new Dimension(800, 500));
			    add.pack();
			    add.setLocationRelativeTo(null);
			    add.setVisible(true);
					
	}
}
