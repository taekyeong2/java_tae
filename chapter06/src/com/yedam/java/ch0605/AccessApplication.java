package com.yedam.java.ch0605;

public class AccessApplication {
	public static void main(String[] args) {
		//힙영역에 저장 
		//여러곳에 같은 기능 쓸려고 계속 만들면 메모리 낭비
		//자주 쓰는 기능같은건 한번 만들어서 계속 쓰자.(싱글톤)
		Access access = new Access();
		
		//1) public
		access.free = "public";
		access.free();
		
		//2) private - 정보 은닉(외부 데이터. 접근 막아줌)
		//access.privacy = "privacy"; //선언한 곳 밖에서 사용 ㄴ
		//access.privacy();
		//3)protected -> 상속파트에서
		access.parent = "protected";
		
		//4)default -> 상속파트에서
		access.basic = "basic";
		
		
		//싱글톤 =============================================
		Singleton s1 = Singleton.getInstance();
		//           = new Singleton()
		// s1이라는 인스턴트에 단하나의 객체 대입
		Singleton s2 = Singleton.getInstance();
		
		s1.run();
		System.out.println(s1);
		System.out.println(s2); 
		// 같은 주소값. => 하나의 객체만 계속 불러옴.
		//
	
	}
}
