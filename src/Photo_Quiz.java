
 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Photo_Quiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
		String cat = "https://i.ytimg.com/vi/95ImXirddgU/hqdefault.jpg";
		String cat2 = "https://s-media-cache-ak0.pinimg.com/736x/57/b8/48/57b848296c13bc5c1c0775b68592ae86.jpg";
		// 2. create a variable of type "Component" that will hold your image
        Component c;
        Component c2;
		// 3. use the "createImage()" method below to initialize your Component
        c = createImage(cat);
        c2 = createImage(cat2);
		// 4. add the image to the quiz window
        quizWindow.add(c);
		// 5. call the pack() method on the quiz window
        quizWindow.pack();
		// 6. ask a question that relates to the image
        String c1 = JOptionPane.showInputDialog("Are cats good at singing and karoake?");
		// 7. print "CORRECT" if the user gave the right answer
        if(c1.equalsIgnoreCase("yes")) {
        	JOptionPane.showMessageDialog(null, "CORRECT");
        }
		// 8. print "INCORRECT" if the answer is wrong
        if(c1.equalsIgnoreCase("no")) {
        	JOptionPane.showMessageDialog(null, "INCORRECT");
        }else if(!(c1.equalsIgnoreCase("yes"))){
        	JOptionPane.showMessageDialog(null, "That is not an answer");
        }
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
        quizWindow.remove(c);
		// 10. find another image and create it (might take more than one line of code)
        quizWindow.add(c2);
		// 11. add the second image to the quiz window
        quizWindow.pack();

		// 12. pack the quiz window

		// 13. ask another question
        String c21 = JOptionPane.showInputDialog("Do donuts complete you?");
		// 14. check answer, say if correct or incorrect, etc.
        if(c21.equalsIgnoreCase("yes")) {
        	JOptionPane.showMessageDialog(null, "CORRECT");
        }
        if(c21.equalsIgnoreCase("no")) {
        	JOptionPane.showMessageDialog(null, "INCORRECT");
        }else if(!(c21.equalsIgnoreCase("yes"))){
        	JOptionPane.showMessageDialog(null, "That is not an answer");
        }
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}

