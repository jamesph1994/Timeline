import javax.swing.JFrame;

public class Noughties {
	
		public static void createWindow(){
		
		//create a new window from the time line class
				
				musicLayout window = new musicLayout("Noughties");
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
