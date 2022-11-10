package com.yedam.java.ch0603;

public class Car {
	//필드
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed; 
	
	//생성자
    /*변수 이름 중복되면 안되지만 생성자는 가능(Car). -> 오버로딩 
	public Car(String model, String color) { 
		
		//        생성자, 메소드 안에서만 정상적으로 작동.
		this(인스턴스,객체 자신의 참조).model(필드) = model(매개변수);  
		//this ->나(객체)자신, 인스턴스 생성하고 그것이 들고있는 값을 대체하는것.( 기존의 모델과 색깔값을 덮어씌움/ 
		//                                              클래스 필드 값 안에 있는 값을 바꾸는것이 아님)
		this.color = color;
	}
	
	=====> this.필드 = 매개변수  : (인스턴스가 참조하는 곳인 )필드 값을 매개변수(입력된값)로 대체
	//매개변수가 우선 -> 매개변수가 우선 -> 따라서 필드안의 것이 먼저 적용하기 위해 this.필드 사용함.

	*/

	public Car() {
		
	}
    public Car(String model) {
    	//this.model = model;
    	this(model, "은색", 250); //중복을ㅈ 줄이기 위해 좀더 포괄적인 생성자를 호출(this())해서 변경할 값과 남겨놓을 값 입력.
    	                         // this() -> 반드시 첫줄에만 호출 가능하다.
    	//this -> 필드 , this() ->생성자
    }
    public Car(String model, String color) { 
		//this.model = model;  
		//this.color = color;
    	this(model, color, 250);
	}
    public Car(String model, String color, int maxSpeed) {
    	this.model = model;
    	this.color = color;
    	this.maxSpeed = maxSpeed;
    }
    
    
    
    
    
}
