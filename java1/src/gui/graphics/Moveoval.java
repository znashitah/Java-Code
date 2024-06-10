package gui.graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Moveoval implements ActionListener {
	Paintpanel pl;
	int z;

	@Override
	public void actionPerformed(ActionEvent e) {
		pl.changePositionx(z);

		pl.repaint();

	}

	void setPaintpanel(Paintpanel y) {
		pl = y;

	}

	void setpositionx(int a) {
		z = a;

	}

}
