package com.yedam.java.ch0604;

public class Car {
	// 필드
	int gas;

	// 생성자

	// 메소드
	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (this.gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;  //return(중단)이 있으니까 else를 사용할 필요. ㄴㄴ
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(this.isLeftGas()) {   //while도는 동안 isLeftGas()의 참 거짓 값을 계속줌
				System.out.println("달립니다.(gas잔량 : "+ this.gas+")");
				this.gas--;
			}else {
				System.out.println("멈춥니다.(gas잔량 : "+ this.gas+")");
				return; //break는 반복문 멈춤 , return은 해당 메소드 멈춤
				//System.out.println("종료합니다."); -> 실행 ㄴㄴ
			}
		}
	}

}
