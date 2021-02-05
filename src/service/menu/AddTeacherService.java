package service.menu;

import java.util.Scanner;

import bean.Student;
import bean.Teacher;
import config.Config;
import menu.service.inter.AddTeacherServiceInter;

public class AddTeacherService implements AddTeacherServiceInter {

	private Scanner sc;
	private Teacher teacherObject;
	@Override
	public void process() {
		teacherObject=new Teacher();
	    sc=new Scanner(System.in);
		System.out.println("please type your name");
		String name=sc.nextLine();
		teacherObject.setName(name);
		
		System.out.println("please type your surname");
		String surname=sc.nextLine();
		teacherObject.setSurname(surname);

		System.out.println("please type your age");
		int age=sc.nextInt();
		teacherObject.setAge(age);
		
		Config.instance().appendTeacher(teacherObject);
		
	}
//	@Override
//	public void processLogic() {
//		// TODO Auto-generated method stub
//		
//	}

}
