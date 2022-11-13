package com.yedam.java.homework02;

public class ObesityInfo extends StandarWeightInfo{

	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	public double getObesity() {
		double result = (weight - getStandardWeight())
				/getStandardWeight() * 100;
		return result;
	}
	
	public String standardObesity() {
		String result = null;
		if(getObesity()>= 20) {
			result = "비만";
		}else {
			result = "노비만"; 
		}
		return result;
	}

	@Override
	public void getInformation() {
		System.out.printf("%s님의 신장 %d, 몸무게 %d, %s입니다.\n"
				, name, height, weight, standardObesity());
	}
	

}
