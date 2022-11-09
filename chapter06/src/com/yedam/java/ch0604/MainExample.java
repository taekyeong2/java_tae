package com.yedam.java.ch0604;

public class MainExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn(); //매개변수 ㄴㄴ./ 리턴되는것 ㄴㄴ -> 변수 선언할 필요 없음. /실행만 함녀 된다.(사용자들이 알게하기위해)
		
//		myCalc.plus(5, 6); //리턴타입이 있는경우 -> 꼭 변수담는것이 필수는 아니다.(내부에서 처리만 하는경우 -> 그냥 호출만) 
		int sumRes = myCalc.plus(5, 6); //리턴값에 맞춰 / 리턴 하는 타입 int 일때->  double로 가능(자동타입변환)
		System.out.println("sum :"+sumRes);
		
		byte x = 10;
		byte y = 4;
		double diviRes = myCalc.divide(x, y);   // 자동타입변환
		System.out.println("divide : "+ diviRes);
		
		//=================================================================
		
		//sum1 -> 배열 타입 맞춰서 넘겨줘야함
		Computer myCom = new Computer();
		int[] values1 = {1,2,3};
		int intResult1 = myCom.sum1(values1);
		System.out.println("intResult1: "+intResult1);
		
		int intResult2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("intResult2: "+intResult2);
		
		
		//sum2 -> 값만 넘겨줌 //동일한 타입으로 다양한 값을 넘겨줄때 유용.
		int intResult3 = myCom.sum2(1,2,3);
		System.out.println("intResult3: "+ intResult3);
		
		int intResult4 = myCom.sum2(1,2,3,4,5);
	    System.out.println("intResult4: "+ intResult4);
	    
	    
	    //내부 메소드 호출
	    myCalc.execute();
	    
	    // 오버로딩
	    double result1 = myCalc.areaRectangle(10);
	    double result2 = myCalc.areaRectangle(10, 20);
	    System.out.println("정사각형 넓이 : "+result1);
	    System.out.println("직사각형 넓이 : "+result2);
	    
		
	}
}
