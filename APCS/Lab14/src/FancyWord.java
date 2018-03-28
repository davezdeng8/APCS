//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{

	}

   public FancyWord(String s)
	{
	   mat = new char[s.length()][s.length()];
	   for(int i = 0; i<s.length(); i++){
		   for(int j = 0; j<s.length(); j++){
		   mat[i][j]= ' ';
		   }
	   }
	   for(int i = 0; i<s.length(); i++){
		   mat[0][i]=s.charAt(i);
		   mat[mat.length-1][i]=s.charAt(i);
	   }
	   for(int i = 1; i<s.length()-1; i++){
		   mat[i][i]=s.charAt(i);
		   mat[s.length()-i-1][i]=s.charAt(i);
	   }
	   



	}

	public String toString()
	{
		String output="";
		for(int i = 0; i<mat.length; i++){
			   for(int j = 0; j<mat[0].length; j++){
			   output+=mat[i][j];
			   }
			   output+="\n";
		   }




		return output+"\n\n";
	}
}