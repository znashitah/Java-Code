package gui.widget;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Dialogbox implements ActionListener {
	String name;
	JTextField text = new JTextField("hello, I am Textfield");
	JLabel label = new JLabel("name here");

	public static void main(String[] args) {
		Dialogbox d = new Dialogbox();
		d.go();

	}

	public void go() {
		JButton button = new JButton("click me");

		JPanel leftpanel;
		leftpanel = new JPanel();
		JPanel middlepanel = new JPanel();
		JPanel rightpanel = new JPanel();
		JFrame frame;
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.setTitle("its open");
		frame.add(leftpanel, BorderLayout.WEST);
		frame.add(middlepanel, BorderLayout.CENTER);
		frame.add(rightpanel, BorderLayout.EAST);
		rightpanel.add(button);
		leftpanel.add(text);
		middlepanel.add(label);
		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		label.setText(text.getText());

	}

}
