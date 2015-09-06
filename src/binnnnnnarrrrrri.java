import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binnnnnnarrrrrri implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Convert");
	JTextField textfield = new JTextField(10);
	JTextField textfield1 = new JTextField(30);
	JLabel label = new JLabel("Enter a triple digit number");

	public static void main(String[] args) {
		binnnnnnarrrrrri binnnnnnarrrrrrii = new binnnnnnarrrrrri();
	}

	binnnnnnarrrrrri() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(label);
		panel.add(textfield);
		panel.add(textfield1);
		panel.add(button);
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String lupa = "1";
		if (e.getSource() == button) {
			String textt = textfield.getText();
			int a = Integer.parseInt(textt);
			int b = a / 2;
			if (b % 1 != 0) {
				lupa = "1";
			} else {
				String lupa = "0";
			}
			int c = b / 2;
			if (c % 1 != 0) {
				String hupa = lupa + "1";
			} else {
				String lupa = "0";
			}
		}
	}
}
