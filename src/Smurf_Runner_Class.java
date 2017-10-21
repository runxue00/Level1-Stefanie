import javax.swing.JOptionPane;

public class Smurf_Runner_Class {
public static void main(String[] args) {
	Smurf s1 = new Smurf("Handy Smurf");
	Smurf s2 = new Smurf("Papa Smurf");
	Smurf s3 = new Smurf("Smurfette");
	JOptionPane.showMessageDialog(null, s1.getName());
	s1.eat();
	JOptionPane.showMessageDialog(null, s2.getName());
	JOptionPane.showMessageDialog(null, s2.getHatColor());
	JOptionPane.showMessageDialog(null, s2.isGirlOrBoy());
	JOptionPane.showMessageDialog(null, s3.getName());
	JOptionPane.showMessageDialog(null, s3.getHatColor());
	JOptionPane.showMessageDialog(null, s3.isGirlOrBoy());
}
}
