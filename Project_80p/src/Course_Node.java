
public class Course_Node {
	
	//This class will be used to store info about a single course
	//Will have methods to calculate percentages and attendance
	
	//Variables for storing lectures that were attended and held and the percentage of the attendance
	int lecs_attend,lecs_held,attend_perc;
	
	//Default Constructor sets attendance values at 0
	Course_Node(){
		
		this.lecs_attend = 0;
		this.lecs_held = 0;
		this.attend_perc = 0;
		
	}
	
	// for testing
	
	public void print_node(){
		
		System.out.println("At: " + this.lecs_attend + " He: " + this.lecs_held + " Pe: "
				+ this.attend_perc + "%");
		
	}
	
	// to increment attendance when attended the lecture
	
	public void attend_lec(){
	
		this.lecs_attend++;
		this.lecs_held++;
		percentAge();
		
	}
	
	// when bunking the lectures
	
	public void not_attend_lec(){
		
		this.lecs_held++;
		percentAge();
		
	}

	// calculate percentage
	
	public void percentAge(){
		
		this.attend_perc = this.lecs_attend/this.lecs_held;
		
	}
}
