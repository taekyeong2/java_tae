package com.yedam.java.ch06;

public class PhoneExample {
	public static void main(String[] args) {
		SmartPhone iphone14Pro = new SmartPhone();
		// 클래스에 생성자를 형성 안했을땐 기본생성자가 만들어 지지만. 
		// 생성자를 만들면 기본생성자는 만들어지지 않음.
		
		iphone14Pro.maker = "Apple";
		iphone14Pro.name = "iphone14Pro";
		iphone14Pro.price = 1000000;
		
		System.out.println("나의 핸드폰은 " + iphone14Pro.maker + "입니다.");
		System.out.println("나의 핸드폰 기종은 " + iphone14Pro.name + "입니다.");
		
		iphone14Pro.call();
		iphone14Pro.hangUp();
		
		System.out.println();
		
		SmartPhone zflip4 = new SmartPhone(); // -> 또다른 생성자를 쓸수도있다.
		System.out.println("객체생성했을때 초기값을 안 넣어준 경우");
		System.out.println(zflip4.name);
		
		zflip4.maker = "Samsung";
		zflip4.name = "zfilp4";
		zflip4.price = 900000;
		
		zflip4.call();
		zflip4.hangUp();
		
		System.out.println();
		System.out.println(iphone14Pro);
		System.out.println(zflip4);
		// -> '클래스위치@객체'가 담긴 주소값(메모리(힙영역?)에 객체가 저장)
		//참조타입 => 데이터가 위치한 주소값을 가지고 있다. -> 그 주소로 찾아가서 정보를 가져옴.
		//new 연산자 -> 데이터 저장할 공간 할당해서 만든다.(힙영역에)
		//생성자 -> new연산자가 만든 공간에 생성자를 통해 객체가 만들어짐(초기값을 가지고..).
		
	}
}
