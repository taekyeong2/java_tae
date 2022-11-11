package com.yedam.java.ch0703;

public class Application {
	public static void main(String[] args) {
		
		//추상클래스는 자신의 객체화(인스턴스화) 할수없다.
		//Phone phone = new Phone("아이폰");
		
		SmartPhone sp = new SmartPhone("고길동");
		sp.turnOn();
		sp.internetSearch();
		sp.turnOff();
		
		System.out.println("----------------");
		
		
		
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("----------------");
		
		Animal animal = null;
		
		//자동타입변환 -> 추상클래스에 정의된 메소드 사용가능
		animal = new Dog();
		animal.sound();
		
		animal.breathe();
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("----------------");
		
		//매개변수 사용한 자동타입변환
		animalSound(new Dog());
		animalSound(new Cat());

		
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
}
