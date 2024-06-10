package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Button implements ActionListener {
	JButton button;
	JRadioButton d;
	JPanel panel;
	JTextField tf;
	JPanel paneldraw;
	MyImage mi;
	Myoval mo;

	public static void main(String[] args) {
		Button gui = new Button();
		gui.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		paneldraw = new MyDraw();
		mi = new MyImage();
		mo = new Myoval();

		button = new JButton("click me");

		d = new JRadioButton("Jbutton");
		tf = new JTextField("hello");
		panel = new JPanel();

		button.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel.add(button);
		panel.add(tf);
		panel.add(d);

		frame.getContentPane().add(mo);
		frame.setSize(1300, 1300);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		button.setText("i have been clicked");

	}

}
