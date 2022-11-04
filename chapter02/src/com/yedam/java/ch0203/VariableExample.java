package com.yedam.java.ch0203;

public class VariableExample {
	public static void main(String[] args) {
		/*자동타입변환 - 값의 손실이 일어나지 않는다.*/ 
		byte byteValue = 10;
//		char charValue = byteValue;
		int intValue = byteValue;
		System.out.println("intVaue : "+intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("intVaue : "+intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longVaue : "+longValue);  
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : "+floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue : "+doubleValue);
		
		//강제타입변환
		intValue = 44032;  
		charValue = (char) intValue;
		System.out.println(charValue); 
		
		longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue); 
		
		doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue); // 실수 -> 정수 데이터 손실
		
		//정수 타입에서 연산
		byte result = 10 + 20; // 리터럴은 신경 ㄴㄴ 
		
		byte x = 10;
		byte y = 20;
//		byte result2  = x + y;   변수로 변환해서 변수끼리 연산할때 문제가된다.
		int result3 = x + y;    
		byte result4 = (byte)(x + y);
		System.out.println(result3+","+result4);
		
		char charValue1 ='A';  // 실제 65라는 숫자 
		char charValue2 = 1;
		int intResult = charValue1 + charValue2; // 인트로 변환되면서 문자는 빠지고 숫자만으로 더함.
		System.out.println("유니코드: "+ intResult);
		System.out.println("출력문자: "+(char)intResult); // 다시 유니코드 값을 원한다면 강제변환
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
//		int longResult = value1 + value2 + value3;
		long longResult = value1 + value2 + value3;
		
		int intV1 = 10;
		double doubleV1 = 5.5;
//		int plusV1 = intV1+ doubleV1;
		double plusV1 = intV1+ doubleV1;
		
		int intVar1 = 10;
		int resultVar1 = intVar1/4;	
		System.out.println("10/4결과: "+resultVar1); //소수점까지 결과나 나오지만 int로 결과가 나오기 때문에 
		                                            // but double로 결과를 내도 2.0이 됨
                                                    // 애초에 intVar1/4가 정수니까 double로 결과 실행해도 2만나옴.		
		System.out.println("10/4결과: "+intVar1/4);
	
		int x1 = 1;
		int y1 = 2;
		double result1 = (double)x1/ y1;  //둘 중 하나를 임의로 실수로 바꾼다. -> 캐스팅()은 보다 큰 타입으로 변환할때도 사용.
		System.out.println("1/2결과: "+result1);
		
		 // 앞에 공백이 있음 뒤 전부 문자로 인식
		int value = 10 + 2 + 8;
		System.out.println(value);
		
//		String str1 = 10 + 2 + 8;  // 모두 문자열이라서 연산 노노

		String str2 = 10 + 2 + "8";
		System.out.println(str2);
		String str3 = 10 + "2" + 8;
		System.out.println(str3);
		String str4 = "10" + 2 + 8;  //문자열 결합 "10"+2 ->"102" + 8
		System.out.println(str4);
		String str5 = "10" + (2 + 8);
		System.out.println(str5);
		
		//기본타입 <->String
		/*
		int aVar = Integer.parseInt("10");
		double bVar = Double.parseDouble("a101.0");
		boolean cVar = Boolean.parseBoolean("1");
		
		System.out.println("a: "+aVar);
		System.out.println("b: "+bVar);
		System.out.println("c: "+cVar); // 변환하고자 하는 포맷이 맞이 않을때.
		*/
		
		int aVar = Integer.parseInt("10");
		double bVar = Double.parseDouble("101.0");
		boolean cVar = Boolean.parseBoolean("true");
		
		System.out.println("a: "+aVar);
		System.out.println("b: "+bVar);
		System.out.println("c: "+cVar); 
		
		String strV1 = String.valueOf(10);
		String strV2 = String.valueOf(3.14);
		String strV3 = String.valueOf(true);
		
		System.out.println(strV1);
		System.out.println(strV2);
		System.out.println(strV3);
		
		String strV4 = "" + 105.23; //실수타입을 공백문자열 사용해서 문자열로 바꿔줌 
		System.out.println(strV4);
	}
}
