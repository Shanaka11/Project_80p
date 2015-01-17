
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Attendance_Screen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Attendance_Screen frame = new Attendance_Screen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void sample_input(){
		
		Course_Node sam2 = new Course_Node("Data_Structures_and_Algorithems","CO322");
		Save_Load sam = new Save_Load();
		Save_Load.Course_List.add(sam2);
		sam.save("Courses.txt");
		
	}
	
	public Attendance_Screen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 315);
		contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*Panel panel = new Panel();
		panel.setBounds(48, 73, 10, 10);
		contentPane.add(panel);
		*/
		GridLayout layout = new GridLayout(3, 1);
		setLayout(layout);
		int i = 0;
		Node[] node = new Node[3];
		for (i = 0; i < 3; i++){
			//Node node = new Node();
			//System.out.println(i);
			node[i] = new Node();
			//node[i].setBounds(0, 0 , 300, 100 );
		//	System.out.println(0 + 100*i + " " + (100 + 100 * i) );
			contentPane.add(node[i]);
		}
		
		//Dataholder
		//ArrayList<Course_Node> Hold = new ArrayList<Course_Node>();
		//Enter a sample entry
		sample_input();
		//Load the Content From File
		final Save_Load sam = new Save_Load();
		sam.load("Courses.txt");
	
	}
}
