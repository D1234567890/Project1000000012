import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PhotoBook implements ActionListener {
	JFrame frame = new JFrame("Image Album");
	ImagePanel i = new ImagePanel("TropicalBeach.jpg", 500, 500);
	JButton button = new JButton("Next");
	JButton button0 = new JButton("Previous");
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Random");
	int a = 2;
	
	public static void main(String[] args) {
		PhotoBook p = new PhotoBook();
	}

	PhotoBook() {
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setSize(1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(i);
		i.setBounds(0, 0, 500, 500);
		panel.setBounds(500, 0, 100, 500);
		frame.add(panel);
		panel.add(button);
		panel.add(button0);
		panel.add(button1);
		button.addActionListener(this);
		button0.addActionListener(this);
		button1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			
		}
	}
}