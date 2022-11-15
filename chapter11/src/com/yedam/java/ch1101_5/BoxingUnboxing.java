package com.yedam.java.ch1101_5;

public class BoxingUnboxing {
	public static void main(String[] args) {
		//박싱
		
		//1)생성자를 사용한 박싱
		Integer obj1 = new Integer(100); //--표시 -> 사용권장 x
		Integer obj2 = new Integer("200"); //->나중에 꺼낼떄 숫자가 됨
		
		//2)생성자를 사용하지 않는 박싱
		Integer obj3 = Integer.valueOf("300");
		
		
		//언박싱
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1+ value2 + value3);
		System.out.println(value2);
		System.out.println(value3);
		
		
		//자동 박싱
		Integer obj4 = 100;
		
		//자동 언박싱
		int value4 = obj4;
		System.out.println(value4);
		
		
		//타입변환
		int value6 = Integer.parseInt("777");
		double value7 = Double.parseDouble("333");
		boolean value8 = Boolean.parseBoolean("true");
		
		System.out.println(value6);	
		System.out.println(value7);	
		System.out.println(value8);	
		
		//포장값 비교
		Integer obj10 = 100;
		Integer obj11 = 00;
		System.out.println(obj10 == obj11);
		
		
		
		
		
		
		
	}
}
