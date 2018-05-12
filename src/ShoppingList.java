import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ShoppingList implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JTextField textfield = new JTextField(20);
    JButton b = new JButton("Submit");
    JLabel label = new JLabel();

	public void createUI() {
		frame.setVisible(true);
		panel3.add(panel1);
		panel3.add(panel2);
		frame.add(panel3);
		panel1.add(b);
		panel1.add(textfield);
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
		panel2.add(label);
		frame.pack();
		frame.setSize(450, 300);
		b.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
   if(e.getSource().equals(b)) {
	  String userInput = textfield.getText();
	  label.setText("-" + userInput);
   }
	}

	public static void main(String[] args) {
		ShoppingList l = new ShoppingList();
		l.createUI();
	}
}
