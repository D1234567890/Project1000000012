import java.awt.Color;
import java.awt.Font;
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
	JButton button = new JButton("Add");
	JButton button1 = new JButton("Subtract");
	JButton button2 = new JButton("Multiply");
	JButton button3 = new JButton("Divide");
	JLabel label = new JLabel(
			"DO NOT ENTER LETTERS UNLESS YOU WANT AN ERROR!!!");
	JLabel label1 = new JLabel("");
	Font font = new Font("Arial", Font.BOLD, 30);

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
		panel.add(button3);
		button3.addActionListener(this);
		panel.add(label1);
		label1.setFont(font);
		label1.setForeground(Color.GREEN);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			String tex = text.getText();
			String tex1 = text1.getText();
			double textt = Double.parseDouble(tex);
			double textt1 = Double.parseDouble(tex1);
			double teext = textt + textt1;
			label1.setText("" + teext);
		}
		if (e.getSource() == button1) {
			String tex = text.getText();
			String tex1 = text1.getText();
			double textt = Double.parseDouble(tex);
			double textt1 = Double.parseDouble(tex1);
			double teext = textt - textt1;
			label1.setText("" + teext);
		}
		if (e.getSource() == button2) {
			String tex = text.getText();
			String tex1 = text1.getText();
			double textt = Double.parseDouble(tex);
			double textt1 = Double.parseDouble(tex1);
			double teext = textt * textt1;
			label1.setText("" + teext);
		}
		if (e.getSource() == button3) {
			String tex = text.getText();
			String tex1 = text1.getText();
			double textt = Double.parseDouble(tex);
			double textt1 = Double.parseDouble(tex1);
			double teext = textt / textt1;
			label1.setText("" + teext);
		}
	}
}