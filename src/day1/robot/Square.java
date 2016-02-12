package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Square {
public static void main(String[] args) {
Robot c3po= new Robot();
c3po.penDown();
for (int i = 0; i < 4000 ; i++) {
c3po.setSpeed(4000);
c3po.move(200);
c3po.turn(90);
c3po.setRandomPenColor();



} 
}
}
