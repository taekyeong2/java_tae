package com.yedam.java.ch1101_5;

import com.yedam.java.ch1101_2.Key;

public class ClassExample {
	public static void main(String[] args) throws ClassNotFoundException {
		//클래스의 정보를가져올때
		
		//Key클래스 객체 가져오기
		//1탄
		Class clazz = Key.class;
		System.out.println(clazz);
		
		//2탄 - 경로를 통한 클래스 객체 가져오기
		Class clazz2 = Class.forName("com.yedam.java.ch1101_2.Key"); 
		System.out.println(clazz2);
		
		//3탄 - 객체로부터 클래스 객체 열기
		Key key = new Key(1);
		Class clazz3 = key.getClass();
		System.out.println(clazz3);
		
		String photoPath = clazz.getResource("강아지3.jpg").getPath(); //Key의 기준으로 같은 폴더 안에 파일이 있는지 찾아서 알려주는것
		System.out.println(photoPath);
	}
}
