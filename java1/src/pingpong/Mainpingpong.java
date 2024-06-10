package pingpong;

import javax.swing.JFrame;

public class Mainpingpong {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Ping Pong Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setResizable(false);
		frame.add(new GamePanel());
		frame.setVisible(true);
	}

}
