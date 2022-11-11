package com.yedam.java.homework03;

public class Performance extends Culture{
     String genre;
	

	public Performance(String movieName, int derecterNum, int actorNum, String genre) {
		super(movieName, derecterNum, actorNum);
		this.genre = genre;
	}

	@Override
	public void getInformation() {
		System.out.println("영화제목: "+ movieName);
		System.out.println("장르: "+ genre);
		System.out.println("감독: "+ derecterNum);
		System.out.println("배우: "+ actorNum);
		System.out.println("관객수: "+ audienceNum);
		System.out.println("영화총점: "+ score);
		System.out.println("영화평점: "+ getGrade());
		System.out.println("======================");
	}
}
