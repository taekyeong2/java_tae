package com.yedam.java;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		// 문제5)
		boolean run = false;
		Scanner sc = new Scanner(System.in);
		int dice = 0;
		int num = 0;
		int count = 0;
		int[] list = new int[10];

		while (true) {
			System.out.println("===1.주사위 크기 2.주사위 굴리기 3.결과 보기 4.가장 많이 나온 수 5.종료===");
			System.out.println("메뉴 > ");
			int no = Integer.parseInt(sc.nextLine());

			if (no == 1) {
				// 주사위 크기
				System.out.println("주사위 크기 > ");
				num = Integer.parseInt(sc.nextLine());
				if (10 >= num && num >= 5) {
					dice = (int) (Math.random() * num) + 1;
				} else {
					System.out.println("주사위 크기는 5~10 입니다.");
				}
			} else if (no == 2) {
				// 주사위 굴리기
				while (true) {
					dice = (int) (Math.random() * num) + 1;
					count++;
					for (int i = 0; i < count; i++) {   // 포문 돌리니까 누적되서 횟수가 나왔나?
						int index = dice - 1;
						list[index]++;
					}
					if (dice == 5)
						break;
				}
				System.out.printf("5가 나올때 까지 주사위를 %d번 굴렸습니다.\n", count);
			} else if (no == 3) {
				// 결과 보기
				for (int i = 0; i < list.length; i++) {
					System.out.printf("%d은 %d번 나왔습니다.\n", (i + 1), list[i]);
				}
			} else if (no == 4) {
				// 가장 많이 나온 수

			} else if (no == 5) {
				// 종료
				run = true;
			} else {
				System.out.println("정확한 메뉴(1-5)를 입력하세요.");
			}

		}

	}
}
