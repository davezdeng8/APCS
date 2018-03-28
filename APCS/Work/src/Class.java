//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.ArrayList;
public class Class {
	private String name;
	private ArrayList<Student> studentList = new ArrayList<Student>();

	public Class() {
		name = "";
	}

	public Class(String names, int stuCount) {
		name = new String(names);
		for(int i = 0; i<stuCount; i++){
			
		}

	}

	public void addStudent(int stuNum, Student s) {
		studentList.add(stuNum, s);

	}

	public String getClassName() {
		return name;
	}

	public double getClassAverage() {
		double classAverage = 0.0;
		for (int i = 0; i < studentList.size(); i++) {
			classAverage += studentList.get(i).getAverage();
		}
		classAverage = classAverage / studentList.size();
		return classAverage;
	}

	public double getStudentAverage(int stuNum) {
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName) {
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getName() == stuName) {
				return studentList.get(i).getAverage();
			}
		}
		return 0.0;
	}

	public String getStudentName(int stuNum) {
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage() {
		double high = Double.MIN_VALUE;
		String hName = "";
		for (int i = 0; i < studentList.size(); i++) {
			if (high < studentList.get(i).getAverage()) {
				high = studentList.get(i).getAverage();
				hName = getStudentName(i);
			}
		}

		return hName;
	}

	public String getStudentWithLowestAverage() {
		double low = Double.MAX_VALUE;
		String hName = "";
		for (int i = 0; i < studentList.size(); i++) {
			if (low > studentList.get(i).getAverage()) {
				low = studentList.get(i).getAverage();
				hName = getStudentName(i);
			}
		}
		return hName;
	}

	public String getFailureList(double failingGrade) {
		String output = "";
		for (int i = 0; i < studentList.size(); i++) {
			if (failingGrade > studentList.get(i).getAverage()) {
				output += studentList.get(i).getName() + " ";
			}
		}
		return output;
	}

	public void Sort() {
		for (int i = 0; i < studentList.size(); i++) {
			for (int k = i + 1; k < studentList.size(); k++) {
				if (studentList.get(i).getAverage() < studentList.get(k).getAverage()) {
					Student hold = studentList.get(i);
					studentList.set(i, studentList.get(k));
					studentList.set(k, hold);
				}
			}
		}
	}

	public String toString() {
		String output = "" + getClassName() + "\n";
		for (int i = 0; i < studentList.size(); i++) {
			output += String.format(studentList.get(i).toString() + "\t %.2f \n",
					studentList.get(i).getAverage());
		}
		return output;
	}
}