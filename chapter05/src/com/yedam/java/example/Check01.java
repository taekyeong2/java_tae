package com.yedam.java.example;

public class Check01 {

	public static void main(String[] args) {
		// 문제1 ) 주어진 배열의 총합과 평균을 구하세요.
		int[] array = {10,53,26,85,75};
		int sum = 0;
		for(int i=0; i<array.length; i++) {  // i는 크기가 아니라 인덱스.
			sum += array[i];
		}
		System.out.println("배열의 총합 : "+ sum);
		double avg = sum/(double)array.length;
		System.out.printf("배열의 평균 : %.2f\n", avg); // 보통 double사용시 소수점 2자리 정도.
		
		
		//문제2 ) 배열의 최대값과 최소값을 구하시오
		int max = array[array.length-1];  // 어쨌튼 모든 인덱스값 다 확인할거니까 
		int min = array[0];
		for(int i =0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
			if(min > array[i]) {
				min = array[i];
			}
		}
		System.out.printf("최대값 : %d, 최소값 : %d \n", max, min);
		
		//문제3 ) 문제2번에서 구한 최대값과 최소값이 각각 몇번째 값인지 뭔지 구하세요
		int maxIndex = 0;
		int minIndex = 0;
		
		for(int i =0; i<array.length; i++) {
			if(max == array[i]) {
				maxIndex = i;
			}
			if(min == array[i]) {
				minIndex = i;
			}
		}
		System.out.println("최대값 "+max+"는 "+(maxIndex+1)+"번째입니다.");
		System.out.println("최소값 "+min+"는 "+(minIndex+1)+"번째입니다.");
		
		
		
	}

}
