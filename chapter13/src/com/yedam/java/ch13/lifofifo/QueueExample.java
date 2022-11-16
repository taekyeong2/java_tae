package com.yedam.java.ch13.lifofifo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample { //채팅 => 내가 보낸 순서대로 상대방이 봄
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		//linkedlist => list와 queue를 다 구현 가능
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSms", "신용권"));
		messageQueue.offer(new Message("sendKakao", "홍두꺠"));

		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			//입력한 순서대로 꺼내온다.
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSms":
				System.out.println(message.to + "님에게 sms을 보냅니다.");
				break;
			case "sendKakao":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;
			}
		}
		
		//기존의 배열 set map은 가져온다 해도 데이터 사라지지 않는다.
		//요청받은 메세지를 받고 완료한 뒤 해결한 메세지가 사라질 필요
		//한번 사용하고 데이터가 사라지면 끝나는 건 -> 리포피포
		
		
		
	}
}
