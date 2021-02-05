package config;

import java.io.Serializable;

import bean.Student;
import bean.Teacher;
import util.FileUtility;

public class Config implements Serializable {

	private static Config config;
	private Student[] student = new Student[0];
	private Teacher[] teacher = new Teacher[0];
	private static boolean loggedIn;
	
	
	public static void save(){
		FileUtility.writeObjectToFile(Config.instance(),"app.obj");
	}

	public static void initialize() {
		Object obj = FileUtility.readFileDeserialize("app.obj");

		if (obj == null) {
			return;
		}
		if (obj instanceof Config) {
			config = (Config) obj;
		}

	}

	public Student[] getStudent() {
		return student;
	}

	public void setStudent(Student[] student) {
		this.student = student;
	}

	public Teacher[] getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher[] teacher) {
		this.teacher = teacher;
	}

	public void appendStudent(Student value) {
		Student[] newStudentValue = new Student[student.length + 1];
		for (int i = 0; i < student.length; i++) {
			newStudentValue[i] = student[i];
		}
		newStudentValue[newStudentValue.length - 1] = value;

		student = newStudentValue;
	}

	public void appendTeacher(Teacher value) {
		Teacher[] newTeacherValue = new Teacher[teacher.length + 1];
		for (int i = 0; i < teacher.length; i++) {
			newTeacherValue[i] = teacher[i];
		}

		newTeacherValue[newTeacherValue.length - 1] = value;
		teacher = newTeacherValue;
	}

	public static Config instance() {
		if (config == null) {
			config = new Config();
		}
		return config;
	}

	public static boolean isLoggedIn() {
		return loggedIn;
	}

	public static void setLoggedIn(boolean loggedIn) {
		Config.loggedIn = loggedIn;
	}

}
