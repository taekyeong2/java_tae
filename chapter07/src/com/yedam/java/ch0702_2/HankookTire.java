package com.yedam.java.ch0702_2;

public class HankookTire extends Tire{ 
	//매개변수가 있는 부모 클래스여서 빨간줄
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accRotation;
		if(accRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명" 
		+ (maxRotation - accRotation)+ " 회");
			return true;
		}else {
			System.out.println(" ###"+ location + "HankookTire 펑크 ### ");
			return false;
		}
	} 
	
	
	
	
	
	
}
