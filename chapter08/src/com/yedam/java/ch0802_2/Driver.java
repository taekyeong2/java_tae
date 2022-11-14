package com.yedam.java.ch0802_2;

public class Driver {

	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) { //매개변수가 버스를 참조하고 잇느냐?
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
