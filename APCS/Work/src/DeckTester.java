/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *
	 * @param args
	 *            is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = { "a", "b", "c" };
		String[] suits = { "d", "e", "f" };
		int[] value = { 1, 2, 3 };
		Deck test = new Deck(ranks, suits, value);

		String[] ranks1 = { "ab", "bc", "cd" };
		String[] suits1 = { "aa", "bb", "cc" };
		int[] value1 = { 1, 2, 3 };
		Deck test1 = new Deck(ranks1, suits1, value1);

		String[] ranks2 = { "ab", "bc" };
		String[] suits2 = { "aa", "bb", "cc" };
		int[] value2 = { 1, 2 };
		Deck test2 = new Deck(ranks2, suits2, value2);
	}
}
