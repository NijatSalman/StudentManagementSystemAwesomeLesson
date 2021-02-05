package util;

import inter.Process;
import service.menu.AddStudentService;
import service.menu.AddTeacherService;
import service.menu.MenuExitService;
import service.menu.MenuLoginService;
import service.menu.MenuRegisterService;
import service.menu.ShowAllStudentService;
import service.menu.ShowAllTeacherService;


public enum Menu {
	LOGIN(1, "Login", new MenuLoginService()), 
	REGISTER(2, "Register", new MenuRegisterService()), 
	SHOW_ALL_STUDENT(3, "Show all students",
			new ShowAllStudentService()), 
	SHOW_ALL_TEACHER(4, "Show all teachers",
					new ShowAllTeacherService()), 
	ADD_TEACHER(5, "Add teachers", new AddTeacherService()), 
	ADD_STUDENT(6, "Add students", new AddStudentService()),
	EXIT(7,"Exit from Menu",new MenuExitService()),
	UNKNOWN;

	private String label;
	private int number;
	private Process menuService;
	
	MenuLoginService mls=new MenuLoginService();
	

	Menu(int number, String label, Process menuService) {
		this.label = label;
		this.number = number;
		this.menuService = menuService;
	}

	Menu() {

	}

	public String getLabel() {
		return label;
	}

	public int getNumber() {
		return number;
	}

	public void process() {
		menuService.process();
	}

	@Override
	public String toString() {
		return number+"."+label;
	}

	

}
