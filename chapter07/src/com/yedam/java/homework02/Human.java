package com.yedam.java.homework02;

public class Human  {
	public String name;
	public int height;
	public int weight;
	
	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void getInformation() {
		System.out.printf("%s님의 신장 %d, 몸무게 %d 입니다.\n"
				, name, weight, height);
	}
	
}
