package com.yedam.java.ch1301.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		System.out.println("ArrayList: "+ (endTime - startTime) + "ns");
		//밀고넣고 밀고 넣고 -> 움직이는 것들이 많음
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		System.out.println("LinkedList: "+ (endTime - startTime) + "ns");
		//끊었다가 연결 끊었다가 연결
		//가운데 데이터를 넣거나 빼는것은 LinkedList가 빠르다
		
	}
}
