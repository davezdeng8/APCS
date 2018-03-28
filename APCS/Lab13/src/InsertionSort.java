//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;

class InsertionSort {
	private ArrayList<String> list;

	public InsertionSort() {
		list = new ArrayList<String>();
	}

	// modfiers
	public void add(String word) {
		int loc=0;
		if(Collections.binarySearch(list, word)>=0){
			loc = Collections.binarySearch(list, word);
		}
		else{
			if(findInsertLocation(word)<list.size()){
			loc = findInsertLocation(word);
			list.add(loc, word);
			}
			if(findInsertLocation(word)==list.size()){
				list.add(word);
			}
		}
		
		
		
	}

	private int findInsertLocation(String word) {
		int thing=0;
		int count=0;
		for (int i = 0; i < list.size(); i++) {
			if (word.compareTo(list.get(i)) < 0) {
				thing = i;
				break;
			}
			count++;
		}
		if(count == list.size() && thing == 0){
			thing = list.size();
		}
		
		return thing;
	}

	public void remove(String word) {
		list.remove(word);

	}

	public String toString() {
		return list.toString().replaceAll("[\\[\\]]","").replaceAll(", "," ");
	}
}