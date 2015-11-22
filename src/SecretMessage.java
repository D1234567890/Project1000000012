import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SecretMessage implements ActionListener {
	final int size = 300;
	JFrame frame;
	JPanel panel;
	JTextField textField;
	JButton button;

	public static void main(String[] args) {
		// new SecretMessage();
		int integer = 0;
		while (true) {
			char c = (char) integer;
			System.out.println(integer + " " + c);
			integer++;
		}
	}

	SecretMessage() {
		frame = new JFrame("Random Translator");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		frame.add(panel);
		textField = new JTextField(10);
		panel.add(textField);
		button = new JButton("Translate");
		panel.add(button);
		button.addActionListener(this);
		frame.setSize(size, size);
	}

	public void actionPerformed(ActionEvent listener) {
		if (listener.getSource() == button) {
			JOptionPane.showMessageDialog(null, trans(textField.getText()));
		}
	}

	String trans(String word) {
		String translate = "";
		for (int i = 0; i < translate.length(); i++) {
			char secret = word.charAt(i);
			secret += 32;
		}
		return translate;

	}
}
