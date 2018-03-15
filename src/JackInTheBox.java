import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JackInTheBox implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	int times;
	int limit;
	Random r = new Random();

	public static void main(String[] args) {
		JackInTheBox j = new JackInTheBox();
		j.createUI();
	}

	private void createUI() {
		limit = r.nextInt(10);
		frame.add(panel);

		frame.setVisible(true);

		button.setText("Try");

		button.addActionListener(this);

		panel.add(button);

		// frame.pack();
		frame.setSize(200, 55);

		frame.setTitle("Jack In The Box");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			times++;
		}
		if (times == limit) {
			JOptionPane.showMessageDialog(null, "Nice persistence");
			limit = r.nextInt(10);
			times=0;
		}

	}
}
