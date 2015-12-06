import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TicTacToe implements ActionListener {
	int size = 155;
	JFrame frame;
	JPanel panel;
	JButton button;
	JTextField textField;
	JTextField textField0;
	JTextField textField1;
	JTextField textField2;
	JTextField textField3;
	JTextField textField4;
	JTextField textField5;
	JTextField textField6;
	JTextField textField7;

	public static void main(String[] args) {
		TicTacToe TicTacToe = new TicTacToe();
	}

	TicTacToe() {
		frame = new JFrame("Tic Tac Toe");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		frame.add(panel);
		textField = new JTextField(2);
		textField0 = new JTextField(2);
		textField1 = new JTextField(2);
		textField2 = new JTextField(2);
		textField3 = new JTextField(2);
		textField4 = new JTextField(2);
		textField5 = new JTextField(2);
		textField6 = new JTextField(2);
		textField7 = new JTextField(2);
		panel.add(textField);
		panel.add(textField0);
		panel.add(textField1);
		panel.add(textField2);
		panel.add(textField3);
		panel.add(textField4);
		panel.add(textField5);
		panel.add(textField6);
		panel.add(textField7);
		button = new JButton("Check");
		panel.add(button);
		frame.setSize(size, size);
		button.addActionListener(this);
	}

	public void actionPerformed(ActionEvent listening) {
		if (listening.getSource() == button) {
			if (textField.getText().equalsIgnoreCase(textField0.getText()) && textField0.getText().equals(textField1.getText())) {
				JOptionPane.showMessageDialog(null, "Found match for " + textField.getText() + ".");
			}
			if (textField.getText().equalsIgnoreCase(textField2.getText()) && textField2.getText().equals(textField5.getText())) {
				JOptionPane.showMessageDialog(null, "Found match for " + textField.getText() + ".");
			}
			if (textField0.getText().equalsIgnoreCase(textField3.getText()) && textField3.getText().equals(textField6.getText())) {
				JOptionPane.showMessageDialog(null, "Found match for " + textField0.getText() + ".");
			}
			if (textField1.getText().equalsIgnoreCase(textField4.getText()) && textField4.getText().equals(textField7.getText())) {
				JOptionPane.showMessageDialog(null, "Found match for " + textField1.getText() + ".");
			}
			if (textField2.getText().equalsIgnoreCase(textField3.getText()) && textField3.getText().equals(textField4.getText())) {
				JOptionPane.showMessageDialog(null, "Found match for " + textField2.getText() + ".");
			}
			if (textField5.getText().equalsIgnoreCase(textField6.getText()) && textField6.getText().equals(textField7.getText())) {
				JOptionPane.showMessageDialog(null, "Found match for " + textField5.getText() + ".");
			}
			if (textField.getText().equalsIgnoreCase(textField3.getText()) && textField3.getText().equals(textField7.getText())) {
				JOptionPane.showMessageDialog(null, "Found match for " + textField.getText() + ".");
			}
			if (textField1.getText().equalsIgnoreCase(textField3.getText()) && textField3.getText().equals(textField5.getText())) {
				JOptionPane.showMessageDialog(null, "Found match for " + textField1.getText() + ".");
			}
		}
	}
}
