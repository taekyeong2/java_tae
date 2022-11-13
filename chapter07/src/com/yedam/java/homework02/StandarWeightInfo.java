package com.yedam.java.homework02;

public class StandarWeightInfo extends Human {

	public StandarWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	public double getStandardWeight() {
		double result = (height - 100)*0.9;
		return result;
	}

	@Override
	public void getInformation() {
		System.out.printf("%s님의 신장 %d, 몸무게 %d, 표준채중 %.1f 입니다.\n"
				, name, height, weight, getStandardWeight());
	}
	
}
