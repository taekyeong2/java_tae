package com.yedam.java.ch0402;

public class ConditionalStatementSubject {
	public static void main(String[] args) {
		/*문제1) 책 161페이지 5번
		
		*
		**
		***
		****
		*****
		
		*/
		
		String tree = "";
		for(int i=1; i<=5; i++) {
			tree += "*";  // 문자열 결합
			System.out.println(tree);
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*"); // 한줄이 아닌 한글자씩 출력할거니까 print
			}
			System.out.println();
		}
		
		
		//문제2) for문 이용 1-100 정수 중에서 
		//     2의 배수가 아닌 숫가의 갯수를 구하세요.
		int count = 0;
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) continue;
			count++;
		}
		System.out.println(count);
		
		
		//문제3) 책 161 - 4번 
		//     중첩 for문 이용해서 방정식 4x+5y=60의 모든 해 중에서 첫번째로 구해지는 값을
		//     (x,y)의 형태로 출력 단, 10이하의 자연수로
		int x;
		int y;
		Outter:for(x=1; x<=10; x++) {
			for (y=1; y<=10; y++) {
				if((4*x) + (5*y) == 60) {
				System.out.println("("+x+","+y+")");
				break Outter; //***
				}
			}	
		}
		
		
		//문제 4) do-while문과 Math.random함수 이용
		//       1-10의 정수 중 7이라는 수가 나올때 까지 숫자 출력
		int num = 0;
		do {
			num = (int)(Math.random() * 10) + 1;
			System.out.println(num);
			
		}while(num != 7);
		
		
		//문제5) 161 -3, while문과 랜덤수 이용
		//      1-6 2개의 주사위 던졌을때 숫자를 (숫자1, 숫자2)로 출력
		//      숫자의 합이 5일 경우 종료 , 아닌경우 계속 던짐.
        //      최종으로 주사위 몇번 던졌는지 횟수를 출력
		//  숫자의 합이 5가 되는 조합은 (1,4)(4,1)(2,3)(3,2)\
		
		int total = 0;
		while(true) {
			int a = (int)(Math.random() * 6) + 1;
			int b = (int)(Math.random() * 6) + 1;  // while문이 끝나면 사라질 변수들은 깔끔하게 안에서 처리
			total ++;
			System.out.printf("(%d, %d)\n",a ,b);
			if(a + b == 5) {
				break;
			}
		}
		System.out.println("주사위를 던진 횟수는 총 "+ total + "번 입니다.");
		
	
	}
}
