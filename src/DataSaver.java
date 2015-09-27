import javax.swing.*;

public class DataSaver {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel(null);
	JLabel label = new JLabel("Please Fill Out This Form!");
	JLabel label1 = new JLabel("Age:");
	JTextField text = new JTextField(10);
	public static void main(String[] args) {
		DataSaver v = new DataSaver();
	}

	DataSaver() {
		frame.setVisible(true);
		frame.setSize(700,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		label.setBounds(275,0,200,15);
		panel.add(label);
		label1.setBounds(0,100,300,700);
	}
}
