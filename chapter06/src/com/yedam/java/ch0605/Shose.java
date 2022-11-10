package com.yedam.java.ch0605;

public class Shose {
	
	static int totalCount;
	int running;
	int slipper;
	int mule;
	
	void makeRunning() {
		running += 1;
	}
	void makeSlipper() {
		slipper += 1;
	}
	void makeMule() {
		mule += 1;
	}
	void getCount() {
		totalCount = running + slipper + mule;
	}
	
	
}
