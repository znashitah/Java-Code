
package gui.graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Moveovaly implements ActionListener {
	Paintpanel pl;
	int z;

	Moveovaly(Paintpanel y, int a) {
		pl = y;
		z = a;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		pl.changePositiony(z);

		pl.repaint();

	}

}
