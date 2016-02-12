package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot r2d2=new Robot();
r2d2.setSpeed(1000);
r2d2.penDown();
r2d2.turn(90);		
r2d2.penDown();
r2d2.sparkle();	
r2d2.setRandomPenColor();
r2d2.move(360);
r2d2.setRandomPenColor();
r2d2.turn(90+90+90);
r2d2.setRandomPenColor();
r2d2.move(360);
r2d2.turn(90+90+90);
r2d2.setRandomPenColor();
r2d2.move(360);
r2d2.turn(90+90+90);
r2d2.setRandomPenColor();
r2d2.move(360);
r2d2.setRandomPenColor();

	}
	
	
	
}
