
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
	public static void run(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Attendance_Screen frame = new Attendance_Screen();
					frame.setUndecorated(true);
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
	
	
	public Attendance_Screen() {
		
		//Setting the panel
		Save_Load.load();
		int size = Save_Load.Course_List.size();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(110, 105, 300, 100*size);
		contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*Panel panel = new Panel();
		panel.setBounds(48, 73, 10, 10);
		contentPane.add(panel);
		*/
		//final Save_Load sam = new Save_Load();
		//sam.load("Courses.txt");
		
		GridLayout layout = new GridLayout(size, 1);
		getContentPane().setLayout(layout);
		
		int i;
		Node[] node = new Node[size];
		Course_Node temp;
		
		for (i = 0; i < size; i++){
			
			temp = Save_Load.Course_List.get(i);
			node[i] = new Node(temp);
		
			contentPane.add(node[i]);
		}
		
		//Dataholder
		//ArrayList<Course_Node> Hold = new ArrayList<Course_Node>();
		//Enter a sample entry
		//sample_input();
		//Load the Content From File
	
		
	
	}
}
