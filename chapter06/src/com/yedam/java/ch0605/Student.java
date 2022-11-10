package com.yedam.java.ch0605;

public class Student {
	//필드
	private String studentName;
	private String schoolName;
	private int studentNum;
	private int grade;
	private int kor;
	
	//개터새터
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	private int eng;
	private int mat;
	
	//생성자
	public Student(String studentName,String schoolName, int studentNum, 
			int grade, int kor, int eng, int mat) {
		this.studentName = studentName;
		getInfo();
	}
	
	//메소드
	void getInfo() {
		System.out.println("학생이름 : " + studentName);
	}
}
