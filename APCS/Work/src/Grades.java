//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;

public class Grades {
	private ArrayList<Double> grades = new ArrayList<Double>();

	public Grades() {
		setGrades("");
	}

	public Grades(String gradeList) {
		setGrades(gradeList);
	}

	public void setGrades(String gradeList) {

		Scanner scan = new Scanner(gradeList);
		scan.next();
		scan.next();
		
		while (scan.hasNextDouble()) {
			grades.add(scan.nextDouble());
		}

	}

	public void setGrade(int spot, double grade) {
		grades.set(spot, grade);

	}

	public double getSum() {
		double sum = 0.0;
		for (int i = 0; i < grades.size(); i++) {
			sum += grades.get(i);
		}

		return sum;
	}

	public double getLowGrade() {
		double low = Double.MAX_VALUE;
		for (int i = 0; i < grades.size(); i++) {
			if (grades.get(i) < low)
				low = grades.get(i);
		}
		return low;
	}

	public double getHighGrade() {
		double high = Double.MIN_VALUE;
		for (int i = 0; i < grades.size(); i++) {
			if (grades.get(i) > high)
				high = grades.get(i);
		}
		return high;
	}

	public int getNumGrades() {
		return grades.size();
	}

	public String toString() {
		String output = "";
		for (int i = 0; i < grades.size(); i++) {
			output += grades.get(i) + " ";
		}

		return output;
	}
}