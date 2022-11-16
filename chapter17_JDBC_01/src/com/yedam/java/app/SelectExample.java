package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectExample {
	public static void main(String[] args) {
		try { //1-5 => 예외발생가능성 있는 코드
		//1. JDBC Driver 로딩하기.
		//클래스 호출해서 메모리상에 등록
		Class.forName("org.sqlite.JDBC"); //실행예외 -> try catch 구문을 통해 처리
		
		//2. DB 서버 접속하기
		//절대경로
		String url = "jdbc:sqlite:/D:/div/database/TestDateBase.db"; 
		//통로
		Connection conn = DriverManager.getConnection(url);
		
		//3. Statement or PreparedStatement 객체 생성하기 -> 통로 왔다갔다하는 트럭
		//지정한 경로에 메세지를 가지고 움직이는 것
		Statement stmt =  conn.createStatement(); //배달부 배정
		
		//4. SQL 실행
		ResultSet  rs = stmt.executeQuery("SELECT students_id, students_name, students_dept FROM Students");
		
		//5. 결과값 출력
		//resultset 은 index개념 없어서 for문 논
		//커서가 next()를 통해 밑으로 움직이면서 resultset의 하나의 레코드(행) 가리킴
		while(rs.next()) {
			int sId = rs.getInt("students_id");  //약칭을 사용한다면 약칭으로 접근
			String sName = rs.getString("students_name");
			String sDept = rs.getString("students_dept");
			System.out.println("학번 : "+ sId);
			System.out.println("이름 : "+ sName);
			System.out.println("학년 : "+ sDept);
		}
		//                              =============== ->sql사용하면 반드시 발생할 수 있는 예외라고 생각
		}catch(ClassNotFoundException | SQLException e) { // 발생할수있는 예외들
		   //========================calss.forname -> 문자열로 받아서 자바가 체크할 수 없음 => 예외 발생
			e.printStackTrace();
		}finally {
		//6. 자원해제하기
		//반드시 사용이 끝나면 해제해야지 다른곳에서도 쓸수있다.
		//resultset -> statement -> connection (순서가 반대)
			if(rs != null) rs.close(); //객체가 있어야지 메소드를 호출할수 있으니 != null
			if(stmt ! = null) stmt.close();
			if(conn ! = null) conn.close();
			
		}
		
	}
}
