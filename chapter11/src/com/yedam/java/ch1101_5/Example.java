package com.yedam.java.ch1101_5;

public class Example {
	public static void main(String[] args) {
		//1) 문자열 뒤집기 / charAt + 반복문
		String str = "abc";
		char ch;
		for(int i=str.length()-1; i>=0; i--) {
			ch = str.charAt(i);
			System.out.print(ch);
		}
		System.out.println();
	
		
		
		//2) 문자열 개수 세기
		byte[] bytes = null;
		String str2 = "1a2v4b";
		bytes = str2.getBytes();
		int num = 0;
		int eng = 0;
		
		for(int i=0; i<bytes.length; i++) {
			if(bytes[i]>=48 && bytes[i]<=57) {
				num++;
			}
            if(bytes[i]>=97 && bytes[i]<=122) {
				eng++;
			}
		}
		System.out.println("숫자 "+num+"개, 영어"+eng+"개");
		
		
		//3) 생년월일
		String date = "000510";
		String birth = date.substring(0,2);
		int age = Integer.parseInt(birth);
		int manAge;
		if(age >= 0 && age <= 22) {
			manAge = (22 - age)-1;
		}else{
			manAge = (2022-(1900+age))-1;
		}
		System.out.println(manAge + "살");
		
	}
}
