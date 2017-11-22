import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.ArrayList;

public class TimelineLayout extends JFrame{
	
	private static final long	serialVersionUID = 1L;
	
	private JLabel timelineLabel;
	
	static ArrayList<Music> music = new ArrayList<>();
	

	public TimelineLayout(String title){
		
		super(title);
		
		music.add(new Music("Usher", "U got it bad", "Pop", 3.01, 2003));
		music.add(new Music("Coldplay", "Viva la vida", "Rock n Roll", 2.56, 2001));
		music.add(new Music("Nickleback", "Photograph", "Rock", 2.20, 2005));
		music.add(new Music("Nickleback", "Photograph", "Rock", 2.00, 1993));
		music.add(new Music("Nickleback", "Photograph", "Rock", 1.9, 1994));
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new GridBagLayout());
		
		setContentPane(contentPane);
		
		timelineLabel = new JLabel("Music Era Timeline");
		
		JButton sixtiesButton = new JButton("60s");
		sixtiesButton.setActionCommand("60s");
		
		JButton seventiesButton = new JButton("70s");
		seventiesButton.setActionCommand("70s");

		JButton eightiesButton = new JButton("80s");
		eightiesButton.setActionCommand("80s");
		
		JButton ninetiesButton = new JButton("90s");
		ninetiesButton.setActionCommand("90s");
		
		JButton twentiesButton = new JButton("00s");
		twentiesButton.setActionCommand("00s");
		
		JButton addButton = new JButton("Add Song");
		addButton.setActionCommand("Add Song");
		
		JButton addEraButton = new JButton("Add Era");
		addEraButton.setActionCommand("Add Era");
		
		JButton saveButton = new JButton("Save");
		saveButton.setActionCommand("Save");
		
		JButton loadButton = new JButton("Load");
		loadButton.setActionCommand("Load");
			
			
		sixtiesButton.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				
				Decades.sixtiesWindow();
				
			}
		});
		
		seventiesButton.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				
				Decades.seventiesWindow();
	
			}
		});
		
		eightiesButton.addActionListener(new ActionListener(){
	
			public void actionPerformed(ActionEvent e){
		
				Decades.eightiesWindow();
			}
		});
		

		ninetiesButton.addActionListener(new ActionListener(){
	
			public void actionPerformed(ActionEvent e){
	
				Decades.ninetiesWindow();

			}
		});

		twentiesButton.addActionListener(new ActionListener(){
	
			public void actionPerformed(ActionEvent e){
		
				
				Decades.noughtiesWindow();
				
				
			}
		});
		
		addButton.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				
				addTrackLayout.addWindow();
				
			}
		});
		
		//set background colour
		contentPane.setBackground(Color.WHITE);
		
		//creating a grid
		GridBagConstraints c = new GridBagConstraints();
		
		//set grid horizontal 
		c.fill = GridBagConstraints.HORIZONTAL;
		
		//position buttons 
		c.gridx = 1;
		c.gridy = 2;
		c.insets = new Insets(10, 5, 10, 5);
		contentPane.add(sixtiesButton, c);
		
		c.gridx = 2;
		c.gridy = 5;
		contentPane.add(seventiesButton, c);
		
		c.gridx = 3;
		c.gridy = 2;
		contentPane.add(eightiesButton, c);
		
		c.gridx = 4;
		c.gridy = 5;
		contentPane.add(ninetiesButton, c);
		
		c.gridx = 5;
		c.gridy = 2;
		contentPane.add(twentiesButton, c);
		
		c.fill = GridBagConstraints.CENTER;
		c.gridx = 2;
		c.gridy = 0;
		c.gridwidth = 3;
		c.insets = new Insets(10, 5, 40, 5);
		contentPane.add(timelineLabel, c);
		
		c.gridx = 1;
		c.gridy = 7;
		c.gridwidth = 2;
		c.insets = new Insets(70, 5, 10, 5);
		contentPane.add(addButton, c);
		
		c.gridx = 4;
		c.gridy = 7;
		c.gridwidth = 2;
		c.insets = new Insets(70, 5, 10, 5);
		contentPane.add(addEraButton, c);
		
		c.gridx = 1;
		c.gridy = 8;
		c.gridwidth = 2;
		c.insets = new Insets(15, 5, 10, 5);
		contentPane.add(saveButton, c);
		
		c.gridx = 4;
		c.gridy = 8;
		c.gridwidth = 2;
		c.insets = new Insets(15, 5, 10, 5);
		contentPane.add(loadButton, c);
		
		
	}
	


}
