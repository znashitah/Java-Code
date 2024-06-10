package serialization;

import java.io.Serializable;

public class Box implements Serializable {
	private static final long serialVersionUID = 7140514770234311345L;
	private int height;
	private int width;

	public void setheight(int a) {
		height = a;
	}

	public void setwidth(int b) {
		width = b;
	}

	public int getheight() {
		return height;

	}

	public int getwidth() {
		return width;
	}

}
