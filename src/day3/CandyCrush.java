package day3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		
		String q =	JOptionPane.showInputDialog(null, "who don't you like");
		JOptionPane.showMessageDialog(null, "You totally have a crush on "+q);
		String y =JOptionPane.showInputDialog("what is your best friends name?");
		JOptionPane.showMessageDialog(null, "your friend "+ y +" is as sweet as candy");
	} 
}



