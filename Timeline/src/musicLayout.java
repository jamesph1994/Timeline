import java.awt.event.ActionEvent;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class musicLayout extends JFrame{

	private static final long	serialVersionUID = 1L;
	
	private JLabel eraLabel;
	private JLabel artistLabel;
	private JLabel titleLabel;
	private JLabel genreLabel;
	private JLabel durationLabel;
	private JLabel yearLabel;
	
	public musicLayout(String title){
		
		super (title);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new GridBagLayout());
		
		
		//d JLabels
		eraLabel = new JLabel("MUSIC ERA");
		artistLabel = new JLabel("Artist: " +TimelineLayout.music.get(0).getArtist());
		titleLabel = new JLabel("Title: " +TimelineLayout.music.get(0).getTitle());
		genreLabel = new JLabel("Genre: " + TimelineLayout.music.get(0).getGenre());
		durationLabel = new JLabel("Duration: " + Double.toString(TimelineLayout.music.get(0).getDuration()));
		yearLabel = new JLabel("Year: " + Float.toString(TimelineLayout.music.get(0).getYear()));
		
		
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
				
				for(int i=0; i < TimelineLayout.music.size(); i++){
					int next = i+1;
					System.out.println(TimelineLayout.music.get(next).getArtist());
				//	navigateRecords();
				}
			}
		});
		
		navRightButton.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				
				for(int i=0; i < TimelineLayout.music.size(); i++){
					i++;
					navigateRecords();
				}
			}
		});

		navRightButton.addActionListener(new ActionListener(){
	
			public void actionPerformed(ActionEvent e){
		

			}
		});

		navRightButton.addActionListener(new ActionListener(){
	
			public void actionPerformed(ActionEvent e){
		

			}
		});

		navRightButton.addActionListener(new ActionListener(){
	
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
		c.insets = new Insets(20, 10, 20, 40);
		c.gridwidth = 2;
		contentPane.add(eraLabel, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 2;
		contentPane.add(artistLabel, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 2;
		contentPane.add(titleLabel, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 4;
		c.gridwidth = 2;
		contentPane.add(durationLabel, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 5;
		c.gridwidth = 2;
		contentPane.add(genreLabel, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 6;
		c.gridwidth = 2;
		contentPane.add(yearLabel, c);
		
		GridBagConstraints c2 = new GridBagConstraints();
		
		
		c2.fill = GridBagConstraints.HORIZONTAL;
		c2.gridheight = 5;
		
		c2.gridx = 7;
		c2.gridy = 2;
		c2.insets = new Insets(20, 10, 20, 5);
		contentPane.add(navRightButton, c2);
		
		c2.fill = GridBagConstraints.HORIZONTAL;
		c2.gridx = 5;
		c2.gridy = 2;
		contentPane.add(navLeftButton, c2);
		
		c2.fill = GridBagConstraints.HORIZONTAL;
		c2.gridx = 8;
		c2.gridy = 2;
		contentPane.add(navLastButton, c2);
		
		c2.fill = GridBagConstraints.HORIZONTAL;
		c2.gridx = 4;
		c2.gridy = 2;
		contentPane.add(navStartButton, c2);
		
		c2.fill = GridBagConstraints.HORIZONTAL;
		c2.gridx = 9;
		c2.gridy = 6;
		contentPane.add(returnButton, c2);
		
		
		setContentPane(contentPane);
		
	}
	public void navigateRecords(){
		for(int i=0; i < TimelineLayout.music.size(); i++){
		eraLabel = new JLabel("MUSIC ERA");
		artistLabel = new JLabel("Artist: " +TimelineLayout.music.get(i).getArtist());
		titleLabel = new JLabel("Title: " +TimelineLayout.music.get(i).getTitle());
		genreLabel = new JLabel("Genre: " + TimelineLayout.music.get(i).getGenre());
		durationLabel = new JLabel("Duration: " + Double.toString(TimelineLayout.music.get(i).getDuration()));
		yearLabel = new JLabel("Year: " + Float.toString(TimelineLayout.music.get(i).getYear()));
		}
		}
	
}
