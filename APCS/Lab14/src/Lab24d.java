//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("C:\\Users\\David\\workspace\\Lab14\\src\\lab24d.dat"));
		int size= file.nextInt();
		file.nextLine();
		for(int i = 0; i<size; i++){
			String line = file.nextLine();
			//System.out.println(line);
			TicTacToe thing = new TicTacToe(line);
			System.out.println(thing);
		}







	}
}



