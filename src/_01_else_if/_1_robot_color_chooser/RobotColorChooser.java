
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot robot = new Robot();
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)
		Random object = new Random();
		robot.setSpeed(50);
		robot.penDown();
		robot.setPenWidth(10);
		int rColor = object.nextInt();
		int gColor = object.nextInt();
		int bColor = object.nextInt();
		robot.setX(50);
		robot.setY(300);
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		int colorchoice = JOptionPane.showOptionDialog(null, "which color would you like to choose?", "pen color", 
				0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Red", "Green", "Blue"}, 0);
		//5. Use an if/else statement to set the pen color that the user requested
		if(colorchoice==0) {
			robot.setPenColor(255,0,0);
		}
		else if(colorchoice==1) {
			robot.setPenColor(0,255,0);
		}
		else if(colorchoice==2){
			robot.setPenColor(0,0,255);
		}
		else {
			JOptionPane.showMessageDialog(null, "I guess I'll choose the color then");
			robot.setPenColor(rColor,gColor,bColor);
		}
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		for (int i = 0; i < 4; i = i++) {
			robot.move(100);
			robot.turn(20);
		}

		



	}
}
