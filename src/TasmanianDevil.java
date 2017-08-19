import javax.swing.JOptionPane;

public class TasmanianDevil {

	String name;
	int toes;
	int eyes;
	int nose;
	TasmanianDevil(String name, int toes, int eyes, int nose){
		this.name = name;
		this.toes = toes;
		this.eyes = eyes;
		this.nose = nose;
	}
	
	public String toString() {
		String str = "My animal's name is " + this.name + "; she has " + this.nose + " nose, " + this.eyes + " eyes, and " + this.toes + " toes.";
		return str;
	}
	
public static void main(String[] args) {
	TasmanianDevil t1 = new 	TasmanianDevil("Yulinda", 10, 2, 1);
	JOptionPane.showMessageDialog(null, t1.toString());
}	
}
	
	