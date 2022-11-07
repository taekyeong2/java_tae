package com.yedam.java.ch0401;

import java.util.Scanner;

public class ConditionalStatementSubject {
	public static void main(String[] args) {
		//문제 1) 두개의 정수가 주어졌을때 
		//       두 정수의 합이 자연수이면
		//       "Natural Number"을 출력
	    
		Scanner sc = new Scanner(System.in);
		/*
		int a = sc.nextInt(); 
	    int b = sc.nextInt();
	    
	    if(a + b > 0) {
	    	System.out.println("Natural Number");
	    }
	    */
	    
	    //문제2) 두개의 정수가 주어졌을때
	    //      두 수의 대소관계에 따라서 부등호를 출력
		/*
	    if( a > b ) {
	    	System.out.println(">");
	    }else if(a < b) {
	    	System.out.println("<");
	    }else {
	    	System.out.println("=");
	    }
	    */
	    
	    //문제3) 체질량 지수인 BMI에 따라 비만도를 네가지 단계로 구분.
	    //     BMI = 체중 / (키(m) * 키(m))
	    //     저체중(18.5미만), 정상*(18.5이상 25 미만), 과체중(25이상 30 미만), 비만 (30 이상)
		/*
		double weight = sc.nextDouble();
		double height = sc.nextDouble();
		double bmi = weight / (height * height);
		
		if(bmi < 18.5) {  // switch문은 정확하게 값이 떨어져야 한다. 범위는 못씀
			System.out.println("저체중");
		}else if( bmi < 25) { // 18.5이상을 표시할 필요 없다. -> 중복/이미 값이 자동으로 포함돼있다.
			System.out.println("정상");
		}else if( bmi < 30) {
			System.out.println("과체중");
		}else{
			System.out.println("비만");
		}
		*/
		
		//문제4) 선택한 단의 6번째 값을 출력하는 코드
		//      예를 들어 2단의 경우 2*6 = 12
		//      단, 출력문에는 변수 사용 하지 않는다.
		/*
		int m = sc.nextInt();  // 입력숫자
		int m = (int)(Math.random()*9)+1;  //랜덤숫자
		
		switch(m) {
		case 1:
			System.out.printf("%d x 6 = %d\n", 1, 1*6); // 변수 굳이 사용하지 않아도 된다.->필요할때만 써야함.
			break;
		case 2:
			System.out.printf("%d x 6 = %d\n", 2, 2*6);
			break;
		case 3:
			System.out.printf("%d x 6 = %d\n", 3, 3*6);
			break;
		case 4:
			System.out.printf("%d x 6 = %d\n", 4, 4*6);
			break;
		case 5:
			System.out.printf("%d x 6 = %d\n", 5, 5*6);
			break;
		case 6:
			System.out.printf("%d x 6 = %d\n", 6, 6*6);
			break;
		case 7:
			System.out.printf("%d x 6 = %d\n", 7, 7*6);
			break;
		case 8:
			System.out.printf("%d x 6 = %d\n", 8, 8*6);
			break;
		default:
			System.out.printf("%d x 6 = %d\n", 9, 9*6);/		}
        */
		
		//문제 5) 다음과 같이 점수 범위에 따라 등급을 구분
		//       해당 점수에 대한 덩급을 출력하는 코드
		//       90이상 100점 이하 A등급/ -> 90, 91, 92, ... , 99, 100
		//       80이상 90점 미만 b등급 / -> 80, 81, 82, ... , 89
		//       70이상 80미만 c / 60이상 70미만 d/ 60 미만 E
		
		int g = sc.nextInt();
		int grade = g/10 ;
		
		switch(grade) {
		case 10:
		case 9:
			System.out.println("A등급입니다.");
			break;
		case 8:
			System.out.println("B등급입니다.");
			break;
		case 7:
			System.out.println("C등급입니다.");
			break;
		case 6:
			System.out.println("D등급입니다.");
			break;
		default:
			System.out.println("E등급입니다.");
		}
	}
}
