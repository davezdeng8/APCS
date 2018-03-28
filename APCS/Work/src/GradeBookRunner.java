//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

import java.util.ArrayList;

public class GradeBookRunner
{	
	public static ArrayList<Class> book = new ArrayList<Class>();

   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the number of classes : ");
		int cc = keyboard.nextInt();
		for(int i = 0; i<cc; i++){
			
			System.out.println("Enter the name of the class : ");
			String classname = keyboard.next();
			System.out.println("Enter the number of students in this class : ");
			int sc = keyboard.nextInt();
			Class room = new Class(classname, sc);
			for(int j = 0; j<sc; j++){
				System.out.println("Enter the name of the student : ");
				String name = keyboard.next();
				System.out.println("Enter the number of grades, then a hyphen, then the grades, eg. 3 - 90 85 95.5 : ");
				String grades = keyboard.next();
				room.addStudent(j, new Student(name, grades));
			}
			book.add(room);
		}
		System.out.println("Classes saved!");
	}		
}