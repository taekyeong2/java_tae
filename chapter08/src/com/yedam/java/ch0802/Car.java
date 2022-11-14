package com.yedam.java.ch0802;

public class Car {
	Tire frontLeftTire = new NexonTire();
	Tire frontRightTire = new NexonTire();
	Tire backLetfTire = new NexonTire();
	Tire backRightTire = new NexonTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLetfTire.roll();
		backRightTire.roll();
	}
}
