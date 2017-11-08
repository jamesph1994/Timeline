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
import java.util.ArrayList;

public class TimelineLayout extends JFrame{
	
	private static final long	serialVersionUID = 1L;
	
	private JLabel timelineLabel;
	
	public void line(Graphics g){
		g.drawLine(0, 480, 960, 70);
	
	}
	
	public TimelineLayout(String title){
		
		super(title);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new GridBagLayout());
		
		setContentPane(contentPane);
		
		timelineLabel = new JLabel("Timeline");
		
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
		
			
			
		sixtiesButton.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				
				Sixties six = new Sixties();
				six.createWindow();
			}
		});
		
		seventiesButton.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				
				Seventies seven = new Seventies();
				seven.createWindow();
	
			}
		});
		
		eightiesButton.addActionListener(new ActionListener(){
	
			public void actionPerformed(ActionEvent e){
		
				Eighties eight = new Eighties();
				eight.createWindow();

			}
		});

		ninetiesButton.addActionListener(new ActionListener(){
	
			public void actionPerformed(ActionEvent e){
	
				Nineties nine = new Nineties();
				nine.createWindow();

			}
		});

		twentiesButton.addActionListener(new ActionListener(){
	
			public void actionPerformed(ActionEvent e){
		
				Noughties naught = new Noughties();
				naught.createWindow();
				
				
			}
		});
		
		//set background colour
		contentPane.setBackground(Color.cyan);
		
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
		
		
		c.gridx = 3;
		c.gridy = 0;
		c.gridwidth = 2;
		contentPane.add(timelineLabel, c);
		
		
	}
	


}
