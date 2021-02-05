package service.menu;

import java.util.Scanner;

import config.Config;
import menu.service.inter.MenuLoginServiceInter;
import menu.service.inter.ValidateInputServiceInter;

public class MenuLoginService implements MenuLoginServiceInter {

	private ValidationService validationServiceValue=new ValidateInputService();
	
	@Override
	public void process() {
		System.out.println("You can only login with Guest account , Guest account Name: Nijat, Passwprd:1234");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type name");
		String name=sc.nextLine();

		System.out.println("Please type Password");
		int password = sc.nextInt();
		String GuestName = "Nijat";
		int GuestPassword = 1234;

		if (GuestName.equals(name) && GuestPassword == password) {
			System.out.println("You have successfully logged in Guest account");
		} else {
			System.out
					.println("You have banned." + "\n" + "Please run application again and follow the rule correctly");
			new MenuExitService().process();	
		}
		Config.setLoggedIn(true);
	}
//
//	@Override
//	public void processLogic() {
//		// TODO Auto-generated method stub
//		
//	}

}
