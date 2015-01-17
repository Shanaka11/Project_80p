
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
	public Attendance_Screen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 242, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCourseName = new JLabel("Computer Communicaton Network II");
		lblCourseName.setBounds(52, 11, 331, 14);
		contentPane.add(lblCourseName);
		
		JLabel lblNewLabel = new JLabel("Attended_Letures");
		lblNewLabel.setBounds(20, 36, 93, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCode = new JLabel("CO 312");
		lblCode.setBounds(10, 11, 36, 14);
		contentPane.add(lblCode);
		
		JLabel label = new JLabel("01");
		label.setBounds(123, 36, 17, 14);
		contentPane.add(label);
		
		JLabel lblLecturesHeld = new JLabel("Lectures Held");
		lblLecturesHeld.setBounds(20, 56, 93, 14);
		contentPane.add(lblLecturesHeld);
		
		JLabel label_1 = new JLabel("01");
		label_1.setBounds(123, 56, 17, 14);
		contentPane.add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel("100%");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(161, 36, 46, 30);
		contentPane.add(lblNewLabel_1);
		
		JButton btnAttend = new JButton("Attend");
		btnAttend.setBounds(20, 81, 91, 23);
		contentPane.add(btnAttend);
		
		JButton btnMissed = new JButton("Missed");
		btnMissed.setBounds(123, 81, 91, 23);
		contentPane.add(btnMissed);
	}
}
