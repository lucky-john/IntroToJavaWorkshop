import javax.swing.JOptionPane;

public class UnBirthday {
	public static void main(String[] args) {

		String bday = JOptionPane.showInputDialog("when is your birthday");
		System.out.println("the user said " + bday);
		if (bday.equals("December 5")) {
			JOptionPane.showInputDialog(null, "happy birthday");

		} else {
			JOptionPane.showMessageDialog(null,"happy un-birthday");
			
		}
	}
}
