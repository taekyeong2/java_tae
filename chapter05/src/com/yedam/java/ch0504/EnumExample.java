package com.yedam.java.ch0504;

import java.util.Calendar;

public class EnumExample {
	public static void main(String[] args) {
		Week today = null; //기존의 타입처럼 사용가능
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) { //week의 값을 이해할수 있게 바꾸는것.
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNEDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRYDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		
		}
		
//		if(week ==7) {    //week가 가진 값 7이 무슨 의미인지 정확히 알수 없음.
//			System.out.println("오늘은 스터디를 갑니다.");
//		}
		System.out.println("오늘 요일: "+today);
		if(today ==Week.SUNDAY) {   
			System.out.println("오늘은 스터디를 갑니다.");
		}else {
			System.out.println("오늘은...");
		}
		
		
		
		
		
	}
}
