package com.yedam.java.homework2;

public class PortableNotebook implements Notebook, Tablet {

	private int mode;
	private String documentProgram;
	private String internetBrowser;
	private String videoType;
	private String appType;
	
	public PortableNotebook(String documentProgram, 
			String internetBrowser, String videoType, String appType) {
		this.documentProgram = documentProgram;
		this.internetBrowser = internetBrowser;
		this.videoType = videoType;
		this.appType = appType;
		this.mode = Notebook.NOTEBOOK_MODE;
		System.out.println("NOTEBOOK_MODE");
	}
	
	@Override
	public void watchVideo() {
		System.out.println(this.videoType+"를 시청.");
	}

	@Override
	public void useApp() {
		if(this.mode == Notebook.NOTEBOOK_MODE) {
			this.mode = Tablet.TABLET_MODE; 
			System.out.println(this.appType+"를 실행.");
		}else if(this.mode == Tablet.TABLET_MODE) {
			System.out.println(this.appType+"를 실행.");
		}
	}

	@Override
	public void writeDocumentaion() {
		System.out.println(this.documentProgram+"을 통해 문서를 작성.");
	}

	@Override
	public void searchInternet() {
		System.out.println(this.internetBrowser+"을 통해 인터넷을 검색.");
	}
	
	public void changeMode() {
		if(this.mode == Notebook.NOTEBOOK_MODE) {
			this.mode = Tablet.TABLET_MODE;
			System.out.println("TABLET_MODE");
		}else if(this.mode == Tablet.TABLET_MODE) {
			this.mode = Notebook.NOTEBOOK_MODE;
			System.out.println("TABLET_MODE");
		}
		
	}

}
