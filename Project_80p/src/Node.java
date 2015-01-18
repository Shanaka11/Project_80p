import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;


@SuppressWarnings("serial")
public class Node extends JPanel {

	/**
	 * Create the panel.
	 */
	public Node(Course_Node c_node) {
		setLayout(null);
		setLayout(null);
		
		//Attended Lectures
		JLabel lblAtNo = new JLabel(Integer.toString(c_node.lecs_attend));
		lblAtNo.setForeground(new Color(255, 255, 255));
		lblAtNo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblAtNo.setBounds(135, 32, 19, 14);
		add(lblAtNo);
		
		//Bunked Lectures
		JLabel lblHeNo = new JLabel(Integer.toString(c_node.lecs_held));
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
		//ImageIcon Gauge = new ImageIcon("Design_Guide(UI)/Percentage_Gauge/Percentage_Gauge_75.png");
		//JLabel lblGauge = new JLabel(Gauge);
		JLabel lblGauge = new JLabel("");
		lblGauge.setIcon(new ImageIcon("G:\\Project_80p_rep\\Project_80p\\Design_Guide(UI)\\Percentage_Gauge\\Percentage_Gauge_75.png"));
		lblGauge.setBounds(205, 32, 67, 57);
		add(lblGauge);
		
		//For Background
		//ImageIcon BackGround = new ImageIcon("Design_Guide(UI)/Template_Course_Node_Basic.png");
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("G:\\Project_80p_rep\\Project_80p\\Design_Guide(UI)\\Template_Course_Node_Basic.png"));
		lblNewLabel.setBounds(0, 0, 300, 100);
		//lblNewLabel.setBounds(0, 0, 300, 100);
		//lblNewLabel.setIcon(BackGround);
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
