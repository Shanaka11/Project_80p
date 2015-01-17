
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;



import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


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
		setBounds(100, 100, 242, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
				
		
		//Dataholder
		//ArrayList<Course_Node> Hold = new ArrayList<Course_Node>();
		//Enter a sample entry
		sample_input();
		//Load the Content From File
		final Save_Load sam = new Save_Load();
		sam.load("Courses.txt");
		
		JLabel lblCourseName_1 = new JLabel("Computer Communicaton Network II");
		lblCourseName_1.setBounds(52, 11, 331, 14);
		contentPane.add(lblCourseName_1);
		lblCourseName_1.setText(Save_Load.Course_List.get(0).Course_Name);
		
		JLabel lblAttend_1 = new JLabel("Attended_Letures");
		lblAttend_1.setForeground(Color.BLACK);
		lblAttend_1.setBounds(20, 36, 93, 14);
		contentPane.add(lblAttend_1);
		
		JLabel lblCode_1 = new JLabel("CO312");
		lblCode_1.setBounds(10, 11, 36, 14);
		contentPane.add(lblCode_1);
		lblCode_1.setText(Save_Load.Course_List.get(0).Course_Code);
		
		final JLabel lblNoAt_1 = new JLabel("01");
		lblNoAt_1.setBounds(123, 36, 17, 14);
		contentPane.add(lblNoAt_1);
		lblNoAt_1.setText(Integer.toString(Save_Load.Course_List.get(0).lecs_attend));
		
		JLabel lblHeld_1 = new JLabel("Lectures Held");
		lblHeld_1.setBounds(20, 56, 93, 14);
		contentPane.add(lblHeld_1);
		
		final JLabel lblNoHe_1 = new JLabel("01");
		lblNoHe_1.setBounds(123, 56, 17, 14);
		contentPane.add(lblNoHe_1);
		lblNoHe_1.setText(Integer.toString(Save_Load.Course_List.get(0).lecs_held));
		
		final JLabel lblPerc_1 = new JLabel("100%");
		lblPerc_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPerc_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerc_1.setBounds(161, 36, 47, 30);
		contentPane.add(lblPerc_1);
		lblPerc_1.setText("0");
		
		JButton btnAttend_1 = new JButton("Attend");
		btnAttend_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				Course_Node temp = Save_Load.Course_List.get(0);
				temp.attend_lec();
				lblNoAt_1.setText(Integer.toString(temp.lecs_attend));
				lblNoHe_1.setText(Integer.toString(temp.lecs_held));
				lblPerc_1.setText(Integer.toString(temp.attend_perc));
				sam.save("Courses.txt");
			}
			
		});
		btnAttend_1.setBounds(20, 81, 91, 23);
		contentPane.add(btnAttend_1);
		
		JButton btnMissed_1 = new JButton("Missed");
		btnMissed_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Course_Node temp = Save_Load.Course_List.get(0);
				temp.not_attend_lec();
				lblNoAt_1.setText(Integer.toString(temp.lecs_attend));
				lblNoHe_1.setText(Integer.toString(temp.lecs_held));
				lblPerc_1.setText(Integer.toString(temp.attend_perc));
				sam.save("Courses.txt");
			}
		});
		btnMissed_1.setBounds(123, 81, 91, 23);
		contentPane.add(btnMissed_1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(20, 130, 200, 50);
		contentPane.add(label);
	}
}
