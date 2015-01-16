import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class Save_Load {
	//All file related things 
	//Creating Reading Saving files
	
	// To store File info
	static HashMap<String,Course_Node> Course_List = new HashMap<String,Course_Node>();
	
	// To Create 
	private void create_file(String name){
		
		File file = new File(name);
		try {
			
			file.createNewFile();
			
		} catch (IOException e) {
			//add a message box to appear to handle this excetion 
	
			
		}
		
	}
	
	// To Open & Store them data in the ArrayList
	public void load(String filename){
		
		File file = new File(filename);
		
		if(!file.exists()){
			create_file(filename);
		}
			
		try {
				
			Scanner x = new Scanner(file);
			
			String in;
			String[] temp;
			
			while(x.hasNext()){
				
				in = x.nextLine();
				temp = in.split(" ");
				Course_Node temp_node = new Course_Node(temp[0], temp[1], Integer.parseInt(temp[2]), Integer.parseInt(temp[3]));
				Course_List.put(temp[1], temp_node);
				
			}
			
			
			x.close();
				
				
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		}
			
	}
	
	// To Save data to the file
	// This will take a list from the main program and save it in the file
	
	
	// To clear the ArrayList
	public void freeList(){
		
		Course_List = new HashMap<String,Course_Node>();
		
	}
	

}
