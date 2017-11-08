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
	
	public musicLayout(String title){
		
		super (title);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new GridBagLayout());
		
		setContentPane(contentPane);
		
		//new label
		eraLabel = new JLabel("Music Era");
		
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
		
		
		contentPane.setBackground(Color.cyan);
		
		GridBagConstraints c = new GridBagConstraints();
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 2;
		c.insets = new Insets(10, 5, 10, 5);
		contentPane.add(navRightButton, c);
		
		c.gridx = 3;
		c.gridy = 2;
		contentPane.add(navLeftButton, c);
		
		c.gridx = 5;
		c.gridy = 2;
		contentPane.add(navLastButton, c);
		
		c.gridx = 2;
		c.gridy = 2;
		contentPane.add(navStartButton, c);
		
		c.gridx = 1;
		c.gridy = 3;
		contentPane.add(returnButton, c);
		
		c.gridx = 3;
		c.gridy = 0;
		c.gridwidth = 2;
		contentPane.add(eraLabel, c);
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
