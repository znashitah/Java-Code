package gui.graphics;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Twobuttonmain {

	public static void main(String[] args) {
		Twobuttonmain button2 = new Twobuttonmain();
		button2.go();

	}

	public void go() {
		JPanel rightpanel = new JPanel();
		JPanel leftpanel = new JPanel();
		JPanel middlepanel = new JPanel();
		JPanel northpanel = new JPanel();
		JPanel southpanel = new JPanel();
		JFrame newframe = new JFrame();
		JLabel label1 = new JLabel();
		JButton b1 = new JButton("change the label");
		JButton b2 = new JButton("change circle");
		ChangeLabel cl = new ChangeLabel(label1); // add label object then call button to perform function of
		BPaintPanel pp = new BPaintPanel();
		ColourChange cc = new ColourChange(pp);
		b2.addActionListener(cc); // actionlistner
		b1.addActionListener(cl);
		newframe.setVisible(true);
		newframe.setSize(1000, 1000);
		newframe.setTitle("iam 2 button frame");
		newframe.add(rightpanel, BorderLayout.EAST);
		newframe.add(pp, BorderLayout.CENTER);
		newframe.add(southpanel, BorderLayout.SOUTH);
		newframe.add(northpanel, BorderLayout.NORTH);
		newframe.add(leftpanel, BorderLayout.WEST);
		rightpanel.add(b1);
		southpanel.add(b2);

		label1.setText("iam label here");
		leftpanel.add(label1);

	}

}
