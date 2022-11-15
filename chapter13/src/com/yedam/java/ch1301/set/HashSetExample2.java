package com.yedam.java.ch1301.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Mamber> set = new HashSet<>(); //동등객체를 비교 해준다음(해쉬코드 -> 이퀄즈) 넣어주는것.
		
		//각 객체를 만들었지만 해쉬코드가 같기 때문 같은 객체로 인식
		//해쉬코드를 통해 앞의 new연산자의 번지수를 통해 객체를 인식하는것이 아니라
		//안의 데이터 내용으로 객체를 인식하도록 함
		set.add(new Mamber("홍길동", 30)); //100번지
		set.add(new Mamber("홍길동", 30)); //200번지
		
		System.out.println("총 객체 수 : "+ set.size());
	}
}
