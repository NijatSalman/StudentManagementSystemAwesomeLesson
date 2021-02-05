package inter;

import config.Config;

public interface SaveAbleProcess extends Process {

	default void process(){
		//processLogic();
		Config.save();
	}
}
