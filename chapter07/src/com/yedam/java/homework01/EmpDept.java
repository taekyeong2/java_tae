package com.yedam.java.homework01;

public class EmpDept extends Employee {

	private String department;
	
	public EmpDept(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public void getInformation() {
		System.out.print("이름:"+getName()+" ");
		System.out.print("연봉:"+getSalary()+" ");
		System.out.print("부서:"+getDepartment()+"\n");
	}

	@Override
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}
	
}
