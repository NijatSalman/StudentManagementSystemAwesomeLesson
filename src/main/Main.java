package main;

import java.util.Scanner;

import config.Config;
import inter.Process;
import service.menu.MenuLoginService;
import service.menu.ValidateInputService;
import util.Menu;
import util.MenuUtil;

public class Main {

	public static void main(String[] args) {
	Config.initialize();
		Menu selectedMenu;
		while(true){		
			MenuUtil.showMenu();		
			selectedMenu=MenuUtil.selectedMenu();
			MenuUtil.processMenu(selectedMenu);
		}
		
		
		
	}

}
