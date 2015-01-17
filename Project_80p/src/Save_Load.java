import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;


public class Save_Load {
	//All file related things 
	//Creating Reading Saving files
	
	// To store File info
	static ArrayList<Course_Node> Course_List = new ArrayList<Course_Node>();
	static String filename = "Courses.txt";
	// To Create 
	private static void create_file(){
		
		File file = new File(filename);
		try {
			
			file.createNewFile();
			
		} catch (IOException e) {
			//add a message box to appear to handle this excetion 
	
			
		}
		
	}
	
	// To Open & Store them data in the ArrayList
	public static void load(){
		
		File file = new File(filename);
		
		if(!file.exists()){
			create_file();
		}
			
		try {
				
			Scanner x = new Scanner(file);
			
			String in;
			String[] temp;
			
			while(x.hasNext()){
				
				in = x.nextLine();
				temp = in.split(" ");
				Course_Node temp_node = new Course_Node(temp[0], temp[1], Integer.parseInt(temp[2]), Integer.parseInt(temp[3]));
				Course_List.add(temp_node);
				
			}
			
			
			x.close();
				
				
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		}
			
	}
	
	// To Save data to the file
	// This will take a list from the main program and save it in the file

	
	public static void save(){
		
		Formatter x;
		try{
			
			//Open the file
			x = new Formatter(filename);
			Course_Node node;
			//Saving the data
			for (int i = 0; i < Course_List.size(); i++){
			
				node = Course_List.get(i);
				x.format("%s %s %s %s\n",node.Course_Name,node.Course_Code,node.lecs_attend
						,node.lecs_held);
			
			}
			x.close();
			
		}
		catch(Exception e){
			
			System.out.println("Error");
			
		}
	}
	
	public static void addItem(int a,int b,int c){
		
		
	
	}
	
	
	
	// To clear the ArrayList
	public static void freeList(){
		
		Course_List = new ArrayList<Course_Node>();
		
	}
	

}
