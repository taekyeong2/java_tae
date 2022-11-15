package me;

public class Lotto {
	public static void main(String[] args) {
		int num;
		int[][] lotto = new int[5][6];
		
		for(int i=0; i<lotto.length; i++) {
			for(int j=0; j<lotto[i].length; j++) {
				num = (int)(Math.random()+45)*1;
				if(num == lotto[i][j]) {
					num = (int)(Math.random()+45)*1;
					lotto[i][j]=num;
				}
			}
			

		}
		
		
	}
}
