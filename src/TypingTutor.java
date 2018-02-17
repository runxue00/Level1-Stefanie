import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	char currentLetter = generateRandomLetter();
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	static int counter = 0;

	public static void main(String[] args) {
		TypingTutor s = new TypingTutor();
		s.CreateUI();

	}

	public void CreateUI() {
		JFrame frame = new JFrame();
		frame.setTitle("Type or Die!!! MUAHAHAHAHAHAHA");
		frame.add(panel);
		frame.addKeyListener(this);
		panel.add(label);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText("" + currentLetter);
		frame.pack();
		frame.setVisible(true);
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyChar() == currentLetter) {
			System.out.println("You pressed the correct letter!");
			panel.setBackground(Color.green);
			counter++;
			if (counter == 10) {
				showTypingSpeed(10);
			}
		} else {
			panel.setBackground(Color.red);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You typed: " + currentLetter);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter);
	}

	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}

	Date timeAtStart = new Date();

}
