package com.yedam.java.ch0502_01;

public class ReferenceTypeExample {
	public static void main(String[] args) {
		//배열 선언 -> 모든 타입을 값으로 가질 수 있음
		// int[] intAry; - 보통 이렇게 씀 /or int intAry2[];
		int[] intAry = null;
		//System.out.println("intAry[0] : " + intAry[0]); -> 애초에 null이라서 객체가 없어 접근할수 있는게 없음.
		
		/*클래스 테스트 -> 자바안에서 객체에 값을 주는 법 (자바스크립트와 다름)
		User user = new User();
		user.name = "홍길동";
		user.age = 25;
		user.height = 175.7;  
		*/
		
		//값을 초기화 하면서 배열을 생성 ->자바안에서는 이게 객체라는 개념 아님
		int[] scores = {83, 90, 87};  // scores는 객체가 가지고 있는 주소값만 가지고 있음.
		                              // 인덱스 값은 scores의 주소값을 가지고 힙영역으로 가서 인덱스 값을 읽음.(스택을 통해서 접근)
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);  //scores를 요청하면 전체를 요청. 개개의 값은 인덱스로 요청해야함
		
		//배열 for문 사용 -> 인덱스의 0부터 1씩 증가하는 성격을 이용
		int sum = 0;
		for(int i=0; i<3; i++) { //i<=3은 ㄴㄴ -> 인덱스와 크기는 1만큼 차이가 나니까.
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = sum/3.0;
		System.out.println("평균 : " + avg);
		
		//주의사항
		int[] scoreList;
		//scoreList = {83, 90, 87};  -> 변수 선언 후에 값을 주는 것은 불가능
		scoreList = new int[] {83, 90, 87}; // -> new 연산자 사용해야한다. (이때 값을 정확하게 줄거면 크기 주면 ㄴ)
	}
}
