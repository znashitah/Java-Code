package gui.widget;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calcgui {
	Addaction action = new Addaction();
	Multaction ml = new Multaction();

	public static void main(String[] args) {
		Calcgui c = new Calcgui();
		c.go();

	}

	public void go() {
		JTextField text = new JTextField("first value");
		JTextField text2 = new JTextField("2nd value");
		text.setSize(50, 50);
		text2.setSize(100, 100);
		JFrame frame = new JFrame();
		JLabel label = new JLabel("my label");
		JPanel leftpanel = new JPanel();
		JPanel middlepanel = new JPanel();
		JPanel rightpanel = new JPanel();
		frame.setVisible(true);
		frame.setSize(1000, 1000);
		frame.setTitle("my calculator");
		frame.add(rightpanel, BorderLayout.EAST);
		frame.add(leftpanel, BorderLayout.WEST);
		frame.add(middlepanel, BorderLayout.CENTER);

		JButton button = new JButton("ADD");
		JButton button2 = new JButton("multiply");
		button2.addActionListener(ml);
		ml.setFields(text, text2, label);
		action.setFields(text, text2, label);
		button.addActionListener(action);
		rightpanel.add(button);
		rightpanel.add(button2);
		leftpanel.add(text);
		leftpanel.add(text2);
		middlepanel.add(label);

	}

}
