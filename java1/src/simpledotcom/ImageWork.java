package simpledotcom;

public class ImageWork {
	public static void main(String[] args) {
		ImageWork gui = new Imagework();
		gui.go();
	}

	public void go() {
		Jframe frame = new Jframe();
		Imagedrawpenal drawpenal = new Imagedrawpenal();
		frame.getçontent().add(drawpenal);
		// framesetting
		frame.setDefaultcloseoperator(Jframe.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		frame.setVisible(true);

	}

}
