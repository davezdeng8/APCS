package lab7;

public class WordScrambler {
	private String[] scrambledWords; 

	 /** @param wordArr an array of String objects

	 * Precondition: wordArr.length is even

	 */ 

	 public WordScrambler(String[] wordArr) 

	 { 

	 scrambledWords = mixedWords(wordArr); 

	 } 

	 /** @param word1 a String of characters

	 * @param word2 a String of characters

	 * @return a String that contains the first half of word1 and the second half of word2 

	 */ 

	 private String recombine(String word1, String word2) 

	 { /* to be implemented in part (a) */ 
		 String first=word1.substring(0,word1.length()/2);
		 String last= word2.substring(word2.length()/2);
		 return first+last;
	 } 
	
	 

	 /** @param words an array of String objects

	 * Precondition: words.length is even

	 * @return an array of String objects created by recombining pairs of strings in array words 

	 * Postcondition: the length of the returned array is words.length 

	 */ 

	 private String[] mixedWords(String[] words) 

	 { /* to be implemented in part (b) */ 
		 String[] output = new String[words.length];
		 for(int i =0; i<words.length; i+=2){
			 output[i]=recombine(words[i], words[i+1]);
			 output[i+1]=recombine(words[i+1], words[i]);
		 }
		 return output;
	 } 
	 
	 // There may be instance variables, constructors, and methods that are not shown.
}
