package bean;

import java.util.Arrays;

public class Teacher extends Person {

	private String schoolName;
	private String salary;
	private Student[] student;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Student[] getStudent() {
		return student;
	}

	public void setStudent(Student[] student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Teacher [getName()=" + getName() + ", getSurname()=" + getSurname() + ", getAge()=" + getAge() + "]";
	}

	
	

	
}
