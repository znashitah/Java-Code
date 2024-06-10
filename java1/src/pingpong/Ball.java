package pingpong;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball {
	int x, y, xdir, ydir;

	Rectangle ball;

	public Ball() {
		x = 350;
		y = 250;
		setXDirection(-1);
		setYDirection(-1);
		ball = new Rectangle(x, y, 15, 15);
	}

	public void setXDirection(int xdir) {
		this.xdir = xdir;
	}

	public void setYDirection(int ydir) {
		this.ydir = ydir;
	}

	public void move(Paddle p1, Paddle p2) {
		ball.x += xdir;
		ball.y += ydir;
		if (ball.y <= 20)
			setYDirection(+1);
		if (ball.y >= 455)
			setYDirection(-1);
		if (ball.intersects(p1.paddle))
			setXDirection(+1);
		if (ball.intersects(p2.paddle))
			setXDirection(-1);
	}

	public void paint(Graphics g) {
		g.fillRect(ball.x, ball.y, ball.width, ball.height);
	}

}
