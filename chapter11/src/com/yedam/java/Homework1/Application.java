package com.yedam.java.Homework1;

public class Application {
	public static void main(String[] args) {
		Keypad key = new RPGgame();
		
		key.leftUpButton();
		key.rightUpButton();
		key.changeMode();
		key.rightUpButton();
		key.rightDownButton();
		key.leftDownButton();
		key.changeMode();
		key.rightDownButton();
		
		System.out.println("=================");
		
		key = new ArcadeGame();
		
		key.leftUpButton();
		key.rightUpButton();
		key.leftDownButton();
		key.changeMode();
		key.rightUpButton();
		key.leftUpButton();
		key.rightDownButton();
		
	}
}
