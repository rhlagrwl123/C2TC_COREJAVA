package manager;

import junior_dev.CarModel;
import junior_dev.SpeedLimit;
import senior_dev.*;

public class Authority {

	public static void main(String[] args) {
		
		CarModel cr = new CarModel();
		SpeedLimit sl = new SpeedLimit();
		BenzCar bz = new BenzCar();
		cr.model();
		sl.speed();
		bz.demo();
	}

}