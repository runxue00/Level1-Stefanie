import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{
	JButton jokeButton = new JButton();
	JButton punchLineButton = new JButton();
	public static void main(String[] args) {
	// 1.Make a ChuckleClicker class, a main method and a makeButtons method. Put a pop-up in the makeButtons method and get it working. 
		//You will need to instantiate your class and call method an instance of it. 
		ChuckleClicker chuckleclicker = new ChuckleClicker();
		chuckleclicker.makeButtons();
	// 2.Make a JFrame in makeButtons() method and get it to show.
    
	// 3.Add a JPanel and two JButtons and get them to show up like this:

	// 4.*[Optional] Customize your GUI with setText, setSize, etc.

	// 5.Make a pop-up that says “hi” when either of the buttons are pressed. You will need to add listeners to the buttons for this to work.

	// 6.Check if the ActionEvent came from the joke button or the punchline button.  
	//if(arg0.getSource() == jokeButton)
	//You might need to move the declaration of your buttons above the the makeButtons() method.

	// 7.Use JOptionPane to print the joke or the punchline depending on which button was clicked.
	}
	void makeButtons(){
		JFrame jFrame = new JFrame();
		jFrame.setVisible(true);
		JPanel jPanel = new JPanel();
		jFrame.add(jPanel);
		jPanel.add(jokeButton);
		jPanel.add(punchLineButton);
		jokeButton.addActionListener(this);
		punchLineButton.addActionListener(this);
		jFrame.setSize(300, 60);
		jokeButton.setText("jokeButton");
		punchLineButton.setText("punchLineButton");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if(e.getSource() == jokeButton) {
			 JOptionPane.showMessageDialog(null, "Who says sticks and stones may break my bones, but words will never hurt me?");
		 }
		 if(e.getSource() == punchLineButton) {
			 JOptionPane.showMessageDialog(null, "A guy who has never been hit with a dictionary.");
		 }
		 
	}
}
