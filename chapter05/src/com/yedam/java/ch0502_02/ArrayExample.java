package com.yedam.java.ch0502_02;

public class ArrayExample {
	public static void main(String[] args) {

		int[][] mathScores = new int[2][3]; // 2개의 int[3]배열이 있다.

		// 첫번째 : 변수사용
		for (int i = 0; i < mathScores.length; i++) {
			System.out.println("mathScores[" + i + "]"); // mathScores의 각각의 인덱스가 가지고 있는 값이 1차원 배열
			int[] mathScore = mathScores[i];
			for (int j = 0; j < mathScore.length; j++) { // 그 1차원 배열의 인덱스값.
				System.out.println("\t mathScore[" + j + "] : " + mathScore[j]);
			}

		}
		System.out.println("-------------------------------------------");
		// 두번째 : 변수사용x
		for (int i = 0; i < mathScores.length; i++) {
			System.out.println("mathScores[" + i + "]");
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.println("\t mathScores[" + i + "][" + j + "] : " + mathScores[i][j]);
			}

		}

		
		int[][] scoreList = { { 86, 65 }, { 58, 95, 73 } };
		for (int i = 0; i < scoreList.length; i++) {
			System.out.println(i + "번째 학생 성적 ====");
			for (int j = 0; j < scoreList[i].length; j++) {
				System.out.println(scoreList[i][j] + " ");
			}
			System.out.println();
		}
		
		
		int[][] englishScore = new int[2][];
		//                            === -> 필수값.
		englishScore[0] = new int[3];
		englishScore[1] = new int[2];
		for (int i=0; i<englishScore.length; i++) {
			for (int j=0; j <englishScore[i].length; j++) {
				System.out.println("englishScore["+i+"]["+j+"] : "+englishScore[i][j]);
			}
		}
		
		// 참조타입 배열
		// 객체는 (스택영역에 있는)변수가 값을 가지고 있지 않음 -> 힙 영역으로 가서 번지값을 가지고 온다.
		//(기본타입은 변수가 값을 가지고 있음)
		String[] strArray = new String[3];
		strArray[0] = "java"; // java라는 값을 들고있는 객체가 생성. -> 이 번지값을 가진다
		strArray[1] = "java"; // 기존 java 주소값(번지값)을 가진다.
		strArray[2] = new String("java"); //new연산자를 줬기때문에 새로운 java값의 객체형성. -> 이 주소값을 가진다. 
		
		System.out.println(strArray[0]==strArray[1]); //배열이 가지고 있는 값은 101 == 101
		System.out.println(strArray[1]==strArray[2]); //배열이 가지고 있는 값은 101 != 501                                           
		//등호는 해당 위치의 값을 가지고 온다. (주소든 값이든 신경 ㄴㄴ) -> 객체 비교때는 등호 연산자 비교 하면 ㄴㄴ
		System.out.println(strArray[1].equals(strArray[2])); 
		System.out.println();
		
		
		//배열복사
		//for문으로 배열 복사  -> 순차적으로 첫번째 부터 넣을땐 좋음(중간에 집어넣을땐 힘들다)
		int[] oldIntAry = {1,2,3};
		int[] newIntAry = new int[5];
		for(int i=0; i<3 ; i++) {
			newIntAry[i] = oldIntAry[i];   //oldIntAry 가 5를 처리 못함. -> 3,4를 가지고 있지 않다.
			                               //배열복사할때는 적은쪽을 사용
		}
		for(int i=0; i<newIntAry.length; i++) {
			System.out.println(newIntAry[i]);  //남아있는 공간은 디폴트값.
		}
		
		//매서드 사용(system.arraycopy())
		String[] oldStrAry = {"java","array","copy"};
		String[] newStrAry = new String[5];
		
		System.arraycopy(oldStrAry, 0, newStrAry, 2, oldStrAry.length);
		for(int i=0; i<newStrAry.length; i++) {
			System.out.println(newStrAry[i]);
		}

		//향상된 for문 -> 단순순환, 인덱스가 필요없는 경우(모든값을 사용할때)에 사용
		int[] scores = {95, 71, 84, 93, 87};
		int sum = 0;
		for( int score : scores ) { //해당 배열 담을 임시변수 : 해당 배열
			System.out.println(score); //해당배열값 전부 들고와서 임시변수에 담는다.
			sum += score;
		}
		System.out.println("점수 총합: "+sum);
		double avg = (double)sum / scores.length;
		System.out.println("점수 평균: "+avg);
		
		
		
		
		

	}
}
