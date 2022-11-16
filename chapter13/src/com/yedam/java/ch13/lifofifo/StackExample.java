package com.yedam.java.ch13.lifofifo;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		//map,set등은 꺼내도 기존에 있던 곳에서 사라지지 않지만
		//이건 꺼내오는것임
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전: "+coin.getValue()+"원");
			//최근에 담은것부터 꺼내짐(탑쌓기라고 생각)
			//pop하면 코인박스에서 사라짐.
		}
		
	}
}
