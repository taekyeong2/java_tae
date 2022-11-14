package com.yedam.java.ch0702_2;

public class Application {
	public static void main(String[] args) {
		//필드의 다형성
		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			// run메소드 실행해서. return 한 1-4를 이용해서
			// 문제가 있는 타이어가 어느 위치인지 아는것
			int problemTire = car.run();

			switch (problemTire) {
			case 0:
				System.out.println("4짝이 다 멀쩡합니다.");
				break;
			case 1:
				System.out.println("앞왼쪽 한국타이어로 교체");
				//(부모) frontLeftTire(-> Tire 타입) (Tire의 생성자로 만든 객체)
				//=> Tire타입의 자식 객체를 상속받은 타이어를 넣어줌(자동타입변환) 
				// -> (자동타입변황으로)자식에 저장된 오버라이딩된 메소드 활용
				// (같은 규격(Tire)이지만 각각 차이(오버라이딩)가 있음  
				//   -> 하나의 규격(클래스)으로 다양한걸(자식객체) 만드는것 ->다형성)
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
		     /* -----------------------------------------------
				 ㄴ>이거랑 같음 => HankookTire tire = new HankookTire("앞왼쪽", 15);
				                car.frontLeftTire = tire
		     */
				break;
			case 2:
				System.out.println("앞오른쪽 금호타이어로 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 한국타이어로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 금호타이어로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);
				break;

			}
			System.out.println("==============================");
		}
	}
}
