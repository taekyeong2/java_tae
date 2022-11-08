package com.yedam.java.example;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		boolean run = true;  // 해당 반복문 제어하는 변수 별도로 선언. -> while 안에 스위치 타입 쓸거면 필수
		Scanner scanner = new Scanner(System.in);
		
		int studentNum = 0;
		int[] scores = null; // 크기 안정해져 있다. -> 학생수 입력 받아야 크기 할당.
		                     		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.println("선택> ");
			int selectNo = Integer.parseInt(scanner.nextLine()); //메뉴입력은 보통 숫자이용 // 앞으로는 스캐너에 넥스트라인만 쓴다 생각
			// int[] scores = null; /내부에 선언하면 안됨 -> while문 끝에 도달하면 사라진다. 그리고 새롭게 재실행. ->초기화 됨.
			//반복문 안에서 변수 선언 -> 한번쓰고 끝. 새롭게 다시 형성되는 변수. / while문 반복돼도 값을 가지고 있어야 한다면 밖에 선언.
			
			switch(selectNo) {
			case 1:
				System.out.println("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
				break;	//switch문만 빠져나감. 반복문이 종료되지 않음. 
			case 2:
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]> ");
					int score = Integer.parseInt(scanner.nextLine());
					scores[i] = score;
				}
				break;	
			case 3:
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d] : %d\n", i, scores[i]);
				}
				break;	
			case 4:
				int max = scores[0];
				int sum = 0;
				for(int i=0; i<scores.length; i++) {
					//최고점수 구할때
					if(max < scores[i]) {
						max = scores[i];
					}
					//총합
					sum += scores[i];
				}
				System.out.println("최고점수 : "+ max);
				System.out.println("평균 : "+ ((double)sum / scores.length));
				break;	
			case 5:
				run= false;
				break;	
			default:
				System.out.println("정해진 메뉴를 입력하지 않았습니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
		System.out.println("프로그램 종료");
		
	}
}
