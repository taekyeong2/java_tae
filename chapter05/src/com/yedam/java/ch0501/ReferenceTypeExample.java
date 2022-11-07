package com.yedam.java.ch0501;

public class ReferenceTypeExample {
	public static void main(String[] args) {
		//null과 NullpointerException 
		//String str = null; //비어있는 값인데 공간이 배정된 것.
		//System.out.println("길이 : "+ str.length()); // 동작시키기 전까지는 오류 알 수 없다. 
		
		//String(문자열) 비교
		String strvar1 = "신미철";
		String strvar2 = "신미철";  // 2개의 변수지만 실제로는 하나의 객체를 가지고 ㅓ공유하고 있음
		
		if(strvar1 == strvar2) {
			System.out.println("strvar1과 strvar2는 참조가 같음");
		}else {
			System.out.println("strvar1과 strvar2는 참조가 다름");
		}
		
		if(strvar1.equals(strvar2)) {
			System.out.println("strvar1과 strvar2는 문자열이 같음");
		}
	}
}
