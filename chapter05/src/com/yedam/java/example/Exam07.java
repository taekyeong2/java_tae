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
				numList = new int[6];
			} else if (selectNo == 2) { // 1~45중 랜덤값 하나씩 가져옴.
				if (count < numList.length) {
					int num = (int) (Math.random() * 45) + 1;
					numList[count++] = num; // 인덱스의 역할 + 현재 몇개가 카운트 된건지 알 수 있다
					System.out.println("현재 가져온 수의 갯수 : " + count);
				} else {
					System.out.println("더이상 숫자를 가져올 수 없습니다.");
				}
			} else if (selectNo == 3) { // 기존의 값 중 가장 최근 값 삭제(하나만)

			} else if (selectNo == 4) { // 배열의 값을 전부 출력.

			} else if (selectNo == 5) { // 중복유무와 중복된 값이 몇번 중복되었는지

			} else if (selectNo == 6) {
				run = false;
			} else {
				System.out.println("정해진 메뉴를 입력하지 않았습니다.");
				System.out.println("메뉴를 확인하고 다시 입력하세요.");
			}

		}

	}
}
