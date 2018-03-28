//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.out;

import java.io.File;
import java.util.Scanner;

public class GradeBookFileRunner {
	public static void main(String args[]) throws Exception {
		out.println("Welcome to the Class Stats program!\n");

		Scanner file = new Scanner(
				new File(
						"H:\\Unit11-2016\\Unit11-2016\\Unit11-Assignments\\Lab19b\\gradebook.dat"));
		Class thing = new Class("", 0);
		while (file.hasNext()) {
			String classname = file.nextLine();
			int classsize = file.nextInt();
			file.nextLine();
			thing = new Class(classname, classsize);
			for (int i = 0; i < classsize; i++) {
				String nm = file.nextLine();
				String des = file.nextLine();
				Student newbie = new Student(nm, des);
				thing.addStudent(i, newbie);
			}
		}
		thing.Sort();
		System.out.println(thing);
		System.out.println("Failure List = " + thing.getFailureList(70.0));
		System.out.println("Highest Average = "
				+ thing.getStudentWithHighestAverage());
		System.out.println("Lowest Average = "
				+ thing.getStudentWithLowestAverage());
		System.out.printf("Class average = %.5f", thing.getClassAverage());
	}

}