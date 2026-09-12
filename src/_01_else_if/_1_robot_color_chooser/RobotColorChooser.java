
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot jason = new Robot();
		jason.setSpeed(25);
		Random ran1 =new Random();
		
		
		while(true) {
String color =JOptionPane.showInputDialog("what color should the robot use to draw? no capitals");
		
		
		if (color.equals("red")) {
			jason.setPenColor(255,0,0);
		}
		else if (color.equals("green")) {
			jason.setPenColor(0,255,0);
		}
		else if (color.equals("blue")) {
			jason.setPenColor(0,0,255);
		}
		else if (color.equals("orange")) {
			jason.setPenColor(255,165,0);
		}
		else if (color.equals("yellow")) {
			jason.setPenColor(255,255,0);
		}
		else if (color.equals("purple")) {
			jason.setPenColor(128,0,128);
		}
		else  {
			jason.setPenColor(ran1.nextInt(256),ran1.nextInt(256),ran1.nextInt(256));
		}
		
	    //2. Make the robot draw a shape (this will take more than one line of code)	
		jason.setPenWidth(10);
		jason.penDown();
		jason.move(200);
		jason.turn(90);
		jason.move(200);
		jason.turn(90);
		jason.move(200);
		jason.turn(90);
		jason.move(200);
		jason.move(200);
		jason.turn(90);
		jason.move(200);
		jason.turn(90);
		jason.move(200);
		jason.turn(90);
		jason.move(200);
		jason.turn(90);
		}
		//3. Set the pen width to 10
	
		//4. Ask the user what color pen they would like the robot to draw with
		
        //5. Use an if/else statement to set the pen color that the user requested
		//6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
