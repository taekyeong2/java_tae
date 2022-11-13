package com.yedam.java.homework01;

public class Application {
	public static void main(String[] args) {
		EmpDept empdept = new EmpDept("이지나", 3000, "교육부");
		
		empdept.getInformation();
		empdept.print();
		
	}
}
