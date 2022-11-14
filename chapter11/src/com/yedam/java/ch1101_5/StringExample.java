package com.yedam.java.ch1101_5;

import java.io.UnsupportedEncodingException;

public class StringExample {
	//String에 대하여
	
	//String a = "1"; //100번지
	//String c = "1"; //100번지
	//String b = new String("1"); //200번지
	
	public static void main(String[] args) {
		//바이트 -> 문자열
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		//배열 전체를 String객체로 생성
		String str1 = new String(bytes);
		System.out.println(str1);
		
		//String str2 = new String(바이트배열, 시작점, 갯수)
		String str2 = new String(bytes, 6, 4); // ->6번째부터 4개 가져옴
		System.out.println(str2);
		
		//String 메소드
		//1) charAt(int index) -> 특정 문자 위치를 반환 (문자열은 ㄴㄴ, 하나만 넣을 수 있음)
		String ssn = "123456-1876541";
		char sex = ssn.charAt(7);
		
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
		
		//문자열 비교
		//equals()
		String strVar1 = new String("java");
		String strVar2 = "java";
		String strVar3 = "java";
		
		//주소를 비교
		if(strVar1 == strVar2) {
			System.out.println("같은 String객체를 참조");
		}else {
			System.out.println("다른 String객체를 참조");
		}
		
		if(strVar1.equals(strVar3)) {
			System.out.println("같은 문자열 가짐");
		}else {
			System.out.println("다른 문자열 가짐");
		}
	
		//byte 배열로 변환
		byte[] bytes2 = null;
		String str = "안녕하세요";
		bytes2 = str.getBytes();
		System.out.println(bytes2.length); //한글은 하나에 3byte
		
		//byte -> String 디코딩
		//String -> byte 인코딩
	
		String str3 = new String(bytes2);
		System.out.println("bytes2 -> String: "+ str3);
		
		try {
			byte[] bytes3 = str.getBytes("EUC-KR");
			System.out.println("bytes3.length: "+ bytes3.length);
			String str4 = new String(bytes3, "EUC-KR");
			System.out.println("bytes3 -> str: "+str4);
		} catch(UnsupportedEncodingException e) { //예외 발생시 
			e.printStackTrace(); //이쪽으로 이동
		}
		
		//문자열 찾기
		String subject = "자바 프로그래밍";
		int index = subject.indexOf("프로그래밍");
		System.out.println(index);
		
		index = subject.indexOf("a");
		System.out.println(index); //해당문자가 있는지 없는지 확인가능(없으면 -1)
		
		//문자열의 문자 개수 얻기
		System.out.println(subject.length());
		
		//문자열 대체
		String oldStr = "자바 프로그램밍";
		String newStr = oldStr.replace("자바", "java");
		//java 프로그래밍 -> 바뀐게 아니라 java 프로그래밍이라는 새로운 메모리가 만들어진것.
		System.out.println(newStr);
		
		//oldStr = "자바"; //100번지
		//oldStr += "프로그래밍"; //200번지
		//oldStr += "재밌다."; //300번지
		
		//Stringbuilder 또는 buffer  -> 메모리 절약
		//임시저장소 하나에 원하는 문자 저장 
		StringBuilder sb = new  StringBuilder();
		StringBuffer sb2 = new StringBuffer();
		
		sb2.append(false);
		
		sb.append("자바"); //500번지
		sb.append("프로그래밍"); //500번지	
		sb.append(123); //500번지
		System.out.println(sb);
		
		//대소문자 바꾸기
		String strVal = "asgsdgjskdgjlsdg";
		String strVal2 = "DKGJSLDGJIGLSAGDKLGJ";
		
		System.out.println(strVal.toUpperCase());
		System.out.println(strVal2.toLowerCase());
		
		//tirm -> 문자 앞뒤 공백 지우기
		String strTrim = "      자바    ";
		System.out.println(strTrim);
		System.out.println(strTrim.trim());
		
		//substring()
		//substring(index, end) -> index부터 end까지 자르세요
		// 이때 end의 앞까지 자른다. => 자를려고 하는 문자위치 +1 
		//substring(index) -> index부터 자르세요
		String ssn2 = "88815-1234567";
		String firstNum = ssn2.substring(1,6);
		String secondNum = ssn2.substring(7);
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		//split()
		String strSplit = "1-1-1-11-2-3-4-5-3";
		String[] strAry = strSplit.split("-");
		for(String temp : strAry) {
			System.out.println(temp);
		}
		
		//문자열 변환
		//숫자나, 소수 , 불리언 -> 스트링으로 변환
		String strChng = String.valueOf(false);
		String strChng1 = String.valueOf(10);
		String strChng2 = String.valueOf(10.7);
		
		System.out.println(strChng);
		System.out.println(strChng1);
		System.out.println(strChng2);
		
		
		
		
		
		
		
		
	}
}
