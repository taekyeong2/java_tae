package com.yedam.java.homework3;

import java.util.Scanner;

import com.yedam.java.homework1.ArcadeGame;
import com.yedam.java.homework1.Keypad;
import com.yedam.java.homework1.RPGgame;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		Keypad game = null;
		int num;

		//랜덤게임 실행
		int gameNum = (int) (Math.random() * 2) + 1;
		if (gameNum == 1) {
			game = new RPGgame();
		} else if (gameNum == 2) {
			game = new ArcadeGame();
		}

		while (run) {
			//메뉴선택
			System.out.println(
					"<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
			System.out.println("choice>>");
			num = Integer.parseInt(sc.nextLine());
			
			//게임실행
			switch (num) {
			case 1:
				game.leftUpButton();
				break;
			case 2:
				game.leftDownButton();
				break;
			case 3:
				game.rightUpButton();
				break;
			case 4:
				game.rightDownButton();
				break;
			case 5:
				game.changeMode();
				break;
			case 0:
				if (game instanceof RPGgame) {
					game = new ArcadeGame();
				} else if (game instanceof ArcadeGame) {
					game = new RPGgame();
				}
				break;
			case 9:
				run = false;
				break;
			default:
				System.out.println("올바른 메뉴를 입력하세요.");
			}

		}
		System.out.println("EXIT");
	}
}
