/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester {
	/** Method to test zeroBlue */
	public static void testZeroBlue() {
		Picture beach = new Picture("H:\\Unit16 (1)\\pixLab\\images\\beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

	public static void testKeepOnlyBlue() {
		Picture beach = new Picture("H:\\Unit16 (1)\\pixLab\\images\\beach.jpg");
		beach.explore();
		beach.keepOnlyBlue();
		beach.explore();
	}

	public static void testNegate() {
		Picture beach = new Picture("H:\\Unit16 (1)\\pixLab\\images\\beach.jpg");
		beach.explore();
		beach.negate();
		beach.explore();
	}

	public static void testGrayscale() {
		Picture beach = new Picture("H:\\Unit16 (1)\\pixLab\\images\\beach.jpg");
		beach.explore();
		beach.grayscale();
		beach.explore();
	}
	public static void testFixUnderwater() {
		Picture beach = new Picture("H:\\Unit16 (1)\\pixLab\\images\\water.jpg");
		beach.explore();
		beach.grayscale();
		beach.explore();
	}
	/** Method to test mirrorVertical */
	public static void testMirrorVertical() {
		Picture caterpillar = new Picture(
				"H:\\Unit16 (1)\\pixLab\\images\\caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}

	public static void testMirrorVerticalRightToLeft() {
		Picture caterpillar = new Picture(
				"H:\\Unit16 (1)\\pixLab\\images\\caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVerticalRightToLeft();
		caterpillar.explore();
	}

	public static void testMirrorHorizantal() {
		Picture caterpillar = new Picture(
				"H:\\Unit16 (1)\\pixLab\\images\\caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorHorizantal();
		caterpillar.explore();
	}

	public static void testMirrorHorizantalBottomToTop() {
		Picture caterpillar = new Picture(
				"H:\\Unit16 (1)\\pixLab\\images\\caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorHorizantalBottomToTop();
		caterpillar.explore();
	}

	/** Method to test mirrorTemple */
	public static void testMirrorTemple() {
		Picture temple = new Picture(
				"H:\\Unit16 (1)\\pixLab\\images\\temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}

	public static void testMirrorArms() {
		Picture temple = new Picture(
				"H:\\Unit16 (1)\\pixLab\\images\\snowman.jpg");
		temple.explore();
		temple.mirrorArms();
		temple.explore();
	}

	public static void testMirrorGull() {
		Picture temple = new Picture(
				"H:\\Unit16 (1)\\pixLab\\images\\seagull.jpg");
		temple.explore();
		temple.mirrorGull();
		temple.explore();
	}

	public static void testMirrorDiagonal() {
		Picture caterpillar = new Picture(
				"H:\\Unit16 (1)\\pixLab\\images\\beach.jpg");
		caterpillar.explore();
		caterpillar.mirrorDiagonal();
		caterpillar.explore();
	}

	/** Method to test the collage method */
	public static void testCollage() {
		Picture canvas = new Picture(
				"H:\\Unit16 (1)\\pixLab\\images\\640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}
	public static void testCollage2() {
		Picture canvas = new Picture(
				"H:\\Unit16 (1)\\pixLab\\images\\640x480.jpg");
		canvas.createCollage2();
		canvas.explore();
	}
	public static void testMyCollage() {
		Picture canvas = new Picture(
				"H:\\Unit16 (1)\\pixLab\\images\\640x480.jpg");
		canvas.myCollage();
		canvas.explore();
	}
	/** Method to test edgeDetection */
	public static void testEdgeDetection() {
		Picture swan = new Picture("H:\\Unit16 (1)\\pixLab\\images\\swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}

	/**
	 * Main method for testing. Every class can have a main method in Java
	 */
	public static void main(String[] args) {
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		// testZeroBlue();
		// testKeepOnlyBlue();
		// testKeepOnlyRed();
		// testKeepOnlyGreen();
		// testNegate();
		// testGrayscale();
		// testFixUnderwater();
		// testMirrorVertical();
		// testMirrorVerticalRightToLeft();
		// testMirrorHorizantal();
		// testMirrorHorizantalBottomToTop();
		// testMirrorTemple();
		// testMirrorArms();
		// testMirrorGull();
		// testMirrorDiagonal();
		// testCollage();
		// testCollage2();
		// testMyCollage();
		// testCopy();
		// testEdgeDetection();
		// testEdgeDetection2();
		// testChromakey();
		// testEncodeAndDecode();
		// testGetCountRedOverValue(250);
		// testSetRedToHalfValueInTopHalf();
		// testClearBlueOverValue(200);
		// testGetAverageForColumn(0);
	}
}