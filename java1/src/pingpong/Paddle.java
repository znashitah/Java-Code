package pingpong;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Paddle {
	int x, y, yDirection, id;
	Rectangle paddle;

	public Paddle(int id) {
		this.id = id;
		if (id == 1) {
			x = 50;
		} else {
			x = 685;
		}
		y = 250;
		paddle = new Rectangle(x, y, 15, 75);
	}

	public void keyPressed(KeyEvent e) {
		if (this.id == 1) {
			if (e.getKeyCode() == KeyEvent.VK_Q) {
				setYDirection(-5);
			}
			if (e.getKeyCode() == KeyEvent.VK_A) {
				setYDirection(5);
			}
		} else if (this.id == 2) {
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				setYDirection(-5);
			}
			if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				setYDirection(5);
			}
		}
	}

	public void keyReleased(KeyEvent e) {
		if (this.id == 1) {
			if (e.getKeyCode() == KeyEvent.VK_Q) {
				setYDirection(0);
			}
			if (e.getKeyCode() == KeyEvent.VK_A) {
				setYDirection(0);
			}
		} else if (this.id == 2) {
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				setYDirection(0);
			}
			if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				setYDirection(0);
			}
		}
	}

	public void setYDirection(int ydir) {
		yDirection = ydir;
	}

	public void move() {
		paddle.y += yDirection;
		if (paddle.y <= 20)
			paddle.y = 20;
		if (paddle.y >= 430)
			paddle.y = 430;
	}

	public void paint(Graphics g) {
		if (this.id == 1) {
			g.fillRect(paddle.x, paddle.y, paddle.width, paddle.height);
		} else if (this.id == 2) {
			g.fillRect(paddle.x, paddle.y, paddle.width, paddle.height);
		}
	}
}
