package com.yedam.java.homework03;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		String confirm;

		Movie movie = new Movie("추격자", 7, 5, "스릴러");
		Performance performance = new Performance("지킬앤하이드", 9, 10, "뮤지컬");
		while (run) {
			System.out.println("영화 점수를 입력하세요> ");
			int count1 = Integer.parseInt(sc.nextLine());
			movie.setTotalScore(count1);
			int count2 = Integer.parseInt(sc.nextLine());
			performance.setTotalScore(count2);

			System.out.println("계속 입력하시겠습니까? y/n");
			confirm = sc.nextLine();
			if (confirm.equals("y") || confirm.equals("Y")) {
				run = true;
			}else {
				run = false;
			}
		}

		movie.getInformation();  // 이상
		performance.getInformation();
	}
}
