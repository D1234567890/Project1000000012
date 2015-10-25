import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Face {
	int qq = 7;
	Robot adrian = new Robot();
	Robot adrain = new Robot();
	Robot adriam = new Robot();
	Robot adraim = new Robot();
	String qqq = "happy";

	public static void main(String[] args) {
		Face a = new Face();
	}

	Face() {
		adrian.moveTo(100, 500);
		face(adrian, qq);
		eyes(adrain);
		mouth(adriam, qqq);
		nose(adraim);
	}

	void face(Robot q, int qq) {
		for (int i = 1; i <= 360; i++) {
			q.penDown();
			q.setSpeed(10);
			q.setPenColor(Color.RED);
			q.setPenWidth(5);
			q.move(qq);
			q.turn(1);
		}
	}

	void eyes(Robot ops) {
		qq = 1;
		ops.moveTo(250, 275);
		ops.setSpeed(10);
		for (int i = 1; i <= 2; i++) {
			face(adrain, qq);
			ops.penUp();
			ops.moveTo(ops.getX() + 50, 275);
			ops.penDown();
			ops.move(1);
			ops.penUp();
			ops.moveTo(ops.getX() + 200, 275);
		}
	}

	void mouth(Robot limps, String qqq) {
		if (qqq.equalsIgnoreCase("happy")) {
			limps.setPenColor(Color.RED);
			limps.setSpeed(10);
			limps.moveTo(300, 700);
			limps.turn(150);
			limps.penDown();
			for (int i = 1; i <= 120; i++) {
				limps.move(3);
				limps.turn(-1);
			}
		}
	}

	void nose(Robot mor) {
		mor.setPenColor(Color.RED);
		mor.setSpeed(10);
		mor.moveTo(450, 500);
		mor.penDown();
		mor.turn(20);
		mor.move(-50);
		mor.turn(70);
		mor.move(20);
		adrian.hide();
		adrain.hide();
		adriam.hide();
		adraim.hide();
	}
}