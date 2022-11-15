package com.yedam.java.ch1301.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map =  new HashMap<Student, Integer>();
		
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		
		
		System.out.println("총 entry 수: "+ map.size());
		//이퀄즈와 해시코드를 재정의 하지 않았으면 new연산자로 인해 다른 객체로 인식 -> 2개로 데이터로 인식
		
		
		
	}
}
