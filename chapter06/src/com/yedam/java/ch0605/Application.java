package com.yedam.java.ch0605;

public class Application {
	
	//필드 
	int staticTest = 0;
	//                 ==== -> static 메소드
	public static void main(String[] args) {
		Application ap = new Application(); // 내 자신을 인스턴스화
		ap.staticTest =2; //main static영역안에서 일반필드 사용가능
		
		Shose shose = new Shose();
		
		shose.makeRunning();
		shose.makeSlipper();
		shose.makeMule();
		shose.getCount();
		
		System.out.println(Shose.totalCount);
		
		//=====================================
		System.out.println();
		
		//인스턴스화 시키면 static에 일반필드, 메소드 사용 가능
		ConstanNo csno = new ConstanNo();
		System.out.println(csno.word);
		System.out.println(csno.words);
		csno.words(csno.words, csno.word);
		
		//인스턴스 안만들고 바로 사용가능
		System.out.println(ConstanNo.EARTH_ROUND);
		
		
		//==========================================
		//은행 고객 정보를 관리하는 클래스
		//1) main  2)Customer 3)Bank
		//1) main -> 생성자를 통한 고객의 정보를 저장, 출력
		//2) Bank -> 해당은행의 금리를 저장
		//금리 = 현재잔액 +( 현재잔액*금리)
		//3) Customer -> 고객의 정보를 저장
		//이름, 은행명, 계좌, 잔액의 필드 
		//getInfo() : 입력한 정보 출력
		// withDraw() :출근할때 정보를 출력
	}
}
