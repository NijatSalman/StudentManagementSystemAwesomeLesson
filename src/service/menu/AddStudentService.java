package service.menu;

import java.util.Scanner;

import bean.Student;
import util.FileUtility;
import config.Config;
import menu.service.inter.AddStudentServiceInter;

public class AddStudentService implements AddStudentServiceInter {
	private Scanner sc;
	private Student studentObject;
	
	@Override
	public void process() {
		studentObject=new Student();
	    sc=new Scanner(System.in);
		System.out.println("please type your name");
		String studentName=sc.nextLine();
		studentObject.setName(studentName);
		
		System.out.println("please type your surname");
		String studentSurname=sc.nextLine();
		studentObject.setSurname(studentSurname);

		System.out.println("please type your age");
		int studentAge=sc.nextInt();
		studentObject.setAge(studentAge);
		
		Config.instance().appendStudent(studentObject);
		
		Config.save();
		
	}

//	@Override
//	public void processLogic() {
//		// TODO Auto-generated method stub
//		
//	}

}
