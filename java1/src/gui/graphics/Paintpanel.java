package gui.graphics;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Paintpanel extends JPanel {
	int positionx = 150;
	int positiony = 150;

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillOval(positionx, positiony, 50, 50);

	}

	void changePositionx(int x) {
		positionx = positionx + x;

	}

	void changePositiony(int y) {
		positiony = positiony + y;

	}
}
