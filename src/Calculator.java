import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	int a = 18;
	JFrame frame = new JFrame("Calculator");
	JPanel panel = new JPanel();
	JTextField text = new JTextField(a);
	JTextField text1 = new JTextField(a);
	JTextField text2 = new JTextField(a);
	JTextField text3 = new JTextField(a);
	JTextField text4 = new JTextField(a);
	JButton button = new JButton("Add");
	JButton button1 = new JButton("Subtract");
	JButton button2 = new JButton("Multiply");
	JLabel label = new JLabel(
			"DO NOT ENTER LETTERS UNLESS YOU WANT AN ERROR!!!");

	public static void main(String[] args) {
		Calculator c = new Calculator();
	}

	Calculator() {
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(text);
		panel.add(text1);
		panel.add(button);
		panel.add(button1);
		panel.add(button2);
		button.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {

		}
		if (e.getSource() == button1) {

		}
		if (e.getSource() == button2) {

		}
	}

	int addIntegers() {
		String b = text.getText();
		String c = text1.getText();
		int d = Integer.parseInt(b);
		return d;
		
	}
}
