/**
 * This is a class that tests the Card class.
 */
package lab7;
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *
	 * @param args
	 *            is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card test = new Card("one", "spades", 1);
		Card one = new Card("one", "spades", 1);
		System.out.println(one.suit());
		System.out.println(one.rank());
		System.out.println(one.pointValue());
		System.out.println(one.matches(test));
		System.out.println(one.toString());

		Card two = new Card("two", "spades", 2);
		System.out.println(two.suit());
		System.out.println(two.rank());
		System.out.println(two.pointValue());
		System.out.println(two.matches(test));
		System.out.println(two.toString());

		Card three = new Card("three", "spades", 3);
		System.out.println(three.suit());
		System.out.println(three.rank());
		System.out.println(three.pointValue());
		System.out.println(three.matches(test));
		System.out.println(three.toString());
	}
}
