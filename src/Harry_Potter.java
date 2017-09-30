import javax.swing.JOptionPane;

public class Harry_Potter {

	private boolean cloakOn;
	
	Harry_Potter() {
		JOptionPane.showMessageDialog(null, "making Harry Potter...");
	}

	void castSpell(String spell){
		JOptionPane.showMessageDialog(null, "casting spell: " + spell);
	}

	void makeInvisible(boolean invisible) {
		this.cloakOn = invisible;
		
		if (cloakOn)
			JOptionPane.showMessageDialog(null, "Harry is invisible");
		else
			JOptionPane.showMessageDialog(null, "Harry is visible");
	}

	void spyOnSnape() {
		JOptionPane.showMessageDialog(null, "Harry sees Professor Snape doing nefarious things.");
	}

	public static void main(String[] args) {
		// 1. make harry potter
		Harry_Potter harry = new Harry_Potter();
		// 2. become invisible
		harry.makeInvisible(true);
		// 3. spy on professor snape
		harry.spyOnSnape();
		// 4. become visible again
		harry.makeInvisible(false);
		// 5. cast a “stupefy” spell
		harry.castSpell("stupefy");
	}

}

