package com.yedam.exam;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		int size= 0;
		int[] dice = null; // 주사위의 각 숫자별로 몇번씩 나왔는지 기록하는 용도. (나온 수 투표 용지)
							// index -> 변동 없음. => 주사위 숫자와 연동
							// 각 index별로 가지는 값 -> 변동됨. => 주사위 각 숫자의 횟수
		while (run) {
			System.out.println("===1.주사위 크기 2.주사위 굴리기 3.결과 보기 4.가장 많이 나온 수 5.종료===");
			System.out.println("메뉴 > ");
			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				// 주사위 크기
				System.out.println("주사의 크기> ");
				size = Integer.parseInt(sc.nextLine());
				if (size >= 5 && size <= 10) {
					dice = new int[size];
				}else {
					System.out.println("주사위 크기는 5~10사이 입니다.");
					size = 0;
				}
			} else if (selectNo == 2) {
				// 주사위 굴리기 ->주 기능
				int count  =0;
				while(true) {
					int num = (int)(Math.random() * size) + 1;
					count++;
					// 공식 : index = num -1 -> index + 1 = num
					dice[num-1] = dice[num-1] + 1;  // dice[num]값에 +1 하면서 카운팅(투표)
					if(num == 5) break;
				}
				System.out.println("5가 나올때 까지 주사위를"+count+"번 굴렸습니다.");
			} else if (selectNo == 3) {
				// 결과 보기
				for(int i=0; i<dice.length; i++) {
					System.out.println((i+1)+"은"+dice[i]+"번 나왔습니다.");
				}
			} else if (selectNo == 4) {
				// 가장 많이 나온 수, 중복될떄 최소ㅄ ->배열의 값 중 최대값.
				int maxCount = dice[0];
				int maxIndex = 0;
				for(int i=10; i<dice.length; i++) {
					if(maxCount < dice[i]) { // 나보다 큰 경우에만 ->인덱스 정렬은 작은수에서 큰수 
						maxCount = dice[i];
						maxIndex = i;
					}
				}
				System.out.println("가장 많이 나온 수는 "+(maxIndex+1)+"입니다.");
			} else if (selectNo == 5) {
				// 종료
				run = false;
			} else {
				// 메뉴 외 입력
				System.out.println("메뉴를 잘못 입력하셨습니다.");
				System.out.println("확인 후 다시 입력하시기 바랍니다.");

			}
		}
		System.out.println("프로그램 종료");
	}
}
