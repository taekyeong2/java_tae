package com.yedam.java.ch0302;

public class OperaterExample {

	public static void main(String[] args) {
		//부호 연산자//
		int a = -100;
		int result1 = +a;  // 해당부호 유지
		int result2 = -a;  // 해당부호 반대
		System.out.println("result:" + result1);
		System.out.println("result:" + result2);

		byte b = 100;
//		byte result3 = (byte)-b;
		int result3 = -b; // 강제변환이 아닌이상 인트값으로 해줘야함. 연산 결과는 int 값
		System.out.println("result3:"+result3);
		
		
		//증감연산자//
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-----------------------------------");
		x++; //11
		++x; //12
		
		
		System.out.println("-----------------------------------");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("-----------------------------------");
		z = x++;   //'='은 무조건 맨 마지막 실행. '++'뒤에 있을때 나중에 실행(나를 제외하고 먼저 실행 그 후 +1) ->'='먼저 실행
		System.out.println("z=" + z);  
		System.out.println("x=" + x);
		
		System.out.println("-----------------------------------");
		z = ++x;
		System.out.println("z=" + z);  
		System.out.println("x=" + x);
		
		System.out.println("-----------------------------------");
		z = ++x + y++;  // 연산자 총 4개 ( =, ++, + , ++) 
		System.out.println("z=" + z);  
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		/*******/
		x = 5;
		y = 5;
		
		System.out.println("-----------------------------------");
		z = x++ + --y ; //  9  6  4
		/*
		 1) --y => 4
		 2) x + y => 9
		 3) x++ => 6
		 4) z = x + y => 9
		 */
		System.out.println("z=" + z);  
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		System.out.println("-----------------------------------");
		z = --x + y++ ; // 9 5 5  
		/*
		 1) --x => 5
		 2) x + y => 9
		 3) y++ => 5
		 4) z = x + y => 9
 		 */
		System.out.println("z=" + z);  
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		// 먼저 생각 후 실행	
		
		
		//논리 부정 연산자//
		boolean play = true;
		System.out.println(play);
		
		play = !play; //논리 부정 연산자는 앞에 붙음.
		System.out.println(play);
		
		boolean isOpen = true;
		
		if(!isOpen) {  //이 변수와 반대되는 어떤 상황인 경우. -> 계속 트루인 상태로 만들었는데 뭔가 비활성화 되어있거나 문제가 생겼을때
			System.out.println("영업시간이 종료되었습니다.");
		}else{
			System.out.println("영업중입니다.");	
		}
		
		//산술 연산자
		int v1 = 5;
		int v2 = 2;
		
		int result;
		result = v1 + v2;
		System.out.println("result: "+ result);
		
		result = v1 - v2;
		System.out.println("result: "+ result);
		
		result = v1 * v2;
		System.out.println("result: "+ result);
		
		result = v1 / v2;
		System.out.println("result: "+ result);
		
		result = v1 % v2;
		System.out.println("result: "+ result);
		
		//비교연산자
		int num1 = 10;
		int num2 = 10;
		boolean bResult;
		
		bResult = (num1 <= num2);
		//bResult = (num1 >= num2);  // <,>는 경계의 값을 빼니까 대부분 >=,<=씀
		System.out.println(">= : "+bResult);
		bResult = (num1 == num2);   // java는 ===는 없당
		System.out.println("== : "+bResult);
		bResult = (num1 != num2);
		System.out.println("!= : "+bResult);

		char char1 = 'A'; //65
		char char2 = 'B'; //66 
		System.out.println("문자비교: " + (char1 > char2));
		
		int v3 = 1;
		double v4 = 1.0;
		System.out.println("int vs double: "+(v3==v4));
		
		float v5 = 0.1F;
		double v6 = 0.1;
		System.out.println("float vs double: "+(v5==v6)); //정밀도가 달라서
		System.out.println("float vs float: "+ (v5 ==(float)v6)); //동일한 타입으로 비교하는것이 젤 좋다.
		
		
		//논리 연산자
		int charCode = 'A';
		
		//유니코드 중 (65보다 크거나 같고) (90보다 작거나 같으면) 대문자
		if(charCode >= 65 && charCode <= 90) {  
	    //(charCode >= 65) && (charCode <= 90)  -> 먼저 실행하고 싶음 ()
			System.out.println("대문자");
		}
		
		//유니코드 중 97보다 크거나 같고 122보다 작거나 같으면 소문자
		if(charCode >= 97 && charCode <=122) {
			System.out.println("소문자");
		}
		//&&를 주로 사용 -> 단순히 논리 비교할때 &&는 &와 달리 두개를 다 비교하지 않고 앞의것이 false면 바로 반환시킴.
	
		//유니코드 중 48보다 크고 57보다 작으면 숫자 0~9
		if(charCode > 48 && charCode <57) {
			System.out.println("숫자 0~9");
		}
		
		int numValue = 6;
		if(numValue % 2 ==0 || numValue % 3 == 0) {  //|와 달리 || 는 앞의 값이 트루면 전부 봔환
			System.out.println("2또는 3의 배수군요.");
		}
		
		
		// 복합 대입연산자
		int resultA = 0;
		resultA += 10; // resultA = resultA + 10
		System.out.println("+=: "+ resultA);
		resultA -= 5; // resultA = resultA - 5
		System.out.println("-=: "+ resultA);
		resultA *= 3; // resultA = resultA * 3
		System.out.println("*=: "+ resultA);
		resultA /= 5; // resultA = resultA / 5
		System.out.println("/=: "+ resultA);
		resultA %= 3; // resultA = resultA % 3
		System.out.println("%=: "+ resultA);
		 
		
		// 삼항연산자 - 값을 반환 -> 변수에 많이 쓴다.
		int score = 85;
		char grade = (score > 90) ? 'A' : 'b';
		System.out.printf("성적은 %d이고 등급은 %c 입니다.\n",score, grade);    // %c -> char타입을 문자로 변환하고 싶을때 (%d하면 숫자로 반환)
		                                                                 // %s -> %s도 큰 범위라서 String변환해줌..
		int age = 17;
		String message = (age >= 20)? "성인" : "미성년" ;
		System.out.printf("나이는 %d살이고 %s입니다.\n",age, message);   
		
	}

}
