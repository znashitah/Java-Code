package gui.graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColourChange implements ActionListener {
	BPaintPanel cp;

	ColourChange(BPaintPanel l) {
		cp = l;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		cp.changecolour();

	}

}
