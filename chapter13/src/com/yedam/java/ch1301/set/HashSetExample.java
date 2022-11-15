package com.yedam.java.ch1301.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JPS");
		set.add("java"); //단하나의 객체만 들어갈 수 있음
		set.add("iBATIS");

		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		
		System.out.println("반복자를 활용");
		Iterator<String> iterator = set.iterator(); //set에 담긴 데이터를 interator에 넣어줌
		while(iterator.hasNext()) { //안의 객체가 비어있을때까지 반복.
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		
		System.out.println("향상된 For문 활용");
		set.remove("JDBC");
		set.remove("iBATIS");
		for(String element : set) {
			System.out.println("\t"+element);
		}
		
		set.clear();
		if(set.isEmpty()) {	
			System.out.println("비어있음");
		}
		

	}
}
