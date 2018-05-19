import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Jokes implements ActionListener{
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton b1 = new JButton("Submit");
JButton b2 = new JButton("hint");
JTextField field = new JTextField(20);
JLabel label = new JLabel("Inside a green house, there is a white house. Inside the white house, there is a red house. Inside the red house, there is a lot of babies. What is it? (please answer with the first letter of your answer being capitalized)");

public static void main(String[] args) {
	Jokes joke = new Jokes();
	joke.createUI();
}

public void createUI() {
	frame.add(panel);
	panel.add(b1);
	panel.add(field);
	panel.add(b2);
	panel.add(label);
	frame.setVisible(true);
	frame.pack();
	frame.setSize(1500, 200);
	b1.addActionListener(this);
	b2.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource().equals(b1)) {
		if(field.getText().equals("Watermelon")) {
			JOptionPane.showMessageDialog(null, "Nice! How did you know the answer?");
		}else {
			JOptionPane.showMessageDialog(null, "Nope. Its Watermelon");
		}
	}else {
		JOptionPane.showMessageDialog(null, "It has something to do with food.");
	}
}
}
