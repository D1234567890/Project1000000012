import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot Shinton = new Robot();

	void go() {

		// 6. Make the robot go as fast as possible
		Shinton.setSpeed(10);
		// 4. make a variable to hold the length of the triangle and set it to
		// 50
		int legnth = 50;
		// 7. Do the following (up to step 10) 60 times

		// 9. Change the color of the pen to a random color
		Shinton.penDown();
		for (int a = 1; a <= 60; a++) {
			Shinton.setRandomPenColor();
			legnth += 10;
			drawTriangle(legnth);
			Shinton.turn(6);
		}

	}

	/*
	 * 2. fill in the method below to draw a triangle. Use the length variable
	 * for the size of the triangle.
	 */
	private void drawTriangle(int length) {
		Shinton.move(length);
		Shinton.turn(360 / 3);
		Shinton.move(length);
		Shinton.turn(360 / 3);
		Shinton.move(length);
		Shinton.turn(360 / 3);
	}

	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
