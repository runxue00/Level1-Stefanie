
// Copyright Wintriss Technical Schools 2013

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class drumKit extends MouseAdapter {

	JLabel drumLabelWithImage;
	JLabel drumLabel2WithImage;

	public static void main(String[] args) throws Exception {
		new drumKit().getGoing();
	}

	private void getGoing() throws MalformedURLException {
		// 1. Make a JFrame variable and initialize it using "new JFrame()"
		JFrame j = new JFrame();
		// 2. Make the frame visible
		j.setVisible(true);
		// 3. Set the size of the frame
		j.setSize(500, 500);
		// 4. Set the title of the frame
		j.setTitle(null);
		// 5. Make a JPanel and initialize it.
		JPanel j2 = new JPanel();
		// 6. Add the panel to the frame. (The panel is invisible.)
		j.add(j2);
		// 7. Download an image of a drum from the Internet. Drop it into your Eclipse project under "default package".

		// 8. Put the name of your image in a String variable.
		String drum = "Drum.jpg";
		String drum2 = "drum2.jpg";
		// 9. Edit the next line to use your String variable
		drumLabelWithImage = createLabelImage(drum);
		drumLabel2WithImage = createLabelImage(drum2);
		// 10. Add the image to the panel
		j2.add(drumLabelWithImage);
		j2.add(drumLabel2WithImage);
		// 11. Set the layout of the panel to "new GridLayout()"
		j2.setLayout(new GridLayout());
		// 12. call the pack() method on the frame
		j.pack();
		// 13. add a mouse listener to drumLabelWithImage.
		drumLabelWithImage.addMouseListener(this);
		drumLabel2WithImage.addMouseListener(this);

	}

	public void mouseClicked(MouseEvent e) {
		// 14. When the mouse is clicked, print "mouse clicked"
		JOptionPane.showMessageDialog(null, "Mouse Clicked");
		JLabel drumClicked = (JLabel) e.getSource();
		// 15. Download a drum sound and drop it into your "default package". You can find it on freesound.org. To
		// download it, log in as leagueofamazing/code4life.

		// 16. If they clicked on the drumImage...
if (e.getSource() == drumLabelWithImage) {
		playSound("drum sound.wav");
}else{
	playSound("drum2 sound.wav");
}
		// 17. ...use the playSound method to play a drum sound.

		// 18. Add more images to make a drumkit. Remember to add a mouse listener to each one.

	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
