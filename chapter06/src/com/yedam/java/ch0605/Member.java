package com.yedam.java.ch0605;

public class Member {
	//왼쪽 클릭 -> 소스 -> 개터앤새터 
	public String getTel() { //개터
		return tel;
	}

	public void setTel(String tel) {  //새터
		this.tel = tel;
	}

	// 필드
	private String id;
	private String tel;
	private int age;

	// 생성자

	// 필드

	// private String id;
	public String getId() {
		// 원본 데이터 (yedam)
		// 가공을 통해 꾸미고 싶다 (yedam 입니다.)
		id += "입니다.";
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age <= 0) {
			System.out.println("0보다 작은 나이가 저장되었습니다. 다시 확인하세요");
			return; //데이터 무결성이 깨져서 저장안시킴
		} else {
 			this.age = age; //데이터 저장
		}
	}
}
