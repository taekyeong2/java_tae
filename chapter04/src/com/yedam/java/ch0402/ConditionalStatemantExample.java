package com.yedam.java.ch0402;

public class ConditionalStatemantExample {
	public static void main(String[] args) {
		// for문

		// 1부터 10 까지 출력
		for (int i = 1; i <= 10; i++) {
			System.out.println(i); // i가 11의 값을 가질때 끝.
		}

		/*
		 * for(;;) { //초기화식 조건식 증감식 생략 가능 System.out.println("루프반복"); }
		 */

		int x = 1;
		for (; x <= 100; x += 15) {
			System.out.println("출력 : " + x);
		}
		System.out.println("x : " + x); // x는 100보다는 커서 반복문 멈춘것임.

//		for(int i=0, j=100; i<=50 && j >=50; i++,j--) {}

		// 1부터 100까지 출력, 동시에 1에서 100까지의 합
		int sum = 0; // 합이 누적될 변수 하나 선언.
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("1-100까지의 합계 : " + sum);

		// float 타입 카운터 변수 -> 누적하다 보면 정밀도가 깨진다. 정확하게 안떨어짐.
		// for문과 같은 반복문 쓸때는 가능한 int로 만들어서 사용해야한다.
		for (float f = 0.1F; f <= 1.0F; f += 0.1F) {
			System.out.println(f);
		}

		// 구구단 2-9단 출력
		for (int i = 2; i <= 9; i++) {
			// i=2;
			System.out.println("*** " + i + "단 ***");
			for (int j = 1; j <= 9; j++) {
				// i=2. j=1 -> 2 -> ... -> 9;
				System.out.println(i + "X" + j + "=" + (i * j));
			}
		}

		for (int i = 2; i <= 9; i++) {
			System.out.println("*** " + i + "단 ***");
			for (int j = i; j <= i; j++) { // i값으로 제어 가능
				System.out.println(i + "X" + j + "=" + (i * j));
			}
		}

		// while문

		// 1~10까지 출력
		int count = 1; // while 조건식에서 사용하는 변수는 밖에서 선언해야한다.
		while (count <= 10) {
			System.out.println(count); // 증감식이 빠져있다. -> 1로 무한루프
			count++; // 보통 증감식이 맨밑에 있다.
		}

		count = 0;
		while (count <= 9) {
			count++; // 증감식을 어디 두는지가 중요. - 조건이랑 변수 값이 다 달라짐
			System.out.println(count);
		}

		// 1-100까지 출력, 1-100까지 합 출력
		count = 1;
		sum = 0;
		while (count <= 100) {
			System.out.println(count);
			sum += count;

			count++;
		}
		System.out.println("1~" + (count - 1) + "까지 합 : " + sum); // count의 값은 101이다. / 100초과해야지 while문밖으로 나오니까

		
		int index = 1;
		
		while (index != 1) {
			System.out.println("while 반복문이 " + index + "번 실행됩니다.");
		}
		
		do {    // 반드시 한번은 실행된다.
			System.out.println("do ~ while 반복문이 " + index + "번 실행됩니다.");
		}while (index != 1);
		
		
		//break로 while문 종료
		while(true) {
			int num = (int)(Math.random() * 6) + 1;
			System.out.println(num);
			if (num == 6) break;
		}
		
		//이중 for문에서 break문 사용
		boolean result = false;
		for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					result = true;
					break;  // if문이 속한 for문만 해당
				}
			}
			System.out.println(" 1) 안쪽 for문 종료");
			if(result) break;  // 굳이 이렇게 사용 ㄴ
		}
		System.out.println(" 2) 바깥쪽 for문 종료");
		
		
		System.out.println("------------------------------");
		
		
		Outter:for(char upper = 'A'; upper <= 'Z'; upper++) {   // 해당 for문에 이름.
			for(char lower = 'a'; lower <='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter;   // 이름 붙여서 종료
				}
			}
			System.out.println(" 1) 안쪽 for문 종료");
		}
		System.out.println(" 2) 바깥쪽 for문 종료");
		
		//continue를 사용한 for문
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) { //짝수 아닌경우 출력
				System.out.println(i);
			}
		}
		
		System.out.println("=========================");
		
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) continue;  // 짝수 배제 시키고 출력 (실행하면 안될때 - 건너뛰고 실행)
			System.out.println(i);
		}
		
		
		
		
	}
}
