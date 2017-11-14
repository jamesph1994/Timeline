import java.awt.Dimension;

import javax.swing.JFrame;

public class Sixties {
		
		
		public static void createWindow(){
		
		//create a new window from the time line class
				
				musicLayout window = new musicLayout("Sixties");
				//This tells Java we want to Exit the application on close
				window.setPreferredSize(new Dimension(800, 500));
			    window.pack();
			    window.setLocationRelativeTo(null);
			    window.setVisible(true);
					
	}
}
