package gui.widget;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Multaction implements ActionListener {
	JTextField text;
	JTextField text2;
	JLabel label;

	public void actionPerformed(ActionEvent e) {

		String number1 = text.getText();
		String number2 = text2.getText();
		int n1 = Integer.parseInt(number1);
		int n2 = Integer.parseInt(number2);

		label.setText(Integer.toString(n1 * n2));

	}

	void setFields(JTextField t, JTextField t2, JLabel l) {
		this.text = t;
		this.text2 = t2;
		this.label = l;
	}

}
