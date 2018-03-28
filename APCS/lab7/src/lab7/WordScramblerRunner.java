package lab7;

public class WordScramblerRunner {
	public static void main(String[] args){
	
	String[] test = {"apple", "pear", "this", "cat"};
	WordScrambler thing = new WordScrambler(test);
	String[] testmix = thing.mixedWords(test);
	 for (int k = 0; k < test.length; k++) {
			System.out.println(" " + testmix[k]);
		}
	 System.out.println(thing.recombine("asdf", "jkl;"));
	}
}
