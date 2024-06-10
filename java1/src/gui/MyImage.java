package gui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyImage extends JPanel {

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Image image = new ImageIcon("/Users/nashitahzainab/Desktop/myimage.png").getImage();
		g.drawImage(image, 3, 4, this);

	}

}
