import org.jointheleague.graphical.robot.Robot;

public class klklkkjhgf {
	public static void main(String[] args) {
		klklkkjhgf k = new klklkkjhgf();
	}

	klklkkjhgf() {
		Robot Adrian = new Robot();
		Adrian.penDown();
		Adrian.changeRobot("k");
		Adrian.setSpeed(10);
		//drawSquare(Adrian);
		//drawSquare(Shinton);
		//drawSquare(Napville);
		drawShape(Adrian,50,27);
		
	}

	void drawSquare(Robot bkfsdh) {
		for (int a = 1; a <= 4; a++) {
			bkfsdh.move(200);
			bkfsdh.turn(90);

		}
	}

	void drawShape(Robot jafgdh, int q, int f) {
		for (int b = 1; b <= f; b++) {
			jafgdh.move(q);
			jafgdh.turn(360 / f);
		}
	}
}
