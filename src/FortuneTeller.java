// Copyright Wintriss Technical Schools 2013
import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FortuneTeller extends JPanel implements Runnable, MouseListener {
	boolean z = true;

	BufferedImage fortuneTellerImage;

	int frameWidth = 500;
	int frameHeight = 500;

	FortuneTeller() throws Exception {
		// 1. Choose an image for your fortune teller and put it in your default
		// package
		fortuneTellerImage = ImageIO.read(getClass().getResource(
				"CrystalBall.jpg"));
		// 2. Adjust the framexeWidth and frameHeight variables to fit your
		// image nicely (doesn’t need a new line of code)
		// 4. add a mouse listener
		addMouseListener(this);
	}

	static void begin() {
		// 3. Welcome the user. Give them a hint for the secret location.
		JOptionPane
				.showMessageDialog(null,
						"This is a fortune teller.  Click on the orb to reveal your fortune.");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		// 5. Print the mouseX variable
		// 6. Add the mouseY variable to the previous line so that it prints out
		// too (no new line)
		// 7. Adjust your secret location co-ordinates here:
		int secretLocationX = 355;
		int secretLocationY = 331;
		/**
		 * If the mouse co-ordinates and secret location are close, we'll let
		 * them ask a question.
		 */
		if (areClose(mouseX, secretLocationX)
				&& areClose(mouseY, secretLocationY)) {
			// 8. Get the user to enter a question for the fortune teller
			JOptionPane.showInputDialog("I will tell you your fortune!");

			// 9. Find a spooky sound and put it in your default package
			// (freesound.org)
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(
					"evil.wav"));
			// 10. Play the sound
			sound.play();
			// 11. Use the pause() method below to wait until your music has
			// finished
			pause(12);
			// 12. Insert your completed Magic 8 ball recipe
			while (z) {
				int b = new Random().nextInt(10);
				if (b == 1) {
					JOptionPane.showMessageDialog(null, "You will be rich!");
				}
				if (b == 2) {
					JOptionPane.showMessageDialog(null,
							"You will live 110 years old!");
				}
				if (b == 3) {
					JOptionPane.showMessageDialog(null,
							"Your IQ will become 280!");
				}
				if (b == 4) {
					JOptionPane.showMessageDialog(null,
							"You will have a mobile home!");
				}
				if (b == 5) {
					JOptionPane.showMessageDialog(null,
							"You can not be easily fooled!");
				}
				if (b == 6) {
					JOptionPane.showMessageDialog(null,
							"Your house will be blown away!");
				}
				if (b == 7) {
					JOptionPane.showMessageDialog(null,
							"You will have a pet iguana!");
				}
				if (b == 8) {
					JOptionPane.showMessageDialog(null,
							"You will build the mile high tower in 2030.");
				}
				if (b == 9) {
					JOptionPane
							.showMessageDialog(null,
									"Your dog will poop in your house in September 17, 2017");
				}
				if (b == 0) {
					JOptionPane.showMessageDialog(null, "You have no future.");
				}
				String q = JOptionPane
						.showInputDialog("Do you want another fortune?");
				if (!q.equalsIgnoreCase("yes")) {
					z = false;
					System.exit(0);
				}
			}
		}
	}

	private boolean areClose(int mouseX, int secretLocationX) {
		return mouseX < secretLocationX + 15 && mouseX > secretLocationX - 15;
	}

	private void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**************** don't worry about the stuff under here *******************/

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new FortuneTeller());
		begin();
	}

	@Override
	public void run() {
		JFrame frame = new JFrame();
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	private void showAnotherImage(String imageName) {
		try {
			fortuneTellerImage = ImageIO
					.read(getClass().getResource(imageName));
		} catch (Exception e) {
			System.err.println("Couldn't find this image: " + imageName);
		}
		repaint();
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(fortuneTellerImage, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

}
