import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
public static void main(String[] args) {
	//1. have the robot start in the bottom left corner
   Robot House = new Robot();
   Random randomMaker = new Random();
   House.penDown();
   House.setSpeed(120);
   House.moveTo(0, 580);
   House.setPenWidth(10);
	//2. draw a house of height 100 with grass after it. This shape: |**|_
   House.setPenColor(105, 208, 89);
   House.turn(90);
   House.move(200);
   String h = JOptionPane.showInputDialog("How tall would you like ?");
   int h2 = Integer.parseInt(h);
   for (int i = 0; i < 9; i++) {
	   
   int num1 = randomMaker.nextInt(500);
   int num2 = randomMaker.nextInt(500);
   int num3 = randomMaker.nextInt(500);   
   House.setPenColor(num1, num2, num3);
   House.turn(-90);
   House.move(h2);
   House.turn(90);
   House.move(50);
   House.turn(90);
   House.move(h2);
   House.turn(-90);
   House.penUp();
   House.move(11);
   House.penDown();
   House.setPenColor(105, 208, 89);
   House.move(50);
   }
   
	//3. extract the piece of code that draws the house into a method. Draw 10 houses.

	//4. Change the method to take int height as a parameter. Draw 9 houses of different heights
 
	//5. Make the method take a String instead of a height. 	
		
	//“small” 		60
	//“medium”	 	120
	//“large”			250

	//6. Make the method take a color as well as a height. The houses are drawn in that color.

	//[optional] Set the scene to night time by setting the background to black using Tortoise.getBackgroundWindow().setColor

	//7. Give the houses peaked roofs

	//8. Extract that roof code into a method “drawPointyRoof” and create a new method: “drawFlatRoof”.

	//9. make large houses have flat rooves

}
}
