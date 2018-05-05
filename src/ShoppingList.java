import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ShoppingList implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField textfield = new JTextField(20);
	JButton b = new JButton("Submit");

	public void createUI() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(b);
		panel.add(textfield);
		frame.pack();
		frame.setSize(450, 300);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		ShoppingList l = new ShoppingList();
		l.createUI();
	}
}
