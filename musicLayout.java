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
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		contentPane.add(panel1);
		contentPane.add(panel2);
		
		setContentPane(contentPane);
		
		//new JLabel
		eraLabel = new JLabel("Music Era");
		artistLabel = new JLabel("Artist");
		titleLabel = new JLabel("Title");
		genreLabel = new JLabel("Genre");
		durationLabel = new JLabel("Duration");
		yearLabel = new JLabel("Year");
		
		//creating buttons
		JButton navRightButton = new JButton("Next Record");
		navRightButton.setActionCommand("Next Record");
		
		JButton navLeftButton = new JButton("Previous Record");
		navLeftButton.setActionCommand("Previous Record");

		JButton navLastButton = new JButton("Last Record");
		navLastButton.setActionCommand("Last Record");
		
		JButton navStartButton = new JButton("First Record");
		navStartButton.setActionCommand("First Record");
		
		JButton returnButton = new JButton("Return");
		returnButton.setActionCommand("Return");
		
		
		//Actions for buttons.
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

		navRightButton.addActionListener(new ActionListener(){
	
			public void actionPerformed(ActionEvent e){
		

			}
		});

		navRightButton.addActionListener(new ActionListener(){
	
			public void actionPerformed(ActionEvent e){
		

			}
		});
		
		//set a background colour for the window
		contentPane.setBackground(Color.cyan);
		
		//Position labels and buttons using grid
		GridBagConstraints c = new GridBagConstraints();
		
		c.fill = GridBagConstraints.HORIZONTAL;
		
		c.gridx = 3;
		c.gridy = 0;
		c.gridwidth = 2;
		panel1.add(eraLabel, c);
		
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 2;
		panel1.add(artistLabel, c);
		
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 2;
		panel1.add(titleLabel, c);
		
		c.gridx = 0;
		c.gridy = 4;
		c.gridwidth = 2;
		panel1.add(durationLabel, c);
		
		c.gridx = 0;
		c.gridy = 5;
		c.gridwidth = 2;
		panel1.add(genreLabel, c);
		
		c.gridx = 0;
		c.gridy = 6;
		c.gridwidth = 2;
		panel1.add(yearLabel, c);
		
		c.gridx = 5;
		c.gridy = 2;
		c.insets = new Insets(20, 10, 20, 10);
		panel2.add(navRightButton, c);
		
		c.gridx = 4;
		c.gridy = 2;
		panel2.add(navLeftButton, c);
		
		c.gridx = 6;
		c.gridy = 2;
		panel2.add(navLastButton, c);
		
		c.gridx = 3;
		c.gridy = 2;
		panel2.add(navStartButton, c);
		
		c.gridx = 7;
		c.gridy = 5;
		panel2.add(returnButton, c);
		
		
		
	}
	
	public void musicWindow(){
		
		musicLayout window = new musicLayout("");
		
		//This tells Java we want to Exit the application on close
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Set the window position and size
		window.setBounds(200, 200, 600, 400);
		
		// Optimise layout
		window.pack();
		
		// Make the new JFrame visible
		window.setVisible(true);
		
	}
}
