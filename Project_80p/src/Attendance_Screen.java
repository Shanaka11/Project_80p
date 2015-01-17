
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
	
	
	public Attendance_Screen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 309, 315);
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
		
		Save_Load.load();
		GridLayout layout = new GridLayout(3, 1);
		setLayout(layout);
		
		int i;
		Node[] node = new Node[3];
		Course_Node temp;
		
		for (i = 0; i < 3; i++){
			
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
