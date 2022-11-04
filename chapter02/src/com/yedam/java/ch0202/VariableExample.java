package com.yedam.java.ch0202;

public class VariableExample {

	public static void main(String[] args) {
	//byte타입
	byte var1 = -128;
	byte var2 = -30;
	byte var3 = 0;
	byte var4 = 127;
//	byte var5 = 128;
//	byte var6 = 100.0;
	System.out.println(var1);
//	System.out.println(var5);
	
	long var7 = 100000000000L;  //자바에서 정수는 무조건 int로 인식하도록 지정 -> 그래서 long범위 안이지만 값부터 인지하니까 오류 
	                            // -> 뒤에 L을 붙여주면 long타입 범위안으로 인식
	long var8 = 1000000; //int로 인식하지만 굳이 문제 ㄴㄴ -> int를 벗어나는 값에 한에서 L붙여주면됨
	
	//char 타입
	char v1 = 'A'; // char타입은 ''사용
	char v11 = 65; // 숫자로  담아도 유니코드로 인식 같은 값 나옴
	char v2 = '가';	// 한글자만 담을 수 있음
	int v3 = v1; // 또다른 변수 타입에 담길수도 있음
	System.out.println(v1);  //ln이 줄바꿈임
	System.out.println(v11);
	System.out.println(v2);
	System.out.println(v3);
	
	//string - 클래스지만 일반적인 타입으로도 가능 ㅣ "" 사용(문자열 리터럴)
	String name = "홍길동"; // 자동으로 유니코드 변환 노노 / 객체임에도 불구하고 기본타입처럼 값을 주는 형태로 쓸수있음.
	String jop = "프로그래머";
	System.out.println(name); 
	System.out.println(name.length());
	System.out.println(jop);
	System.out.println(jop.charAt(3)); //인덱스(앞부분부터 0123 )
	
	
	//char vs String
//	char v4 = "A"; // ""쓰면 인지노노	
//	char v5 = 'AB'; // 유니코드 상에 없는 글자라서 인지 노노, 공백 ('')도 인지 노노 -> 무조건 ''사용해서 한글자만 입력
	String v6 = ""; //공백 입력가능, 특수문자도 입력 가능.
//	String v7 = "A" // 한글자만 입력해도 ㅇ
//	Strinf v8 = 'A' // ''쓰면 인지노노
	
	String str1 = "누군가 \"안녕\" 하면서 인사했다.";  //안에서 ""사용할려면 \"ㅇㅇㅇ\" 
	
	
	// float
//	float num1 = 3.14; 
	float num1 = 3.14F; //float표현 위해 F를 붙여
	double num2 = 3.14;
	
	float varF = 0.1234567890123456789F;
	double varD = 0.1234567890123456789;
	
	System.out.println(varF);
	System.out.println(varD);  //똑같은 값이지만 표한할수 있는 값이 달라서 다르게 나옴.
	
	//boolean 
	boolean stop = (1>2); // false or true;
	if(stop) {    //==== (1>2)가 표현식
		System.out.println("중지합니다.");
	}else {
		System.out.println("시작합니다.");
	}
	
	}

}
