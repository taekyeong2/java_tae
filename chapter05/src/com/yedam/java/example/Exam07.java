package com.yedam.java.example;

import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		// 로또예측 프로그램
		// 1-45
		boolean run = true;
		Scanner sc = new Scanner(System.in);

		int[] numList = null;
		int count = 0;

		while (run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.새로고침 | 2.번호예측 | 3.번호삭제 | 4.번호출력 | 5.분석 | 6.종료");
			System.out.println("------------------------------------------------------");
			System.out.println("선택> ");
			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) { // 로또 담을 수 있는 배열 초기화
				numList = new int[6]; // 새로운 객체 생성. 기존의 객체는 자바가 알아서 처리
			} else if (selectNo == 2) { // 1~45중 랜덤값 하나씩 가져옴.
				if (count < numList.length) { // 6이랑 같으면 이미 꽉차있는것. ->6이되면 else로 빠져나옴.
					int num = (int) (Math.random() * 45) + 1;
					numList[count++] = num; // 인덱스의 역할 + 현재 몇개가 카운트 된건지 알 수 있다
					System.out.println("현재 가져온 수의 갯수 : " + count);
				} else {
					System.out.println("더이상 숫자를 가져올 수 없습니다.");
				}
			} else if (selectNo == 3) { // 기존의 값 중 가장 최근 값 삭제(하나만)
				// count = 6 -> 인덱스 5까지 들어있음. -> count-1
				// 인덱스와 count의 차이는 1. 기존의 count보다 1씩 작아야함.( --count = count -1 )
				numList[--count] = 0; // 의미 없는 값으로 바꿔줌
				System.out.println("현재 가져온 수의 갯수 : " + count);
			} else if (selectNo == 4) { // 배열의 값을 전부 출력.
				System.out.println("현재 가지고 있는 수의 갯수 : " + count);
				for (int i = 0; i < count; i++) {
					System.out.print(numList[i] + " ");
				}
				System.out.println();
			} else if (selectNo == 5) { // 중복유무와 중복된 값이 몇번 중복되었는지

				int[] list = new int[45]; // 중복된 수 투표(체크) 명단
				for (int i = 0; i < count; i++) {
					int index = numList[i] - 1;   //numList[] = {1,2,3,4,...,45} -1 = list의 index값임.{0,1,2,3,...,44}
					                              // numList[] = {3,4,3,5,3,6} => list index [2][3][2][4][2][5]					
					list[index]++;  //   -> 해당 인덱스에 1표씩(+1) 표시 *** // list[2] + 1 + 1
				}

				boolean isChecked = false;
				for (int i = 0; i < list.length; i++) {
					if (list[i] <= 1)   // 2이상의 투표를 받은 인덱스 표시 ***
						continue;
					System.out.printf("숫자 %d의 경우 %d번 중복되었습니다.\n", (i + 1), list[i]);  // i->인덱스 값 . i+1 -> 자리위치
					isChecked = true;
				}
				if (!isChecked) {
					System.out.println("중복값이 존재하지 않습니다.");
				}
				
			} else if (selectNo == 6) {
				run = false;
			} else {
				System.out.println("정해진 메뉴를 입력하지 않았습니다.");
				System.out.println("메뉴를 확인하고 다시 입력하세요.");
			}

		}

	}
}
