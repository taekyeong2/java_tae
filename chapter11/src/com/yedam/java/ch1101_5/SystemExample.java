package com.yedam.java.ch1101_5;

public class SystemExample {
	public static void main(String[] args) {
		/*
		//System.exit()
		for(int i = 0; i<10; i++) {
			System.out.println(i);
			if(i==5) {
				System.exit(0);
			}
		}
		System.out.println("프로그램 종료");
		*/
		
		//현재 시각 읽기
		
		long time1 = System.nanoTime(); //시작
		int sum=0;
		for(int i=1; i<=100000; i++) {
			sum += 1;
		}
		long time2 = System.nanoTime();
		System.out.println("sum: "+ sum); //한번더 쓰면 종료
		System.out.println("계산 시간: "+(time2 - time1)+ "나노초가 소요됨");
		
		 long time3 = System.currentTimeMillis(); // 중복되지 않는 데이터가 필요할때
		 System.out.println(time3);
	}
}
