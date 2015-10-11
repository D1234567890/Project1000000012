import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
	BufferedImage image;
	int width;
	int height;

	ImagePanel(String filename, int width, int height) {
		this.width = width;
		this.height = height;
		try {
			image = ImageIO.read(this.getClass().getResourceAsStream(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void paint(Graphics g) {
		g.drawImage(image, 0, 0, width, height, null);
	}
}
