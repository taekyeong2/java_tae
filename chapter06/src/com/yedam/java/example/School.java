package com.yedam.java.example;

import java.util.Scanner;

public class School {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			
			Student[] std = null; //Student클래스생성자로 만들어지는 객체들이 들어갈수 있는 배열생성
			
			System.out.println("학생 수> ");
			int count = Integer.parseInt(sc.nextLine());
			std = new Student[count];
			
			for(int i=0; i<std.length; i++) {
				Student student = new Student();
				
				System.out.println("학생이름> ");
				String name = sc.nextLine();
				student.setsName(name);
				//System.out.println("학생이름> " + student.getsName(name));
				
				System.out.println("학번> ");
				String num = sc.nextLine();
				student.setsNo(num);
				
				System.out.println("국어성적> ");
				int korScore = Integer.parseInt(sc.nextLine());
				student.setKor(korScore);
				
				System.out.println("수학성적> ");
				int mathScore = Integer.parseInt(sc.nextLine());
				student.setMath(mathScore);
				
				System.out.println("영어성적> ");
				int engScore = Integer.parseInt(sc.nextLine());
				student.setEng(engScore);
				
				std[i] = student;
			}
			
			for(int i=0; i<std.length; i++) {
				std[i].getInfo();
			}
		}
}
