//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;

	public static void quickSort(Comparable[] list)
	{
		passCount = 0;
		quickSort(list, 0, list.length - 1);
		System.out.println("pass " + passCount+ " " + list.toString() + "\n");


	}


	private static void quickSort(Comparable[] list, int low, int high)
	{
		if(low<high){
			int split = partition(list, low, high);
			quickSort(list, low, split);
			quickSort(list, split+1, high);
		}

	}


	private static int partition(Comparable[] list, int low, int high)
	{
		Comparable pivot = list[low];
		int bot = low -1;
		int top = high + 1;
		while(bot<top){
			while(list[top-1].compareTo(pivot)>0)
				top --;
			while(list[bot+1].compareTo(pivot)<0){
				bot ++;
				
			}
			
			if(bot>=top){
				return top;
				System.out.println(Arrays.toString(list));
			}
				
			Comparable hold = list[bot+1];
			list[bot+1]=list[top-1];
			list[top-1]=hold;
		
		}
		return 0;
	}
	public String toString(){
		System.out.println("pass " + passCount + Arrays.toString(list));
	}

}