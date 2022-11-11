package com.yedam.java.homework03;

public abstract class Culture {
	

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
	
	public void setTotalScore(int score) {
		this.score += score; 
		audienceNum ++;
	}
	
	public String getGrade() {
		int avg = score/audienceNum;
		String avgScore = null;
		if(avg >= 50) {
			avgScore = "☆☆☆☆☆";
		}else if(avg >= 40) {
			avgScore = "☆☆☆☆";
		}else if(avg >= 30) {
			avgScore = "☆☆☆";
		}else if(avg >=20) {
			avgScore = "☆☆";
		}else {
			avgScore = "☆";
		}
		return avgScore;
	}
	
	public abstract void getInformation();
	
}
