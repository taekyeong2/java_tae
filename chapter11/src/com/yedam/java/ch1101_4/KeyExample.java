package com.yedam.java.ch1101_4;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//HashMap => Key, Value 데이터를 저장
		HashMap<Key,String> hashmap = new HashMap<>();
		//   열쇠=== =======데이터
		//new Key(1) -> 1
		hashmap.put(new Key(1), "홍길동"); // 이 열쇠로 데이터를 보관
		
		//new Key(1) -> 2 (앞의 new Key(1)과 다름(새로운 주소 객체))
	    String value = hashmap.get(new Key(1)); // 열쇠로 다시 데이터 꺼내는것
	    System.out.println(value);
	    
	    Key key = new Key(1);
	    System.out.println(key.toString());
	}
}
