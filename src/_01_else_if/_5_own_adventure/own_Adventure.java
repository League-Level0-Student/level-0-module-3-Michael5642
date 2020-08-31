package _01_else_if._5_own_adventure;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class own_Adventure {
	public static void main(String[] args) {
		Random chance = new Random();
		int playerHealth = 200;
		int monsterHealth = 500;
		int playerAttack = 0;
		int playerBlockB = 0;
		
		
		JOptionPane.showMessageDialog(null, "Slay the monster!");
		JOptionPane.showMessageDialog(null, "but first lets eat something that will help us slay the monster");
		
		int mealChoice = JOptionPane.showOptionDialog(null, "which meal will you eat?: Healthy Fish, Strong Meat, or Tough Salad?", "Meal buff", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Healthy fish", "Strong Meat", "Tough Salad"}, null); 
		if(mealChoice == 0) {
			playerHealth = playerHealth + 100;
			JOptionPane.showMessageDialog(null, "you feel like you can withstand more attacks!");
		}
		else if(mealChoice == 1) {
			playerAttack = playerAttack + 50;
			JOptionPane.showMessageDialog(null, "you feel as if you can overpower the monster!");
		}
		else if(mealChoice == 2) {
			playerBlockB = playerBlockB+15;
			JOptionPane.showMessageDialog(null, "you feel as if you no amount of attacks can make a scratch on you!");
		}
		else {
			JOptionPane.showMessageDialog(null, "looks like we ran out of stock. I guess you'll have to hunt on an empty stomach.");
		}
		JOptionPane.showMessageDialog(null, "Now, onto the hunt!");
		while(playerHealth>0&&monsterHealth>0) {
			int playerDamage = chance.nextInt(50-25+1)+25;
			int playerDodge = chance.nextInt(6)+1;
			int monsterAttack = chance.nextInt(20-5+1)+10;
			int playerBlockA = chance.nextInt(10-5+1)+5;
			int playerHeal = chance.nextInt(10-5+1)+5;
		int inputOption = JOptionPane.showOptionDialog(null, "do you wish to attack, dodge, block, or heal?", "Action", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Attack", "dodge", "block", "heal"}, null);
		System.out.println("monster attack " + monsterAttack);
		if(inputOption==0) {
			monsterHealth = monsterHealth-(playerDamage+playerAttack);
			playerHealth = playerHealth - monsterAttack;
		}
		
		else if(inputOption==1) {
			if(playerDodge<=3) {
				monsterAttack = 0;
				JOptionPane.showMessageDialog(null, "you dodged!");
			}
			else {
				playerHealth = playerHealth - monsterAttack;
			}
		System.out.println("player dodge " + playerDodge);
		}
		else if(inputOption==2) {
			playerHealth = playerHealth -(monsterAttack-(playerBlockA+playerBlockB));
			System.out.println("player block " + playerBlockA);
		}
		else if(inputOption==3) {
			playerHealth = playerHealth + playerHeal;
		}
		else {
			JOptionPane.showMessageDialog(null, "why didn't you do anything?");
			playerHealth = playerHealth - monsterAttack;
		}
		
		System.out.println("player attack " + playerDamage);
		JOptionPane.showMessageDialog(null, "player: " + playerHealth + " monsterHealth" + monsterHealth, "current health", 0);
		if(playerHealth<=0) {
			JOptionPane.showMessageDialog(null, "You've fainted...");
		}
		if(monsterHealth<=0) {
			JOptionPane.showMessageDialog(null, "The monster has been slain!");
		}
			}
		}
	}


