package com.yedam.java.homework03;

import java.util.Scanner;

public abstract class Culture {
	Scanner sc = new Scanner(System.in);

	public String movieName;
	public int derecterNum;
	public int actorNum;
	public int audienceNum = 0;
	public int score = 0;
	
	public Culture(String movieName, int derecterNum, int actorNum) {
		this.movieName = movieName;
		this.derecterNum = derecterNum;
		this.actorNum = actorNum; 
	}
	
	//점수 관객수 누적
	public void setTotalScore(int score) {
		this.score += score; 
		audienceNum ++;
	}
	
	//점수 입력
	public void inputScore() {
		int count = Integer.parseInt(sc.nextLine());
		setTotalScore(count);
	}
	 //총점(평균)
	public int getAvg() {
		int avg = score/audienceNum;
		return avg;
	}
	
	//평점(별)
	public String getGrade() {
		int avg = score/audienceNum;
		String avgScore = null;
		if(avg >= 80) {
			avgScore = "☆☆☆☆☆";
		}else if(avg >= 70) {
			avgScore = "☆☆☆☆";
		}else if(avg >= 60) {
			avgScore = "☆☆☆";
		}else if(avg >=50) {
			avgScore = "☆☆";
		}else {
			avgScore = "☆";
		}
		return avgScore;
	}
	
	public abstract void getInformation();
	
}
