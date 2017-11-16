import java.awt.*;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
public class Main {
	
	public static void createWindow(){
		
		//create a new window from the time line class
		TimelineLayout window = new TimelineLayout("Timeline");
		
		//This tells Java we want to Exit the application on close
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Set the window position and size
		window.setBounds(700, 200, 600, 400);
		
		// Optimise layout
		window.pack();
		
		// Make the new JFrame visible
		window.setVisible(true);
			
	}
	
	//Create fonts????!
	public static void setupUIFont(javax.swing.plaf.FontUIResource f) {
		
		java.util.Enumeration<Object> keys = UIManager.getDefaults().keys();
	    
		while (keys.hasMoreElements()) {
			
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			
			if (value != null && value instanceof javax.swing.plaf.FontUIResource) {
			
				UIManager.put(key, f);
			}
		}
	}

	public static void main(String[] args) {
		

		// Setup font
		setupUIFont(new FontUIResource(new Font("Century Gothic", Font.PLAIN, 20)));
		
		
		// Set system look and feel
		try {
		
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e) {
			
		}
		
		// Initialise Swing - Don't create the window (JFrame) directly - schedule a task to be executed later
		// that will call createWindow to start the Swing GUI.
		javax.swing.SwingUtilities.invokeLater(
				new Runnable() {
					
					public void run() {
						createWindow();
 				}
			}
				
		);

	}

}
