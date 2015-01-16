import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class Save_Load {
	//All file related things 
	//Creating Reading Saving files
	
	// To store File info
	static ArrayList<Course_Node> Course_List = new ArrayList<Course_Node>();
	
	// To Create 
	private void create_file(String name){
		
		File file = new File(name);
		try {
			
			file.createNewFile();
			
		} catch (IOException e) {
			//add a message box to appear to handle this excetion 
			e.printStackTrace();
			
		}
		
	}
	

}
