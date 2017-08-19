import javax.swing.JOptionPane;

public class Cat {

	private String name;
	private int lives = 9;

	Cat(String name) {
		this.name = name;
	}

	 void meow() {
		JOptionPane.showMessageDialog(null, "meeeeeooooooooooowwwwwwwww!!");
	}

	public void printName() {
		if (name == null)
			JOptionPane.showMessageDialog(null, "i don't know my own name!");
		else
			JOptionPane.showMessageDialog(null, "my name is " + name);
	}

	void kill() {
		lives--;
		if (lives > 0)
			JOptionPane.showMessageDialog(null, "nice try, but I still have " + lives + " lives left");
		else if (lives < 0)
			JOptionPane.showMessageDialog(null, "that's overkill yo!");
		else
			JOptionPane.showMessageDialog(null, "DEAD CAT :(");
	}

	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */

		// 1. Make the Cat meow
		Cat cat = new Cat("Coopurr");
		cat.meow();
		// 2. Get the Cat to print it's name
        cat.printName();
		// 3. Kill the Cat!
        for(int i = 0; i < 9; i++) {
        	cat.kill();
        }
        

	}
}

