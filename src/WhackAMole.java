import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton mole = new JButton("Mole");

	// 1. Make a drawButtons method that takes a random number as a parameter. It
	// should make a GUI like this, but the “mole!” location is random.
	// [Hint: set the size of the frame rather than packing it.]
	public static void main(String[] args) {
		Random rand = new Random();
		int random = rand.nextInt(21);
		new WhackAMole().createUI(random);

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(mole)) {
			speak("You are a wonderful and bright human being!!");
		} else {
			speak("You SUCK!!");
		}
	}

	public void createUI(int random) {
		frame.add(panel);
		mole.addActionListener(this);
		for (int i = 0; i < 21; i++) {
			if (i == random) {
				panel.add(mole);
			} else {
				JButton button = new JButton();
				button.addActionListener(this);
				panel.add(button);
			}

		}
		frame.setSize(630, 200);
		frame.setVisible(true);
	}

	// 2.If they click on a button other than “mole!”, use this speak() method to
	// call them a dork.
	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 3.Dispose of the frame and draw the buttons anew.

	// 4.After they’ve whacked 10 moles, call this endGame() method.
	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

	// 5.Progressively insult them if they hit something other than the mole!
	// button.
	// If they get click an empty button twice, call them an idiot.
	// If they click an empty button three times, call them a moron.
	// If they click an empty button four times, call them a complete waste of
	// atoms.
	// [Use a switch statement for extra amazingness.]

	// 6.Call this playSound() method when they hit a mole.
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
	//

}
