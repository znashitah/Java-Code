package gui.graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BPaintPanel extends JPanel {
	Color colour = Color.GREEN;

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
