package com.yedam.java.Homework1;

public class RPGgame implements Keypad {

	private String mode = "NORMAL_MODE";
	
	public RPGgame() {
		System.out.println("RPGgmae 실행");
	}
	
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다.");
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다.");
	}

	@Override
	public void rightUpButton() {
		if(this.mode.equals("NORMAL_MODE")) {
			System.out.println("캐릭터가 한칸단위로 점프한다.");
		}else if(this.mode.equals("HARD_MODE")) {
			System.out.println("캐릭터가 두칸단위로 점프한다.");
		}
	}

	@Override
	public void rightDownButton() {
		if(this.mode.equals("NORMAL_MODE")) {
			System.out.println("캐릭터가 일반 공격.");
		}else if(this.mode.equals("HARD_MODE")) {
			System.out.println("캐릭터가 Hit 공격.");
		}
	}

	@Override
	public void changeMode() {
		if(this.mode.equals("NORMAL_MODE")) {
			this.mode = "HARD_MODE";
		}else if(this.mode.equals("HARD_MODE")) {
			this.mode = "NORMAL_MODE";
		}
		System.out.println("현재 모드 : "+ this.mode);
	}

}
