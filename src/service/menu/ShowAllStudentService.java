package service.menu;

import bean.Student;
import config.Config;
import menu.service.inter.ShowAllStudentServiceInter;

public class ShowAllStudentService implements ShowAllStudentServiceInter {

	@Override
	public void process() {
		Student[] studentValue=Config.instance().getStudent();
		
		for (int i = 0; i < studentValue.length; i++) {
			System.out.println(studentValue[i]);
		}
		
	}

//	@Override
//	public void processLogic() {
//		// TODO Auto-generated method stub
//		
//	}

}
