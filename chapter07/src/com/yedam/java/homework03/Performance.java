package com.yedam.java.homework03;

public class Performance extends Culture{
	
     String genre;
	

	public Performance(String movieName, int derecterNum, int actorNum, String genre) {
		super(movieName, derecterNum, actorNum);
		this.genre = genre;
	}

	@Override
	public void getInformation() {
		System.out.println("공연제목: "+ movieName);
		System.out.println("장르: "+ genre);
		System.out.println("감독: "+ derecterNum);
		System.out.println("배우: "+ actorNum);
		System.out.println("관객수: "+ audienceNum);
		System.out.println("공연총점: "+ getAvg()+"(누적점수: "+score+")");
		System.out.println("공연평점: "+ getGrade());
		System.out.println("======================");
	}
}
