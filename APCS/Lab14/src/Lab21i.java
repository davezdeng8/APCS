//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner scan = new Scanner(new File("C:\\Users\\David\\workspace\\Lab14\\src\\lab21i.dat"));
		while(scan.hasNext()){
			int size=scan.nextInt();
			//System.out.println(scan.next());
			scan.nextLine();
			String line = scan.nextLine();
			//System.out.println(size);
			//System.out.println(line);
			Maze thing = new Maze(size, line);
			System.out.println(thing.toString(0,0));
		}
	}
}