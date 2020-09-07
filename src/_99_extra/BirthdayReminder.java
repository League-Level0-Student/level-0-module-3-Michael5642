
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "March 25th";
		String dadsBirthday = "December 20th";
		String myBirthday = "April 28th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birth = JOptionPane.showInputDialog("which birthday do you want to know");
		// 3. Print out what the user typed
		System.out.println(birth);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(birth.equalsIgnoreCase("mom")) {
			System.out.println(momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if(birth.equalsIgnoreCase("dad")) {
			System.out.println(dadsBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
		else if(birth.equalsIgnoreCase("yours")) {
			System.out.println(myBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry. I don't remember that birthday!");
		}
	} 
}
