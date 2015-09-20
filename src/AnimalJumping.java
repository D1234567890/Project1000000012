import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AnimalJumping {
	JFrame frame = new JFrame("http://i.imgur.com/Jdt1rRf.gif");
	JLabel labelll; 
	public static void main(String[] args) throws MalformedURLException {
		/*
		 * We want to show an animation of an animal sucking at jumping inside a
		 * JFrame. Once you have chosen from
		 * http://animalssuckingatjumping.tumblr.com/, right click and
		 * "Copy Image URL" or “Copy Image Address” Your program must: - show
		 * the animation in full without any user interaction. You don’t need a
		 * JPanel since it’s only one JComponent. - show the animation in the
		 * center of the screen. Clue: frame.setLocationRelativeTo(null) - have
		 * a title such as "Gerbil Fail"
		 */
		labelll = createImage("http://i.imgur.com/Jdt1rRf.gif");
		AnimalJumping a = new AnimalJumping();
		String urlOfAnimalSuckingAtJumping = "http://i.imgur.com/Jdt1rRf.gif";
		JLabel labelll = createImage("http://i.imgur.com/Jdt1rRf.gif");

	}

	AnimalJumping() {
		frame.setVisible(true);
		frame.setSize(1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			frame.add(createImage("http://i.imgur.com/Jdt1rRf.gif"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static JLabel createImage(String imageURL) throws MalformedURLException {
		URL url = new URL(imageURL);
		Icon icon = new ImageIcon(url);
		return new JLabel(icon);
	}
}
