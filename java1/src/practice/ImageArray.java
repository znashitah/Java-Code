package practice;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageArray {

	BufferedImage image;
	int red;
	int green;
	int blue;
	int cred;
	int cgreen;
	int cblue;

	public static void main(String[] args) {
		ImageArray imageArray = new ImageArray();
		imageArray.go(args);
	}

	public void go(String[] args) { // use: filename command integer/float
		String imageName = args[0];
		File imagePath = new File(imageName);

		String command = args[1];

		String param3String = args[2];
		int param3 = (int) Float.parseFloat(param3String);
		float param3Float = Float.parseFloat(param3String);

		System.out.println("With the image in file: " + imageName);
		System.out.println("Command executed: " + command + "!");
		System.out.println("Value: " + param3);
		System.out.println("Value as Float: " + param3Float);

		try {
			image = ImageIO.read(imagePath);
		} catch (IOException e) {
			// log the exception
		}

		int[][] array = new int[image.getWidth()][image.getHeight()];
		for (int i = 0; i < image.getWidth(); i++) {
			for (int j = 0; j < image.getHeight(); j++) {
				// The TYPE_INT_ARGB represents Color as an integer (4 bytes)
				// with alpha channel in bits 24-31,
				// red channels in 16-23, green in 8-15 and blue in 0-7.
				array[i][j] = image.getRGB(i, j);
			}
		}

		// image array processing: here we work! Point operation mean: only the value of
		// a point is used together with a scaling
		for (int i = 0; i < image.getWidth(); i++) {
			for (int j = 0; j < image.getHeight(); j++) {
				// doing nothing = keep original blue
				if (command.equals("blue")) {
					array[i][j] = array[i][j] & 0b11111111000000000000000011111111;
				}
				if (command.equals("green")) {
					array[i][j] = array[i][j] & 0b11111111000000001111111100000000;
				}
				if (command.equals("red")) {
					array[i][j] = array[i][j] & 0b11111111000000001111111100000000;
				}

				// filtering alpha + red + green + blue: 11111111 + 00000000 + 11111111 +
				// 00000000 + = green

				// filtering alpha + red + green + blue: 11111111 + 11111111 + 00000000 +
				// 00000000 + = red

				// increase contrast multiply
				if (command.equals("contrast")) {
					int alpha = (array[i][j] >> 24) & 0xFF;
					int originalRed = (array[i][j] >> 16) & 0xFF;
					int originalGreen = (array[i][j] >> 8) & 0xFF;
					int originalBlue = array[i][j] & 0xFF;

					int newRed = ((originalRed * param3) > 255) ? 255 : (originalRed * param3);
					int newGreen = ((originalGreen * param3) > 255) ? 255 : (originalGreen * param3);

				}

				// increase or decrease brightness
				if (command.equals("brightness")) {
					// get the single values for red, green, blue
					red = (array[i][j] & 0b00000000111111110000000000000000) >> 16;
					green = (array[i][j] & 0b00000000000000001111111100000000) >> 8;
					blue = (array[i][j] & 0b00000000000000000000000011111111);

					// do the operation
					if (param3 > 0) // increase
					{
						if ((red + param3) > 255)
							red = 255;
						else
							red = red + param3;
						if ((green + param3) > 255)
							green = 255;
						else
							green = green + param3;
						if ((blue + param3) > 255)
							blue = 255;
						else
							blue = blue + param3;
					} else // decrese
					{
						if ((red + param3) < 0)
							red = 0;
						else
							red = red + param3;
						if ((green + param3) < 0)
							green = 0;
						else
							green = green + param3;
						if ((blue + param3) < 0)
							blue = 0;
						else
							blue = blue + param3;
					}

					// combine red & green & blue into single Integer and restore in array
					array[i][j] = (red << 16) + (green << 8) + blue;
				}
			}
		}

// image array stored back in image
		for (int i = 0; i < image.getWidth(); i++) {
			for (int j = 0; j < image.getHeight(); j++) {
				image.setRGB(i, j, array[i][j]);
			}
		}

// output on screen
		JLabel imageLabel = new JLabel(new ImageIcon(image));
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.add(imageLabel);
		frame.pack();
		frame.setVisible(true);

	}
}
