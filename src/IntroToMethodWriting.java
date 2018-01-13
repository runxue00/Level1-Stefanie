import javax.swing.JOptionPane;

public class IntroToMethodWriting {
	
	
	
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, isEven(112));
}



public static void iRock() {
	JOptionPane.showMessageDialog(null, "Stefanie rocks!!");
}
//////////////////////////////////////////////////////////////////////////////////////////////////////
public static void rocker(String name) {
	JOptionPane.showMessageDialog(null, name + " rocks!!");
}
//////////////////////////////////////////////////////////////////////////////////////////////////////
public static void truth(String singer) {
	if(singer.equals("Justin Beiver")) {
		JOptionPane.showMessageDialog(null, singer + " is annoying");
	}else {
		JOptionPane.showMessageDialog(null, singer + " is awesome");
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////////////
public static void repeat(String animal, int repeat) {
	for (int i = 0; i < repeat; i++) {
		JOptionPane.showMessageDialog(null, animal);
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////////////
public static int add(int int1, int int2) {
	return int1 + int2;
}
//////////////////////////////////////////////////////////////////////////////////////////////////////
public static boolean isEven(int i) {
	if(i%2==0) {
		return true;
	}else {
		return false;
	}
}
}



















