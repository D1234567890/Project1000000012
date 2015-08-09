import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame("Chuckle Clicker");
	JPanel panel = new JPanel();
	JButton button = new JButton("Hi");
	JButton button1 = new JButton("Bye");

	public static void main(String[] args) {
		ChuckleClicker tk = new ChuckleClicker();
		tk.makeButtons();
	}

	private void makeButtons() {
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(button);
		panel.add(button1);
		button.addActionListener(this);
		button1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			JOptionPane.showMessageDialog(null, "Hi");
		}
		if (e.getSource() == button1) {
			JOptionPane.showMessageDialog(null, "Bye");
		}
	}
}
