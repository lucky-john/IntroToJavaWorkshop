package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		
		String answer= JOptionPane.showInputDialog("do you know how to write code");
		
		if (answer.equals("yes")) {
		System.out.println("you will rule the world");
		
		}
		
		else {
			System.out.println("good luck washing dishes");
			
		}
	}
}

