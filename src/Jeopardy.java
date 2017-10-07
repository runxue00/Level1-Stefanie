

 // Copyright Wintriss Technical Schools 2013
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.io.File;

/* This recipe is to be used with the Jeopardy Handout: http://bit.ly/1bvnvd4 */

public class Jeopardy implements ActionListener {
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton, fourthButton;
	
	private JPanel quizPanel;
	int score = 0;
	JLabel scoreBox = new JLabel("0");
	int buttonCount = 0;

	public static void main(String[] args) {
		new Jeopardy().start();
	}

	private void start() {
		JFrame frame = new JFrame();
		quizPanel = new JPanel();
		frame.setLayout(new BorderLayout());
		JPanel h = createHeader("Catz");
		
		
		
        frame.setVisible(true);
	
		frame.setTitle(null);
		
		
		
		quizPanel.add(h);
		
        frame.add(quizPanel);
		
		
        firstButton = createButton("$100");
        

		quizPanel.add(firstButton);
		
		
		// 9. Use the secondButton variable to hold a button using the createButton method
		//createButton(secondButton);
		secondButton = createButton("$200");
		thirdButton = createButton("$300");
		fourthButton = createButton("$400");
		
		// 10. Add the secondButton to the quizPanel
		quizPanel.add(secondButton);
		quizPanel.add(thirdButton);
		quizPanel.add(fourthButton);
		// 11. Add action listeners to the buttons (2 lines of code)
	    firstButton.addActionListener(this);
	    secondButton.addActionListener(this);
	    thirdButton.addActionListener(this);
	    fourthButton.addActionListener(this);
		// 12. Fill in the actionPerformed() method below
				
		frame.pack();
		quizPanel.setLayout(new GridLayout(buttonCount+1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height, Toolkit.getDefaultToolkit().getScreenSize().width);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/*
	 * 13. Use the method provided to play the Jeopardy theme music 
	 * 
	 * 14. Add buttons so that you have $200, $400, $600, $800 and $1000 questions
	 *
	 * [optional] Use the showImage or playSound methods when the user answers a question 
	 */
	
	private JButton createButton(String dollarAmount) {
		// Create a new JButton
		JButton b = new JButton();
		// Set the text of the button to the dollarAmount
		b.setText(dollarAmount);
		
		// Increment the buttonCount (this should make the layout vertical)
	buttonCount++;
		// Return your new button instead of the temporary button
		
		return b;
	}

	public void actionPerformed(ActionEvent arg0) {
		// Remove this temporary message:
		//JOptionPane.showMessageDialog(null,"pressed " + ((JButton)arg0.getSource()).getText() + " button");

		// Use the method that plays the jeopardy theme music.
		playJeopardyTheme();
		JButton buttonPressed = (JButton) arg0.getSource();
		// If the buttonPressed was the firstButton
		if(buttonPressed==firstButton){
			askQuestion("What is a cat's scientific name?", "Felis Catus", 100);
			                          
		}
		if(buttonPressed==secondButton){
			askQuestion("How high can a cat fall without dying(in floors)?", "32", 200);
			                          
		}
		if(buttonPressed==thirdButton){
			askQuestion("How old was the longest living cat(in years)?", "38", 300);
			                          
		}
		if(buttonPressed==fourthButton){
			askQuestion("How long was the longest cat(in centimeters)?", "118", 400);
			                          
		}
			
		
			// Call the askQuestion() method
			
			// Fill in the askQuestion() method. When you play the game, the score should change.
		
		// Or if the buttonPressed was the secondButton


			// Call the askQuestion() method with a harder question
			
		
		// Clear the button text (set the button text to nothing)
		
	}

	private void askQuestion(String question, String correctAnswer, int prizeMoney) {
		// Remove this temporary message
		
		// Use a pop up to ask the user the question
		String answer = JOptionPane.showInputDialog(question);
		// If the answer is correct
		if(answer.equalsIgnoreCase(correctAnswer)){
			JOptionPane.showMessageDialog(null, "CORRECT");
			score+=prizeMoney;
			updateScore();
		}else{
			JOptionPane.showMessageDialog(null, "INCORRECT");
			score-=prizeMoney;
			updateScore();
			JOptionPane.showMessageDialog(null, correctAnswer);
		}
			
			// Increase the score by the prizeMoney
			
			
			// Call the updateScore() method
			
			// Pop up a message to tell the user they were correct
			//DONE
		
		
		// Otherwise
		
			// Decrement the score by the prizeMoney
			
			// Pop up a message to tell the user the correct answer
			
			// Call the updateScore() method
			
		
	}


public void playJeopardyTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/jeopardy.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void playSound(String fileName) {
		AudioClip scream = JApplet.newAudioClip(getClass().getResource(fileName));
		scream.play();
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}



