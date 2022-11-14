package com.yedam.java.ch0801_2;

public class LGWashingMachine implements WashingMachine{
	
	@Override
	public void startBtn() {
		System.out.println("세탁기가 빨래를 시작.");
	}

	@Override
	public void pauseBtn() {
		System.out.println("세탁기가 빨래를 일시 중지.");
	}

	@Override
	public void stopBtn() {
		System.out.println("세탁기가 빨래를 중지.");
	}

	@Override
	public int changeSeed(int speed) {
		switch(speed) {
		case 1:
			return 20;
		case 2:
			return 50;
		case 3:
			return 100;
		}
		return 0;
	}
	
}
