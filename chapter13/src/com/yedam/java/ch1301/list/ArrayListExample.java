package com.yedam.java.ch1301.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		//List<E> list2 = new ArrayList<>(); 
		//E(element) -> 어떤 객체든 다 허용해준다는 뜻
		//              상황에 따라 바뀌는 매개변수 느낌
		
		//객체 저장
		//배열 list[0] = "java"; / 10개 사이즈 5개만 사용 -> 손해
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "DateBase");  // 인덱스가 2인 곳에 넣기 -> 그 뒤 한칸씩 밀림
		list.add("iBATIS");
		
		//배열 list.length();
		int size = list.size();
		System.out.println("총 객체수: "+ size);
		System.out.println();
		
		//2번 인덱스 가져옴
		//배열 skill = list[2]
		String skill = list.get(2);
		System.out.println("2: "+skill+"\n");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+ ":"+ str);
		}
		System.out.println();
		
		list.remove(2);
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+ ":"+ str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+ ":"+ str);
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
	}
}
