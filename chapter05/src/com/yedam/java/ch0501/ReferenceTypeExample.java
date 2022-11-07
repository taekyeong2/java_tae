package com.yedam.java.ch0501;

public class ReferenceTypeExample {
	public static void main(String[] args) {
		//null과 NullpointerException 
		//String str = null; //비어있는 값인데 공간이 배정된 것.
		//System.out.println("길이 : "+ str.length()); // 동작시키기 전까지는 오류 알 수 없다. 
		
		//String(문자열) 비교 -> String은 서로다른 객체라도 동일한 값을 가지고 있다면 동일한 것으로 봄.
		// 이전까지 사용한 int, double과 같은 것은 기본타입이라서 해당 노노 -> 기본타입 그자체가 값이라 생각??
		String strvar1 = "신미철";
		String strvar2 = "신미철";  // 2개의 변수지만 실제로는 하나의 객체를 가지고 공유하고 있음(같은 번지값)
		if(strvar1 == strvar2) {
			System.out.println("strvar1과 strvar2는 참조가 같음");
		}else {
			System.out.println("strvar1과 strvar2는 참조가 다름");
		}
		
		if(strvar1.equals(strvar2)) { 
			System.out.println("strvar1과 strvar2는 문자열이 같음");
		}
		
		//=========================================================================
	
		String strvar3 = new String("신미철");
		String strvar4 = new String("신미철");  // 다른 객체를 가진 변수 비교 (다른 번지값)
		                                      //  -> new를 이용해 매번 새로운 객체 만든다.
		if(strvar3 == strvar4) {  // 각 변수가 실제로 가지고 있는 값(번지 값) 비교
			System.out.println("strvar1과 strvar2는 참조가 같음");
		}else {
			System.out.println("strvar1과 strvar2는 참조가 다름");
		}
		
		if(strvar3.equals(strvar4)) { // 같은 객체인지 아닌지 상관없이 내부 문자열(실제로 들고 있는 값) 비교
			if(strvar1 == strvar2) {
				System.out.println("strvar3과 strvar4는 문자열이 같음");
			}
		}
	}
}
