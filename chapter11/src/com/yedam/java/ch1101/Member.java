package com.yedam.java.ch1101;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		//               ============ Object obj = new Member("blue") 
		//                              : Object에 있는 내용만 사용 가능
		Member member = (Member) obj;
		//              ============= -> Member member = new Member("blue")
		if(id.equals(member.id)) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() { //hashCode()-> 객체를 식별하는 하나의 정수값
		//String a ="1"; 
		//String b ="1";
		//-> String은 같은 데이터면 같은 주소값을 참조한다.
		return id.hashCode(); //"1"
	}
	
	
	
}
