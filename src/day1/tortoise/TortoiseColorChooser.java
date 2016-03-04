package day1.tortoise;

//Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class TortoiseColorChooser {
	public static void main(String[] args) {
		Robot seven = new Robot();
		while (true) {
			String bob = JOptionPane.showInputDialog("what color would you like the tortise to draw");
			// 4. use an if/else statement to set the pen color that the user requested
			if (bob.equals("blue")) {
				seven.setPenColor(Color.blue);
			} else {
				seven.setRandomPenColor();

			}
			// 5. if the user doesn’t enter anything, choose a random color

			// 6. put a loop around your code so that you keep asking the user for more colors & drawing them

			seven.setPenWidth(90);
			seven.setX(720);
			seven.setY(395);
			seven.setSpeed(10);
			seven.penDown();
			seven.move(390);
			seven.turn(120);
			seven.move(390);
			seven.turn(120);
			seven.move(390);
			
		}
	}
}
