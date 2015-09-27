import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class mp3 {
	public static void main(String[] args) {
		mp3 m = new mp3();
	}

	mp3() {
		Media lpo = new Media("plvo.mp3");
		MediaPlayer mq = new MediaPlayer(lpo);
		mq.play();
	}
}
