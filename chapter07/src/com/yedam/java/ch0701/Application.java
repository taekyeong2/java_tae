package com.yedam.java.ch0701;


public class Application {
	public static void main(String[] args) {
		Child child = new Child();
		
		//자식 클래스 고유 필드
		child.lastName = "paul";
		child.age = 20;
		
		//부모 클래스 고유 필드
		System.out.println(child.firstName + child.lastName);
		
		//부모 -> 여러명의 자식
		//자식 -> 여러명의 부모 x / 
		//      하나의 부모 : 모호성 때문에. 같은 필드 뭘 적용할지 모르니까 하나만 상속
		
		//private로 설정한 부모필드는 상속 노노
		//System.out.println(child.job);
		
	
		System.out.println("====================================================");

		
		DmbCellPhone dmb = new DmbCellPhone("고아라폰","화이트",10);
		
		//부모 필드 사용
		System.out.println("모델 : "+dmb.model); 
		System.out.println("색상 : "+dmb.color); 
		//자식 필드 사용
		System.out.println("채널: "+ dmb.channel);
		
		//부모클래스 메소드 사용
		dmb.powerOn();
		dmb.sendVoice("안녕");
		dmb.receiveVoice("안녕하세요 전 김또치입니다.");
		dmb.powerOff();
		
		//자식 클래스 메소드 사용
		dmb.turnOnDmb();
		
		
		System.out.println("====================================================");
		
		
		Member member = new Member("고길동","123123-456456",1);
		
		//부모 객체의 필드 사용
		System.out.println("name: "+member.name);
		System.out.println("ssn: "+member.ssn);
		
		
		System.out.println("memberNo: "+member.ssn);
		
		
		System.out.println("====================================================");
		
		Child cd = new Child();
		cd.method1();
		cd.method2();
		cd.method3();
		
		Compute com = new Compute();
		com.areaCircle(10);
		
		SupersonicAirPlane sa = new SupersonicAirPlane();
		sa.takeOff();
		sa.fly();
		
		sa.flyMode = SupersonicAirPlane.SUPERSONIC;
		sa.fly();
		
		sa.flyMode = SupersonicAirPlane.NORMAL;
		sa.fly();
		
		sa.land();

		
		
		System.out.println("====================================================");
		
		
		Child chd = new Child();
		//Parent parent = new Child();
		//만약 자식 클래스에 오버라이딩이 되어있는 메소드가 존재한다면
		//부모클래스에 정의된 메소드를 사용하지 않고 자식 클래스에 있는 메소드
		Parent parent = chd;
		parent.method1();
		parent.method2(); //->오버라이딩된 자식꺼 씀
		//parent.method3(); -> 부모꺼 아니여서 못씀
		
		
		
		
		
		
		
	}
	
	
}
