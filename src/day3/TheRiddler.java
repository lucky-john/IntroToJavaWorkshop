package day3;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {


			// 1. Make a variable to hold the score
			int score=0;
			// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle=	JOptionPane.showInputDialog(null,"What is greater than God more, evil than the devil,the poor have it,the rich need it and if you eat it, you'll die?");


			// 4. If they got the answer right, pop up "correct!" and increase the score by one
		 	if (riddle.equals ("nothing" )) {
			JOptionPane.showMessageDialog(null, "your correct");
			score=score+1;
			}
			// 5. Otherwise, say "wrong" and tell them the answer
		 	JOptionPane.showInternalMessageDialog(null, "your incorrect");
			// 6. Add some more riddles

			// 2. Make a pop up to show the score.
			JOptionPane.showMessageDialog(null,"your score is "+score);
		}
		}

