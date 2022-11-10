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
	
		Member mem = new Member();
		//1) mem의 인스턴스 필드에 접근 가능한지 확인
		//2) setter, getter로 데이터 입력 및 출력
		mem.setId("yedam");
		mem.setTel("010-123-1234");
		mem.setAge(10);
		
		System.out.println("id : " + mem.getId());
		System.out.println("tel : " + mem.getTel());
		System.out.println("age : " + mem.getAge());
		
		
		
		
	}
}
