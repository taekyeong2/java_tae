package com.yedam.java.ch0401;

public class ConditionalStatementExample {
	public static void main(String[] args) {
		//기본 if문
		int score = 80;
		
		if(score >= 90) { //true일때만 내부것이 추가로 실행.
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		System.out.println("if문 상관없이 실행됩니다.");
		
		/*
		if(score < 90)  {}를 생략한 경우 밑의 바로 한줄만 실행. -> 두줄 이상인 경우 {}사용. 
			System.out.println("점수가 90보다 작습니다.");
		    System.out.println("등급은 B입니다.");
		    
		if(score < 90) System.out.println("점수가 90보다 작습니다.");
	    */
		
		
		//if~else문   -> 참 거짓에 따라 실행하고싶은 것들이 다르면 사용.
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}else {
			System.out.println("점수가 90보다 작습니다.");
		    System.out.println("등급은 B입니다.");
		}
		
		
		//if~else if~else문  
		// -> 어떤 값을 분류할때 사용.(점수 등급매기기)  // 조건이 순차적인가? 
		if(score >= 90) {
			System.out.println("점수가 100~90입니다..");
			System.out.println("등급은 A입니다.");
		}else if(score >= 80) {
			System.out.println("점수가 89~80입니다.."); //위에 있는 if문과 연동되어서 90보다 작아야함.
			                                        // score < 90 && score >= 80
			System.out.println("등급은 B입니다.");
		}else if(score >= 70) {
			System.out.println("점수가 79~70입니다.."); // score < 80 && score >= 70
			System.out.println("등급은 C입니다.");
		}else {   // score < 70
			System.out.println("점수가 70미만입니다.");
		    System.out.println("등급은 D입니다.");
		}
		
		
		/* (책 p139) 
		  1) 0.0 <= Math.random() < 1.0
		  2) 0.0 * 10 <= Math.random() * 10 < 1.0 * 10
		  3) (int) 0 <= (int)(Math.random() * 10) < (int) 10
		  4) (int) 0 + 1 <= (int)(Math.random() * 10 ) + 1 < 10 + 1
		  5) 1,2,3,4,5,6,7,8,9,10
		  
		  => 공식 : (int)(Math.random() * count ) + start
		 */
		 int num = (int)(Math.random() * 6) + 1;
		 
		 if (num == 1) {
			 System.out.println("1번이 나왔습니다.");
		 }else if(num == 2) {
			 System.out.println("2번이 나왔습니다.");
		 }else if(num == 3) {
			 System.out.println("3번이 나왔습니다.");
		 }else if(num == 4) {
			 System.out.println("4번이 나왔습니다.");
		 }else if(num == 5) {
			 System.out.println("5번이 나왔습니다.");
		 }else if(num == 6) {
			 System.out.println("6번이 나왔습니다.");
		 }
		
		
		 //switch => 변수의 값이 조건이 되는 경우.
		 num = (int)(Math.random() * 6) + 1;
		 
		 switch(num) {
		 case 1:
			 System.out.println("1번이 나왔습니다.");
			 break;
		 case 2:
			 System.out.println("2번이 나왔습니다.");
			 break;
		 case 3:
			 System.out.println("3번이 나왔습니다.");
			 break;
		 case 4:
			 System.out.println("4번이 나왔습니다.");
			 break;
		 case 5:
			 System.out.println("5번이 나왔습니다.");
			 break;
		 default:
			 System.out.println("6번이 나왔습니다.");
		 }
		
		//break문이 없는 case
		int time = (int)(Math.random() * 4) + 8;
		System.out.println("[현재시각 : "+ time + "시]");
		
		switch(time) {  //break가 없을때 연속적으로 실행된다.
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");  //연달아 밑에것 까지 실행.
		}
		
		
		//char 타입의 switch문
		//쇼핑몰 : 우수회원 - A / 일반회원 - B / 손님
		// if 문일 경우 (사용자가 입력할) char의 소문자와 대문자를 둘다 조건으로 고려해야함.
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수회원입니다.");
			break;  // 필요에 따라 생략해서 두가지 경우의 수를 한번에 처리 가능
		case 'B':
		case 'b':
			System.out.println("일반회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		
		}
		
		
		//string 타입의 switch문
		String position = "과장";
		
		switch(position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
		}
		
		
		
	}
}
