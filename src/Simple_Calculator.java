import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Simple_Calculator implements ActionListener{
	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton multiply = new JButton();
	JButton divide = new JButton();
	JTextField textfield1 = new JTextField(10);
	JTextField textfield2 = new JTextField(10);
	JLabel label = new JLabel();
	public static void main(String[] args) {
Simple_Calculator simpleCalculator = new Simple_Calculator();
simpleCalculator.makeButtons();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == add) {
		  String text = textfield1.getText();
		  String secondtext = textfield2.getText();
		  int integer = Integer.parseInt(secondtext);
		 int secondinteger = Integer.parseInt(text);
		 int sum = integer+secondinteger;
		  label.setText(sum+"");
		 }
		if(e.getSource() == subtract) {
			 String secondtext = textfield2.getText();
			String text = textfield1.getText();
			  int integer = Integer.parseInt(secondtext);
			 int secondinteger = Integer.parseInt(text);
			 int difference = secondinteger-integer;
			  label.setText(difference+"");
			 }
		if(e.getSource() == multiply) {
			  String text = textfield1.getText();
			  String secondtext = textfield2.getText();
			  int integer = Integer.parseInt(secondtext);
			 int secondinteger = Integer.parseInt(text);
			 int product = integer*secondinteger;
			  label.setText(product+"");
			 }
		if(e.getSource() == divide) {
			 String secondtext = textfield2.getText();
			String text = textfield1.getText();
			  int integer = Integer.parseInt(secondtext);
			 int secondinteger = Integer.parseInt(text);
			 int quotient = secondinteger/integer;
			  label.setText(quotient+"");
			 }
	}
	void makeButtons(){
		JFrame JFrame = new JFrame();
		JFrame.setVisible(true);
		JPanel JPanel = new JPanel();
		JFrame.add(JPanel);
		JPanel.add(textfield1);
		JPanel.add(textfield2);
		JPanel.add(add);
		JPanel.add(subtract);
		JPanel.add(multiply);
		JPanel.add(divide);
		JPanel.add(label);
		add.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		JFrame.setSize(600, 200);
		add.setText("add");
		subtract.setText("sub");
		multiply.setText("mul");
		divide.setText("div");
	}
}
