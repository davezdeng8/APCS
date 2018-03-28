import java.awt.Color;
import java.awt.image.BufferedImage;

// resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
	// /////////////////// constructors //////////////////////////////////

	/**
	 * Constructor that takes no arguments
	 */
	public Picture() {
		/*
		 * not needed but use it to show students the implicit call to super()
		 * child constructors always call a parent constructor
		 */
		super();
	}

	/**
	 * Constructor that takes a file name and creates the picture
	 * 
	 * @param fileName
	 *            the name of the file to create the picture from
	 */
	public Picture(String fileName) {
		// let the parent class handle this fileName
		super(fileName);
	}

	/**
	 * Constructor that takes the width and height
	 * 
	 * @param height
	 *            the height of the desired picture
	 * @param width
	 *            the width of the desired picture
	 */
	public Picture(int height, int width) {
		// let the parent class handle this width and height
		super(width, height);
	}
	
	/**
	 * Constructor that takes a picture and creates a copy of that picture
	 * 
	 * @param copyPicture
	 *            the picture to copy
	 */
	public Picture(Picture copyPicture) {
		// let the parent class do the copy
		super(copyPicture);
	}

	/**
	 * Constructor that takes a buffered image
	 * 
	 * @param image
	 *            the buffered image to use
	 */
	public Picture(BufferedImage image) {
		super(image);
	}
	
	
	// //////////////////// methods ///////////////////////////////////////

	/**
	 * Method to return a string with information about this picture.
	 * 
	 * @return a string with information about the picture such as fileName,
	 *         height and width.
	 */
	public String toString() {
		String output = "Picture, filename " + getFileName() + " height "
				+ getHeight() + " width " + getWidth();
		return output;

	}

	/** Method to set the blue to 0 */
	public void zeroBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(0);
			}
		}
	}

	public void keepOnlyBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(0);
				pixelObj.setGreen(0);
			}
		}
	}

	public void negate() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(255 - pixelObj.getRed());
				pixelObj.setGreen(255 - pixelObj.getGreen());
				pixelObj.setBlue(255 - pixelObj.getBlue());
			}
		}
	}
	public void negate(Pixel[][] pixel) {
		Pixel[][] pixels = pixel;
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(255 - pixelObj.getRed());
				pixelObj.setGreen(255 - pixelObj.getGreen());
				pixelObj.setBlue(255 - pixelObj.getBlue());
			}
		}
	}
	public void grayscale() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed((pixelObj.getRed() + pixelObj.getBlue() + pixelObj
						.getGreen()) / 3);
				pixelObj.setGreen((pixelObj.getRed() + pixelObj.getBlue() + pixelObj
						.getGreen()) / 3);
				pixelObj.setBlue((pixelObj.getRed() + pixelObj.getBlue() + pixelObj
						.getGreen()) / 3);
			}
		}
	}

	/**
	 * Method that mirrors the picture around a vertical mirror in the center of
	 * the picture from left to right
	 */
	public void fixUnderWater(){
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue((255+pixelObj.getBlue())/2);
				pixelObj.setGreen(pixelObj.getGreen()/2);
			}
		}
	}
	public void mirrorVertical() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	public void mirrorVerticalRightToLeft() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				leftPixel.setColor(rightPixel.getColor());
			}
		}
	}

	public void mirrorHorizantal() {
		Pixel[][] pixels = this.getPixels2D();
		for (int i = 0; i < pixels.length / 2; i++) {
			for (int j = 0; j < pixels[0].length; j++) {
				pixels[pixels.length - 1 - i][j].setColor(pixels[i][j]
						.getColor());
			}
		}
	}

	public void mirrorHorizantalBottomToTop() {
		Pixel[][] pixels = this.getPixels2D();
		for (int i = 0; i < pixels.length / 2; i++) {
			for (int j = 0; j < pixels[0].length; j++) {
				pixels[i][j].setColor(pixels[pixels.length - 1 - i][j]
						.getColor());
			}
		}
	}

	public void mirrorDiagonal() {
		Pixel[][] pixels = this.getPixels2D();
		int s;
		int increment = 0;
		if (pixels.length < pixels[0].length)
			s = pixels.length;
		else
			s = pixels[0].length;
		for (int i = increment; i < s; i++) {
			for (int j = increment; j < s; j++) {
				pixels[i][j].setColor(pixels[j][i].getColor());
			}
			increment++;
		}
	}

	/** Mirror just part of a picture of a temple */
	public void mirrorTemple() {
		int mirrorPoint = 276;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 27; row < 97; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 13; col < mirrorPoint; col++) {

				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
				count++;
			}
		}
		System.out.println(count);
	}

	public void mirrorArms() {
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();
		int top = 160;
		int bottom = 194;
		for (int j = 0; j < bottom - top; j++) {
			for (int i = 0; i < 170; i++) {
				pixels[bottom + j][i]
						.setColor(pixels[bottom - j][i].getColor());
			}
			for (int k = 399; k > 237; k--) {
				pixels[bottom + j][k]
						.setColor(pixels[bottom - j][k].getColor());
			}
		}
	}

	public void mirrorGull() {
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();
		Pixel[][] gull = new Pixel[110][110];
		for (int i = 220; i < 330; i++) {
			for (int j = 240; j < 350; j++) {
				gull[i - 220][j - 240] = pixels[i][j];
			}
		}
		for (int k = 220; k < 330; k++) {
			for (int m = 350; m < 460; m++) {
				pixels[k][m].setColor(gull[k - 220][m - 350].getColor());
			}
		}
		System.out.println(pixels.length);
		System.out.println(pixels[0].length);
	}

	/**
	 * copy from the passed fromPic to the specified startRow and startCol in
	 * the current picture
	 * 
	 * @param fromPic
	 *            the picture to copy from
	 * @param startRow
	 *            the start row to copy to
	 * @param startCol
	 *            the start col to copy to
	 */
	public void copy(Picture fromPic, int startRow, int startCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length
				&& toRow < toPixels.length; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
					&& toCol < toPixels[0].length; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}
	public void copy(Pixel[][] pixels, int startRow, int startCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = pixels;
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length
				&& toRow < toPixels.length; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
					&& toCol < toPixels[0].length; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}
	public void copy(Picture fromPic, int startRow, int startCol, int endRow, int endCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length
				&& toRow < endRow; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
					&& toCol < endCol; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}
	/** Method to create a collage of several pictures */
	public void createCollage() {
		Picture flower1 = new Picture(
				"H:\\Unit16 (1)\\pixLab\\images\\flower1.jpg");
		Picture flower2 = new Picture(
				"H:\\Unit16 (1)\\pixLab\\images\\flower2.jpg");
		this.copy(flower1, 0, 0);
		this.copy(flower2, 100, 0);
		this.copy(flower1, 200, 0);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue, 300, 0);
		this.copy(flower1, 400, 0);
		this.copy(flower2, 500, 0);
		this.mirrorVertical();
		this.write("H:\\Unit16 (1)\\pixLab\\images\\collage.jpg");
	}
	public void createCollage2() {
		Picture flower1 = new Picture(
				"H:\\Unit16 (1)\\pixLab\\images\\flower1.jpg");
		Picture flower2 = new Picture(
				"H:\\Unit16 (1)\\pixLab\\images\\flower2.jpg");
		this.copy(flower1, 0, 0, 20, 20);
		this.copy(flower2, 100, 0, 120, 20);
		this.copy(flower1, 200, 0, 220, 20);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue, 300, 0, 320, 20);
		this.copy(flower1, 400, 0, 420, 20);
		this.copy(flower2, 500, 0, 520, 20);
		this.mirrorVertical();
		this.write("H:\\Unit16 (1)\\pixLab\\images\\collage.jpg");
	}
