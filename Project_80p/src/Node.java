import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


@SuppressWarnings("serial")
public class Node extends JPanel {

	/**
	 * Create the panel.
	 */
	public Node() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		setLayout(new BorderLayout());
		//lblNewLabel.setBounds(0, 0, 300, 100);
		lblNewLabel.setIcon(new ImageIcon("G:\\Project_80p_rep\\Project_80p\\Design_Guide(UI)\\Template_Course_Node_Basic.png"));
		add(lblNewLabel);

	}

}
