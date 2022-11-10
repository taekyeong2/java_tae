package com.yedam.java;


import java.util.Scanner;

public class Product {
	Scanner sc= new Scanner(System.in);
	Product[] pList = null;
	
	//필드
	private String pName;
	private int sPrice;
	
	
	//메소드
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setSprice(int sPrice) {
		this.sPrice = sPrice;
	}
	public String getpName() {
		return pName;
	}
	public int getSprice() {
		return sPrice;
	}
	
	//상품수 
	public void setCount() {
		System.out.println("입력> ");
		int count = Integer.parseInt(sc.nextLine());
		pList = new Product[count];
	}
	
	//상품정보입력
	public void setInfo() {
		for(int i=0; i<pList.length; i++) {
			Product product = new Product();
			
			System.out.println("상품명 입력> ");
			String name = sc.nextLine();
			product.setpName(name);
			
			System.out.println("상품가격 입력> ");
			int price = Integer.parseInt(sc.nextLine());
			product.setSprice(price);
			
			pList[i] = product;
		}
		
	}
	
	//상품정보
	public void showInfo() {
		for(int i=0; i<pList.length; i++) {
		System.out.println("==상품 "+ (i+1)+ "==");
		System.out.println("상품명 : "+ pList[i].getpName());
		System.out.println("상품명 : "+ pList[i].getSprice());
		}
	}
	
	
	//분석
	public void analysis() {
		int max = pList[0].getSprice();
		//최고가격 제품
		for(int i=0; i<pList.length; i++) {
			if(max < pList[i].getSprice()) {
				max =  pList[i].getSprice();
				System.out.println("최고 가격 제품 : "+ pList[i].getpName());
			}
			
		}
		int sum = 0;
		for(int i=0; i<pList.length; i++) {
			if(pList[i].getSprice() == max) continue;
			sum += pList[i].getSprice();
		}
		System.out.println("최고가격 제외한 제품 가격 총합 : " + sum);
	}
	
	
	
}

