package com.yedam.java.ch06;

public class Student {
	//필드
	//학생이름
	String studentName;
	//학교이름
	String schoolName;
	//학번
	int studentNum;
	//학년
	int grade;
	//국어, 영어, 수학 성적
	int kor;
	int eng;
	int mat;
	
	//생성자
	//생성자를 통해서 모든 데이터를 입력
	public Student(String studentName,String schoolName, int studentNum, 
			int grade, int kor, int eng, int mat) {
		this.studentName = studentName;
		getInfo();
	}
	
	//메소드
	//getInfo() 학생의 내용을 출력할 수 있는 기능
	void getInfo() {
		System.out.println("학생이름 : " + studentName);
	}
}
