package com.yedam.java.homework2;

public class Application {
	public static void main(String[] args) {
		Notebook notebook = new PortableNotebook("한글2020","크롬" ,"영화" , "안드로이드앱");
		
		PortableNotebook port = (PortableNotebook) notebook;
		
		port.writeDocumentaion();
		port.watchVideo();
		port.changeMode();
		port.useApp();
		port.searchInternet();
			
	}
}
