package com.yedam.java.ch0601;

public class CarExample { //실행 클래스 실행.
	public static void main(String[] args) {
		//car라는 클래스로 인스턴스 생성
		Car car1 = new Car(); //new연산자 -> 생성자 호출(힙영역에 객체 만듬 -> 그 객체의 주소값이 car1변수에)
		//car1이 (힙영역)인스턴스 참조해서 읽어옴
		System.out.println("최대스피드 : "+ car1.maxSpeed); //내부의 속성값 출력
		System.out.println("색깔 : "+ car1.color);
		car1.run(); //동작 -> 함수호출 ()
		
		System.out.println();
		//새로운 인스턴스 참조
		Car car2 = new Car(); //new연산자 -> 생성자 호출(힙영역에 또다른 객체만듦)
		System.out.println("최대스피드 : "+ car2.maxSpeed); 
		System.out.println("색깔 : "+ car2.color);
		car2.run();
		
		System.out.println();
		if(car1 == car2) {
			System.out.println("car1과 car2는 동일한 객체를 참조하고 있습니다.");
		}else {
			System.out.println("car1과 car2는 서로 다른 객체를 참조하고 있습니다.");
	       //같은 클래스로 만들어졌지만 다른 객체임(쌍둥이) -> 생성 후 각각 변경이 될수 있다.
		}
		
		
		
	}
}
