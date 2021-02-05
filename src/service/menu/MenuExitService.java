package service.menu;

import menu.service.inter.MenuExitServiceInter;

public class MenuExitService implements MenuExitServiceInter {

	@Override
	public void process() {
		System.out.println("Application was ended");
		System.exit(0);

	}

//	@Override
//	public void processLogic() {
//		// TODO Auto-generated method stub
//		
//	}

}