//	public void myCollage(){
//		Picture seagull = new Picture(
//				"H:\\Unit16 (1)\\pixLab\\images\\seagull.jpg");
//		Pixel[][] pixels = seagull.getPixels2D();
//		Pixel[][] gull = new Pixel[110][110];
//		Pixel[][] gull1, gull2, gull3;
//		Pixel[][] finish = this.getPixels2D();
//		Pixel[][] temp;
//		for (int i = 220; i < 330; i++) {
//			for (int j = 240; j < 350; j++) {
//				gull[i - 220][j - 240] = pixels[i][j];
//			}
//		}
//		gull1 = 
//		this.copy(gull, 400, 100);
//		
//	}
	public void myCollage(){
		Picture flower1 = new Picture(
				"H:\\Unit16 (1)\\pixLab\\images\\flower1.jpg");
		this.copy(flower1, 0, 0);
		flower1.grayscale();
		this.copy(flower1, 200, 200);
		flower1.mirrorVertical();
		this.copy(flower1, 400, 400);
		
	}
	/**
	 * Method to show large changes in color
	 * 
	 * @param edgeDist
	 *            the distance for finding edges
	 */
	public void edgeDetection(int edgeDist) {
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < pixels[0].length - 1; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col + 1];
				rightColor = rightPixel.getColor();
				if (leftPixel.colorDistance(rightColor) > edgeDist)
					leftPixel.setColor(Color.BLACK);
				else
					leftPixel.setColor(Color.WHITE);
			}
		}
	}

	/*
	 * Main method for testing - each class in Java can have a main method
	 */
	public static void main(String[] args) {
		Picture beach = new Picture("H:\\Unit16 (1)\\pixLab\\images\\beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

} // this } is the end of class Picture, put all new methods before this
