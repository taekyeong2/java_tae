package com.yedam.java.homework02;

public class Application {
	public static void main(String[] args) {
		Human human1 = new StandarWeightInfo("홍길동", 168, 45);
		Human human2 = new ObesityInfo("박둘이", 168, 90);
		
		human1.getInformation();
		human2.getInformation();
	}
}
