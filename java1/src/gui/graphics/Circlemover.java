package gui.graphics;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Circlemover {

	public static void main(String[] args) {
		Circlemover cm = new Circlemover();

		cm.go();

	}

	public void go() {
		Paintpanel paint = new Paintpanel();
		Moveoval rightmoveoval = new Moveoval();
		Moveoval leftmoveoval = new Moveoval();
		Moveovaly rightm = new Moveovaly(paint, -10);
		Moveovaly leftm = new Moveovaly(paint, 12);
		JFrame f = new JFrame();

		JPanel leftpanel = new JPanel();
		JPanel rightpanel = new JPanel();
		JButton leftbutton = new JButton("left button");
		JButton rightbutton = new JButton("right button");
		JButton ybutton = new JButton("y button");
		JButton y1button = new JButton("y1 button");

		f.setVisible(true);
		f.setSize(1000, 1000);
		f.setTitle("ian new frame");
		f.add(rightpanel, BorderLayout.EAST);
		f.add(leftpanel, BorderLayout.WEST);
		f.add(paint, BorderLayout.CENTER);
		rightpanel.add(rightbutton);
		rightpanel.add(ybutton);
		leftpanel.add(y1button);

		leftmoveoval.setPaintpanel(paint);
		leftmoveoval.setpositionx(-10);
		rightmoveoval.setPaintpanel(paint);
		rightmoveoval.setpositionx(10);

		leftpanel.add(leftbutton);
		rightbutton.addActionListener(rightmoveoval);
		leftbutton.addActionListener(leftmoveoval);
		ybutton.addActionListener(leftm);
		y1button.addActionListener(rightm);

	}

}
