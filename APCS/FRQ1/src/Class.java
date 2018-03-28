//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Class {
	private String name;
	private Student[] studentList;

	public Class() {
		name = "";
		studentList = new Student[0];
	}

	public Class(String names, int stuCount) {
		name = new String(names);
		studentList = new Student[stuCount];

	}

	public void addStudent(int stuNum, Student s) {
		studentList[stuNum] = s;

	}

	public String getClassName() {
		return name;
	}

	public double getClassAverage() {
		double classAverage = 0.0;
		for (int i = 0; i < studentList.length; i++) {
			classAverage += studentList[i].getAverage();
		}
		classAverage = classAverage / studentList.length;
		return classAverage;
	}

	public double getStudentAverage(int stuNum) {
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName) {
		for (int i = 0; i < studentList.length; i++) {
			if (studentList[i].getName() == stuName) {
				return studentList[i].getAverage();
			}
		}
		return 0.0;
	}

	public String getStudentName(int stuNum) {
		return studentList[stuNum].getName();
	}

	public String getStudentWithHighestAverage() {
		double high = Double.MIN_VALUE;
		String hName = "";
		for (int i = 0; i < studentList.length; i++) {
			if (high < studentList[i].getAverage()) {
				high = studentList[i].getAverage();
				hName = getStudentName(i);
			}
		}

		return hName;
	}

	public String getStudentWithLowestAverage() {
		double low = Double.MAX_VALUE;
		String hName = "";
		for (int i = 0; i < studentList.length; i++) {
			if (low > studentList[i].getAverage()) {
				low = studentList[i].getAverage();
				hName = getStudentName(i);
			}
		}
		return hName;
	}

	public String getFailureList(double failingGrade) {
		String output = "";
		for (int i = 0; i < studentList.length; i++) {
			if (failingGrade > studentList[i].getAverage()) {
				output += studentList[i].getName() + " ";
			}
		}
		return output;
	}

	public void Sort() {
		for (int i = 0; i < studentList.length; i++) {
			for (int k = i + 1; k < studentList.length; k++) {
				if (studentList[i].getAverage() < studentList[k].getAverage()) {
					Student hold = studentList[i];
					studentList[i] = studentList[k];
					studentList[k] = hold;
				}
			}
		}
	}

	public String toString() {
		String output = "" + getClassName() + "\n";
		for (int i = 0; i < studentList.length; i++) {
			output += String.format(studentList[i].toString() + "\t %.2f \n",
					studentList[i].getAverage());
		}
		return output;
	}
}