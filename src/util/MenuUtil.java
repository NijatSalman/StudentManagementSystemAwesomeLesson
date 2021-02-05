package util;

import java.util.Scanner;

import config.Config;

public class MenuUtil {

	private static Menu[] menus = Menu.values();

	public static void showMenu() {
		for (int i = 0; i < menus.length; i++) {
		//	System.out.println(menus[i]);
			if(menus[i] != Menu.UNKNOWN){
				if(menus[i]==Menu.LOGIN || menus[i]==Menu.REGISTER){
					if(!Config.isLoggedIn()){
					System.out.println(menus[i]);
					}
				}else if(Config.isLoggedIn()){
					System.out.println(menus[i]);
				}
			}
		}
	}

	public static Menu selectedMenu() {
		System.out.println("Please choose menu");
		Scanner sc = new Scanner(System.in);
		int selectedNumber = sc.nextInt();
		for (int i = 0; i < menus.length; i++) {
			if (menus[i].getNumber() == selectedNumber) {
				return menus[i];
			}
		}
		return null;
	}

	public static void processMenu(Menu menu) {
		menu.process();
	}
}
