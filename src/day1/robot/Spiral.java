package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {

<<<<<<< HEAD
		Robot bb8 = new Robot();
		
		bb8.penDown();
		bb8.setSpeed(10);
		
		for (int i = 0; i < 75000; i++) {
=======
		// 4. Do the following (steps 6-9) 75 times
>>>>>>> jointheleague/master

	
    bb8.setRandomPenColor();
	
	bb8.move(5*i);
	bb8.turn(360/7);
	
	
	// 9. Set the pen width to i
	bb8.setPenWidth(i);	
		
		}
	}
}
