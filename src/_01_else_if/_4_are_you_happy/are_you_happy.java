package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class are_you_happy {
public static void main(String[]args) {
	int q1 = JOptionPane.showOptionDialog(null, "are you happy?", "happiness meter", 0, 
			JOptionPane.INFORMATION_MESSAGE, null, new String[] {"yes", "no"}, 0);
	if(q1 == 0) {
		keep();
	}
	else {
		int q2 = JOptionPane.showOptionDialog(null, "do you want to be happy?", "happiness meter", 0, 
				JOptionPane.INFORMATION_MESSAGE, null, new String[] {"yes", "no"}, 0);
		if(q2==0) {
			JOptionPane.showMessageDialog(null, "then the only way to do that is to change something");
		}
		else {
			keep();
		}
	}
	
	}
static void keep() {
	JOptionPane.showMessageDialog(null, "then keep being yourself");
}
	
}
