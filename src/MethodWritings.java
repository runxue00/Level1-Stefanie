import java.util.Random;

import javax.swing.JOptionPane;

public class MethodWritings {
public static void main(String[] args) {
	//JOptionPane.showMessageDialog(null, whichPresent("Ashley"));
	//JOptionPane.showMessageDialog(null, doPigsEat("Potato"));
	JOptionPane.showMessageDialog(null, getLuckyNumber());
}
/////////////////////////////////////////////////////////////////////////////////////////
static String whichPresent(String friendName) {
	if (friendName=="Ashley") {
		return "squishies";
	}
	else if(friendName=="Natasha") {
		return "Makeup";
	}
	else if(friendName=="Kalin") {
		return "Another Bun Bun";
	}else {
		return "I have no idea who that is...      Sorry";
	}
}
/////////////////////////////////////////////////////////////////////////////////////////
static boolean doPigsEat(String Food) {
	if(Food.equals("bananas")) {
		return true;
	}else {
		return false;
	}
}
/////////////////////////////////////////////////////////////////////////////////////////
static int getLuckyNumber() {
	Random rand = new Random();
	return rand.nextInt(654)+13;
}
}
