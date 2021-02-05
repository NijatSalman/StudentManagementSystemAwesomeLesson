package service.menu;

import bean.Teacher;
import config.Config;
import menu.service.inter.ShowAllTeacherServiceInter;

public class ShowAllTeacherService implements ShowAllTeacherServiceInter{

	@Override
	public void process() {
		Teacher[] allTeachers=Config.instance().getTeacher();
		
		for (int i = 0; i < allTeachers.length; i++) {
			System.out.println(allTeachers[i]);
		}
	}

//	@Override
//	public void processLogic() {
//		// TODO Auto-generated method stub
//		
//	}

}
