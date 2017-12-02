import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot House = new Robot();
	static Random randomMaker = new Random();

	public static void main(String[] args) {
		// 1. have the robot start in the bottom left corner
		House.penDown();
		House.setSpeed(120);
		House.moveTo(0, 580);
		House.setPenWidth(10);
		// 2. draw a house of height 100 with grass after it. This shape: |**|_
		House.setPenColor(105, 208, 89);
		House.turn(90);
		House.move(200);
		for (int i = 0; i < 10; i++) {
			int height = randomMaker.nextInt(3);
			int red = randomMaker.nextInt(255);
			int green = randomMaker.nextInt(255);
			int blue = randomMaker.nextInt(255);
			Color color = new Color(red, green, blue);
			if (height == 0) {
				drawPointyRoof(60, color);
			}
			if (height == 1) {
				drawPointyRoof(120, color);
			}
			if (height == 2) {
				drawFlatRoof(250, color);
			}
		}

	}

	static void drawFlatRoof(int height, Color color) {
		House.setPenColor(color);
		House.turn(-90);
		House.move(height);
		House.turn(90);
		House.move(50);
		House.turn(90);
		House.move(height);
		House.turn(-90);
		House.penUp();
		House.move(11);
		House.penDown();
		House.setPenColor(105, 208, 89);
		House.move(50);
	}

	static void drawPointyRoof(int height, Color color) {
		House.setPenColor(color);
		House.turn(-90);
		House.move(height);
		House.turn(45);
		House.move(50);
		House.turn(90);
		House.move(50);
		House.turn(45);
		House.move(height);
		House.turn(-90);
		House.penUp();
		House.move(11);
		House.penDown();
		House.setPenColor(105, 208, 89);
		House.move(50);
	}
}
