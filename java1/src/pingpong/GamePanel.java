package pingpong;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	Paddle paddle1, paddle2;
	Ball ball;

	public GamePanel() {
		paddle1 = new Paddle(1);
		paddle2 = new Paddle(2);
		ball = new Ball();

		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				paddle1.keyPressed(e);
				paddle2.keyPressed(e);
			}

			public void keyReleased(KeyEvent e) {
				paddle1.keyReleased(e);
				paddle2.keyReleased(e);
			}
		});
		this.setFocusable(true);

		Timer timer = new Timer(5, this);
		timer.start();
	}

	public void paint(Graphics g) {
		super.paint(g);
		paddle1.paint(g);
		paddle2.paint(g);
		ball.paint(g);
	}

	public void actionPerformed(ActionEvent e) {
		paddle1.move();
		paddle2.move();
		ball.move(paddle1, paddle2);
		repaint();
	}

}
