
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JButton;


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
		
		Course_Node sam2 = new Course_Node("CO 322","Data Structures and Algorithems");
		Save_Load sam = new Save_Load();
		Save_Load.Course_List.add(sam2);
		sam.save("Courses.txt");
		
	}
	
	public Attendance_Screen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 242, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Enter a sample entry
		sample_input();
		//Load the Content From File
		
		
		JLabel lblCourseName_1 = new JLabel("Computer Communicaton Network II");
		lblCourseName_1.setBounds(52, 11, 331, 14);
		contentPane.add(lblCourseName_1);
		
		JLabel lblAttend_1 = new JLabel("Attended_Letures");
		lblAttend_1.setBounds(20, 36, 93, 14);
		contentPane.add(lblAttend_1);
		
		JLabel lblCode_1 = new JLabel("CO 312");
		lblCode_1.setBounds(10, 11, 36, 14);
		contentPane.add(lblCode_1);
		
		JLabel lblNoAt_1 = new JLabel("01");
		lblNoAt_1.setBounds(123, 36, 17, 14);
		contentPane.add(lblNoAt_1);
		
		JLabel lblHeld_1 = new JLabel("Lectures Held");
		lblHeld_1.setBounds(20, 56, 93, 14);
		contentPane.add(lblHeld_1);
		
		JLabel lblNoHe_1 = new JLabel("01");
		lblNoHe_1.setBounds(123, 56, 17, 14);
		contentPane.add(lblNoHe_1);
		
		JLabel lblPerc_1 = new JLabel("100%");
		lblPerc_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPerc_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerc_1.setBounds(161, 36, 46, 30);
		contentPane.add(lblPerc_1);
		
		JButton btnAttend_1 = new JButton("Attend");
		btnAttend_1.setBounds(20, 81, 91, 23);
		contentPane.add(btnAttend_1);
		
		JButton btnMissed_1 = new JButton("Missed");
		btnMissed_1.setBounds(123, 81, 91, 23);
		contentPane.add(btnMissed_1);
	}
}
