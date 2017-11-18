import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cuteness_tv implements ActionListener {
	//Make a user interface with 3 buttons that will play different videos depending on which button is clicked. Use the methods below to play the cutest videos ever.
	JFrame JFrame = new JFrame();
    JPanel JPanel = new JPanel();
	JButton Jbutton1 = new JButton("ADORABLE DUCKS");
	JButton Jbutton2 = new JButton("FROGY");
	JButton Jbutton3 = new JButton("PINK FLUFFY UNICORNS DANCING ON RAINBOWS");
	 public void createUI() {
	      	JFrame.add(JPanel);
		    JPanel.add(Jbutton1);
		    JPanel.add(Jbutton2);
		    JPanel.add(Jbutton3);
		    JFrame.setSize(3000, 3000);
		    JFrame.setVisible(true);
		    Jbutton1.addActionListener(this);
		    Jbutton2.addActionListener(this);
		    Jbutton3.addActionListener(this);
	    }
	 static Cuteness_tv Cuteness = new Cuteness_tv();
	public static void main(String[] args) {
	
	Cuteness.createUI();
	}
	
	void showDucks() {
			playVideo("Drirjl5K9Yk");
		}

		void showFrog() {
			playVideo("aSjCb-FfxhI");
		}
		
		void showFluffyUnicorns() {
			playVideo("qRC4Vk6kisY");
		}

		void playVideo(String videoID) {
			try {
		URI uri = new URI("https://www.youtube.com/watch?v=" + videoID /*+ "?autoplay=1"*/);
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(e.getSource());
			if(e.getSource() == Jbutton1) {
				Cuteness.showDucks();
				System.out.println("Hi");
			}
			else if(e.getSource() == Jbutton2) {
				Cuteness.showFrog();
				System.out.println("Hi");
			}
			else if(e.getSource() == Jbutton3) {
				Cuteness.showFluffyUnicorns();
			}
			
		}

}

