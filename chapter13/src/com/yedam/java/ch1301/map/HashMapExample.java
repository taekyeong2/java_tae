package com.yedam.java.ch1301.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 95); // - 같은 키는 가질 수 없다.
		map.put("홍길동", 95);
		map.put("동장군", 80);

		System.out.println("총 entry수: " + map.size());

		int score = map.get("홍길동");
		System.out.println("\t홍길동" + score);
		System.out.println();

		// 모든 key값 가져오기
		// -> Set사용(객체중복저장안됨->중복되지 않는 데이터 저장법)
		Set<String> keySet = map.keySet(); // map에 있는 key set에 담아줌(중복x)
		Iterator<String> keyInterator = keySet.iterator(); // 반복자 사용
		while (keyInterator.hasNext()) { // 키안에 데이터 없을때까지 반복문 실행
			String key = keyInterator.next(); // map에 있는 키 가지고옴
			Integer value = map.get(key); // 그 key의 데이터들 가지고옴
			System.out.println("\t" + key + ":" + value); // map은 데이터 넣을때 순서 상관X 암거나 가져옴
		}

		// 객체 삭제
		map.remove("홍길동");
		System.out.println(map.size());

		// 모든 k,v(map.entry) 가져와서 하나씩 처리
		// entrySet 의 데이터타입은 Map.Entry<String, Integer> 형태
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		// 반복자
		Iterator<Map.Entry<String, Integer>> entryInterator = entrySet.iterator();
		while (entryInterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryInterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + ":" + value);
		}
		System.out.println();
		// 향상된 for문
		for (Map.Entry<String, Integer> temp : map.entrySet()) {
			String key = temp.getKey();
			Integer value = temp.getValue();
			System.out.println("\t" + key + ":" + value);
		}
		System.out.println();

		map.clear();
		System.out.println("총 entry 수: 	" + map.size());

	}
}
