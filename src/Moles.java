import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Moles implements ActionListener {
	int score = 0;
	int number = 23;
	JFrame frame;
	JPanel panel;
	int random = new Random().nextInt(number);
	int times = 1;
	String words = "dumb";
	int nums = 0;

	public static void main(String[] args) {
		new Moles();
	}

	Moles() {
		words = "New Game";
		speak(words);
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(1000, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawButtons(random);
	}

	void drawButtons(int random) {
		for (int i = 1; i <= number; i++) {
			JButton button = new JButton();
			if (random == i) {
				panel.add(button);
				button.setText("Mole!");
				button.addActionListener(this);
				panel.repaint();
			}
			button = new JButton();
			panel.add(button);
			button.addActionListener(this);
			panel.validate();
			panel.repaint();
		}
	}

	public void actionPerformed(ActionEvent arg0) {
		JButton buttton = (JButton) arg0.getSource();
		if (buttton.getText().equals("Mole!")) {
			words = "Good";
			speak(words);
			score += 5;
			panel.removeAll();
			drawButtons(new Random().nextInt(number));
			times++;
		}
		if (times == number) {
			JOptionPane.showMessageDialog(null, "Score: " + score + "/110");
			panel.removeAll();
			panel.repaint();
		}
		if (buttton.getText().equals("")) {
			nums++;
			if (nums == 1) {
				words = "dumb";
				speak(words);
			}
			if (nums == 2) {
				words = "idiot";
				speak(words);
			}
			if (nums == 3) {
				words = "uncoordinated";
				speak(words);
			}
			if (nums == 4) {
				words = "moron";
				speak(words);
			}
			if (nums == 5) {
				words = "unintelligent";
				speak(words);
			}
			if (nums == 6) {
				words = "Game Over";
				speak(words);
				panel.removeAll();
			}
		}
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
