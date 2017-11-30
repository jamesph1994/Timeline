import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;

public class TimelineLayout extends JFrame{
	
	private static final long	serialVersionUID = 1L; //declare version of JFrame
	private JLabel timelineLabel;
	static ArrayList<Music> myMusicList = loadPattern(); //Static arrayList with JSON objects
	static ArrayList<Music> music = myMusicList;
	
	public static void savePattern(ArrayList<Music> music, String filename){	 	
		String fn;
	    Gson gson = new Gson();
	    JsonElement element = gson.toJsonTree(music, new TypeToken<ArrayList<Music>>() {}.getType()); //break down music objects
	    JsonArray jsonArray = element.getAsJsonArray(); //store parsed objects to array.
	    String json = gson.toJson(jsonArray); 
		    
	    try {
	    	//write converted json data to a file named "file.json"
	    	if(filename != null){    	
	    		fn = "objects.json";
		     	}
	    	else{
	    		fn =  filename + ".json";
		        }
		        FileWriter writer = new FileWriter(fn);
		        writer.write(json);
		        writer.close();
		    }catch (IOException e) {
		        e.printStackTrace();
		    }   
		}
	 
	 	public static ArrayList<Music> loadPattern(){
		    ArrayList<Music> musicList = new ArrayList<>();
		    Gson gson = new Gson();
		   // JsonParser jsonParser = new JsonParser();
		    try 
		    {
		    	BufferedReader br = new BufferedReader(new FileReader("objects.json")); //read file
		    	musicList = gson.fromJson(br, new TypeToken<List<Music>>(){}.getType()); //Storing objects in to ArrayList.
		    }  catch (IOException e){
		        e.printStackTrace();
		    }
			return musicList;
		}

	public TimelineLayout(String title){
		super(title); //Give the window a title constuctor 
		JPanel contentPane = new JPanel(); //Containter content pane to add designs.
		contentPane.setLayout(new GridBagLayout()); //Design layout - GridBagLayout.
		setContentPane(contentPane);
		timelineLabel = new JLabel("Music Era Timeline"); //Timeline title label.
		
		JButton sixtiesButton = new JButton("60s"); //Create new buttons for timeline.
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
				try{
					Decades.sixtiesWindow(); //Load sixties window.
				}catch(Exception g)	{
					g.getMessage(); //Catches NumberException if no music exists.
				}			
			}
		});
		
		seventiesButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					Decades.seventiesWindow(); //load 70s window.
				}catch(Exception g){
					g.getMessage(); //Catches NumberException if no music exists.
				}			
			}
		});
		
		eightiesButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					Decades.eightiesWindow(); //Load 80s window
				}catch(Exception g){
					g.getMessage(); //Catches NumberException if no music exists.
				}			
			}
		});
	
		ninetiesButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					Decades.ninetiesWindow(); //Load 90s window.
				}catch(Exception g)
				{
					g.getMessage(); //Catches NumberException if no music exists.
				}			
			}
		});

		twentiesButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					Decades.noughtiesWindow(); //Load 00s window.
				}catch(Exception g)
				{
					g.getMessage(); //Catches NumberException if no music exists.
				}			
			}
		});
		
		addButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				addTrackLayout.addWindow(); //Open add track window.
			}
		});
		
		saveButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				savePattern(music, "filee");	//Save added music to JSON.	
			}
		});
		
		loadButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				loadPattern();  //Load saved music.
			}
		});

		//set background colour
		contentPane.setBackground(Color.WHITE);		
		//creating a grid
		GridBagConstraints c = new GridBagConstraints();
		//set grid horizontal 
		c.fill = GridBagConstraints.HORIZONTAL;
		
		//position buttons 
		c.gridx = 1; //Horizontal position
		c.gridy = 2; //Vertical position
		c.insets = new Insets(10, 5, 10, 5); //Padding of content
		contentPane.add(sixtiesButton, c); //add button & positioning co-ordinates.
		
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
		c.gridwidth = 3; //How many grids wide.
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
