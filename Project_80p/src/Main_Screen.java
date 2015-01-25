import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Main_Screen {

	private JFrame Main_Scren;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Screen window = new Main_Screen();
					
					window.Main_Scren.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main_Screen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Main_Scren = new JFrame();
		Main_Scren.setType(Type.UTILITY);
		Main_Scren.setBounds(100, 10, 327, 700);
		Main_Scren.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Main_Scren.getContentPane().setLayout(null);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(10, 11, 91, 23);
		Main_Scren.getContentPane().add(btnExit);
		
		JButton btnSummary = new JButton("Summary");
		btnSummary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Attendance_Screen.run(null);
				
			}
		});
		btnSummary.setBounds(111, 11, 91, 23);
		Main_Scren.getContentPane().add(btnSummary);
		
		JButton btnAddnew = new JButton("Add/Remove Courses");
		btnAddnew.setBounds(10, 45, 192, 23);
		Main_Scren.getContentPane().add(btnAddnew);
		
		JButton btnTable = new JButton("Time Table");
		btnTable.setBounds(212, 11, 97, 57);
		Main_Scren.getContentPane().add(btnTable);
	}
}
