package gui.graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class ChangeLabel implements ActionListener {
	JLabel jl;

	ChangeLabel(JLabel j) {
		jl = j;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		jl.setText("i am changed label");

	}

}
