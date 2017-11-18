//Put answer in answer box

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener{
	 JFrame JFrame = new JFrame();
     JPanel JPanel = new JPanel();
    JTextField textfield = new JTextField(20);
    JTextField textfield2 = new JTextField(20);
    JButton Jbutton = new JButton("Convert");
    
    
    public void createUI() {
    	JFrame.add(JPanel);
	    JPanel.add(textfield);
	    JPanel.add(textfield2);
	    JPanel.add(Jbutton);
	    JFrame.setSize(400, 300);
	    JFrame.setVisible(true);
	    Jbutton.addActionListener(this);
    }
    
    
    
    
    
    
	public static void main(String[] args) {
		BinaryConverter binaryConverter = new BinaryConverter();
		binaryConverter.createUI();
	//We’re going to make an application that converts binary codes (8-bits) into letters.

	//You’ll need a JFrame and a JPanel.
     
     
	//On the panel, put two text fields and a button. A text field is made like this:
//JTextField answer = new JTextField(20);



	//here is a method that will do the conversion for you.

	    }
	
	 int convert(String binary) {
			if(binary.length() != 8){
				JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
				return 0;
			}
			// if(!Pattern.matches("\2", binary)) {
			//	 JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			//		return 0;
			// }
			try {
				int asciiValue = Integer.parseInt(binary, 2);
				return asciiValue;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
				//question.setText("");
				return 0;
			}
		}






	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if(e.getSource() == Jbutton) {
			String text = textfield.getText();
			int t = convert(text);
			String i = Integer.toString(t);
		    textfield2.setText(i);
			
		}
	}
	

	
}
