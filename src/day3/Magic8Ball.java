package day3;

import javax.swing.JOptionPane;
import java.util.Random;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		// 2. Make a variable that will hold a random number and put a random number into this variable using "new
		// Random().nextInt(4)"
		int randomNumber = 0;
		 randomNumber = new Random().nextInt(4);
		// 3. Print out this variable
		JOptionPane.showMessageDialog(null, "the value is  " + randomNumber);
		// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog(null, "enter a question");
		// 5. If the random number is 0
		if (randomNumber == 0) {
			JOptionPane.showMessageDialog(null, "yes");
		}
		// -- tell the user "Yes"

		// 6. If the random number is 1
		else if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "no");
		}
		// -- tell the user "No"

		// 7. If the random number is 2
		else if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "Mabe you should ask google");
		}
		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
		else if (randomNumber == 3) {
			JOptionPane.showInputDialog(null, "write your own answer");
		}
		// -- write your own answer

	}

}
