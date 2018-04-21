import javax.swing.JOptionPane;

public class Name {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("Input your name please.");
	for(int i = 0 ; i<input.length() ; i++) {
		for(int c = 0; c<=input.length(); c++) {
		System.out.print(input.charAt(i));
	}
		System.out.println();
}
	
}
}