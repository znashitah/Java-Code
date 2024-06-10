package gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Myoval extends JPanel {

	@Override
	public void paintComponent(Graphics g) {
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		int red = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		Color randomcolor = new Color(red, blue, green);
		// randomcolor = new Color(0, 255, 0);
		g.setColor(randomcolor);
		g.fillOval(70, 70, 100, 100);

	}
}
