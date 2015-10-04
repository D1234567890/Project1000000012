import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Slot_Machine implements ActionListener {
	double qu = 1000;
	String ip = "" + qu;

	JFrame frame = new JFrame("Slot Machine");
	JPanel panel = new JPanel();
	JButton button = new JButton("Spin");
	JLabel label = new JLabel("Bet:");
	JLabel label0 = new JLabel("Total: ");
	JLabel label1 = new JLabel(ip);
	JTextField textField = new JTextField("Enter Bet", 5);
	JLabel label2 = new JLabel("");
	JLabel label3 = new JLabel("");
	JLabel label4 = new JLabel("");
	JLabel label5 = new JLabel("");
	JLabel label6 = new JLabel("");

	public static void main(String[] args) {
		Slot_Machine s = new Slot_Machine();
	}

	Slot_Machine() {
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(label);
		panel.add(textField);
		panel.add(label0);
		panel.add(label1);
		panel.add(button);
		button.addActionListener(this);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(label5);
		panel.add(label6);
	}

	public void actionPerformed(ActionEvent rint) {
		if (rint.getSource() == button) {
			double a = new Random().nextInt(10);
			double b = new Random().nextInt(10);
			double c = new Random().nextInt(10);
			label4.setText("" + a);
			label5.setText("" + b);
			label6.setText("" + c);

			if (a == b && b == c) {
				String qui = textField.getText();
				double quii = Double.parseDouble(qui);
				qu += quii;
				String ip = "" + qu;
				label1.setText(ip);
			} else if (a == c || c == b || a == b) {
				String qui = textField.getText();
				double quii = Double.parseDouble(qui);
				qu += quii / 2;
				String ip = "" + qu;
				label1.setText(ip);
			} else {
				String qui = textField.getText();
				double quii = Double.parseDouble(qui);
				qu -= quii;
				String ip = "" + qu;
				label1.setText(ip);
			}
			if (qu <= 0) {
				label3.setText("GAME OVER");
				button.removeActionListener(this);
			}
		}
	}
}
