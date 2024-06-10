package gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

class MyDraw extends JPanel {
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Set the color to red
		g.setColor(Color.RED);

		// Draw a rectangle
		g.drawRect(50, 50, 200, 100);
	}
}
