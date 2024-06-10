package gui.graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TwoButton1 {
	JFrame frame;
	JLabel label;

	MyDrawPanel drawpanel;

	public static void main(String[] args) {
		TwoButton1 gui = new TwoButton1();
		gui.go();
	}

	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton labelbutton = new JButton("change label");
		labelbutton.addActionListener(new LabelListener());
		JButton colorbutton = new JButton("change circle");
		colorbutton.addActionListener(new ColorListener());
		label = new JLabel("iam a new label");
		drawpanel = new MyDrawPanel();
		frame.getContentPane().add(BorderLayout.SOUTH, colorbutton);
		frame.getContentPane().add(BorderLayout.CENTER, drawpanel);
		frame.getContentPane().add(BorderLayout.EAST, labelbutton);
		frame.getContentPane().add(BorderLayout.WEST, label);
		frame.setSize(300, 300);
		frame.setVisible(true);

	}

	public class MyDrawPanel extends JPanel {
		Color colour = Color.BLUE;;

		public void paintComponent(Graphics f) {
			super.paintComponent(f);
			f.setColor(colour);
			f.fillOval(0, 0, 50, 50);

		}

		void changecolour() {
			colour = Color.RED;
			repaint();

		}

	}

	public class LabelListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText("ouch");

		}

	}

	class ColorListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			drawpanel.changecolour();

		}

	}

}
