import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class Node extends JPanel {

	/**
	 * Create the panel.
	 */
	public Node(final Course_Node c_node) {
		setLayout(null);
		setLayout(null);
		
		//Button
		
		
		
		//Attended Lectures
		final JLabel lblAtNo = new JLabel(Integer.toString(c_node.lecs_attend));
		lblAtNo.setForeground(new Color(255, 255, 255));
		lblAtNo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblAtNo.setBounds(135, 32, 19, 14);
		add(lblAtNo);
		
		//Bunked Lectures
		final JLabel lblHeNo = new JLabel(Integer.toString(c_node.lecs_held));
		lblHeNo.setForeground(new Color(255, 255, 255));
		lblHeNo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblHeNo.setBounds(135, 50, 19, 14);
		add(lblHeNo);
		
		//Coursecode
		JLabel lblCode = new JLabel(printHelper(c_node.Course_Code));
		lblCode.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblCode.setForeground(new Color(255, 255, 255));
		lblCode.setBounds(10, 2, 67, 32);
		add(lblCode);
		
		//CourseName
		JLabel lblName = new JLabel(printHelper(c_node.Course_Name));
		lblName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setBounds(70, 2, 230, 20);
		add(lblName);
		
		//Percentage Gauge
		String GaugeImage = "Design_Guide(UI)/Percentage_Gauge/Percentage_Gauge_" +
				Integer.toString(c_node.attend_perc)+".png";
		
		ImageIcon Gauge = new ImageIcon(GaugeImage);
		JLabel lblGauge = new JLabel(Gauge);
		//JLabel lblGauge = new JLabel("");
		//lblGauge.setIcon(new ImageIcon("G:\\Project_80p_rep\\Project_80p\\Design_Guide(UI)\\Percentage_Gauge\\Percentage_Gauge_75.png"));
		lblGauge.setBounds(205, 32, 67, 57);
		add(lblGauge);
		
		//Attend Button
		final ImageIcon Button_Attend_Off = new ImageIcon("Design_Guide(UI)/Button_off_Attend.png");
		final ImageIcon Button_Attend_On = new ImageIcon("Design_Guide(UI)/Button_on_Attend.png");
		final JButton btnAttend = new JButton("");
		btnAttend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int temp;
				temp = Integer.parseInt(lblAtNo.getText())+1;
				lblAtNo.setText(Integer.toString(temp));
				temp = Integer.parseInt(lblHeNo.getText())+1; 
				lblHeNo.setText(Integer.toString(temp));
				
				//Course_Node temp_Node;
				c_node.lecs_attend++;
				c_node.lecs_held++;
				Save_Load.save();
			}
		});
		
		btnAttend.setFocusPainted(false);
		btnAttend.setOpaque(false);
		btnAttend.setContentAreaFilled(false);
		btnAttend.setBorderPainted(false);
		btnAttend.setIcon(Button_Attend_Off);
		btnAttend.setBounds(33, 66, 59, 23);
		add(btnAttend);
		
		//Held Button
		ImageIcon Button_Held_Off = new ImageIcon("Design_Guide(UI)/Button_off_Held.png");
		ImageIcon Button_Held_On = new ImageIcon("Design_Guide(UI)/Button_on_Held.png");
		JButton btnHeld = new JButton("");
		btnHeld.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int temp;
				temp = Integer.parseInt(lblHeNo.getText())+1; 
				lblHeNo.setText(Integer.toString(temp));
				
				c_node.lecs_held++;
				Save_Load.save();
			}
		});
		btnHeld.setOpaque(false);
		btnHeld.setContentAreaFilled(false);
		btnHeld.setBorderPainted(false);
		btnHeld.setFocusPainted(false);
		btnHeld.setIcon(Button_Held_Off);
		btnHeld.setBounds(95, 66, 59, 23);
		add(btnHeld);
		
		//For Background
		ImageIcon BackGround = new ImageIcon("Design_Guide(UI)/Template_Course_Node_Basic.png");
		JLabel lblNewLabel = new JLabel("");
		//lblNewLabel.setIcon(new ImageIcon("G:\\Project_80p_rep\\Project_80p\\Design_Guide(UI)\\Template_Course_Node_Basic.png"));
		lblNewLabel.setBounds(0, 0, 300, 100);
		//lblNewLabel.setBounds(0, 0, 300, 100);
		lblNewLabel.setIcon(BackGround);
		add(lblNewLabel);

	}
	
	private String printHelper(String in){
		
		String[] temp;
		temp = in.split("_");
		String out = "";
		for(int i = 0; i < temp.length; i++ ){
			
			out = out + temp[i] + " ";
			
		}
		return out;
	}
}
