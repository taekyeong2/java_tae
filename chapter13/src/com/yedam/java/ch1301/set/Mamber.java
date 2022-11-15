package com.yedam.java.ch1301.set;

import java.lang.reflect.Member;

public class Mamber {
	public String name;
	public int age;

	public Mamber(String name, int age) {
		this.age = age;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Mamber) {
			Mamber member = (Mamber) obj;
			return member.name.equals(name) && (member.age == age);
		}else {
			return false;
		}
	}

	@Override
	public int hashCode() { //객체가 고유로 가지고 있는 수
		//각 개체의 해시코드는 다름 -> 데이터가 같으면 그것을 같게하기 위해(똑같은 객체로 인식) 재정의
		//name = String 
		//age 를 더함으로 똑같은 객체인지 확인
		//Member member = new Member("yedam", 1);
		//Member member = new Member("yedam", 1);
		//Member member = new Member("yedam", 4);
		//"yedam" -> 2 / age -> 1
		//최종 hashcode = 2 + 1 = 3
		//"yedam" -> 2 / age -> 4
		//최종 hashcode = 2 + 4 = 6
		//데이터를 하나만 가져와서 해쉬코드 비교한게 아니라 데이터 2개를 합쳐서 동등 객체인지 아닌지 비교
		//어제는 하나의 데이터로만 비교
		return name.hashCode() + age; //name주소의 헤쉬코드값 + 나이 / 해쉬코드 반환값은 int
	}


}
