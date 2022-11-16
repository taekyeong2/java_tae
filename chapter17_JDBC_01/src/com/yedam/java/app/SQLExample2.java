package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExample2 {
	public static void main(String[] args) {
		
		//try catch 문이 가지는 각각의 블럭들 벗어나면 그 안에서 선언한 변수 사용 ㄴㄴ
		//변수 선언해줌
		Connection conn = null;
		Statement stmt = null;;
		PreparedStatement ps = null;
		ResultSet rs = null;
		 
		try {
			//(1-2단계는 한번만)
			//1.JDBC Driver 로딩하기
			//sql이 제공하고 있는 클래스 ->org.sqlite.JDBC
			Class.forName("org.sqlite.JDBC"); 
			
			//2.DBMS 서버와 접속하기 (DB + SQl문 컴파일할 수있는 언어 + 데이터베이스 관리 기능..)
			String url = "jdbc:sqlite:/D:/div/database/TestDateBase.db";
			conn = DriverManager.getConnection(url);
			
			//============================================
			
			//여기서 부터 반복(3-5단계)
			//INSERT-------------------------------------
			//3.Statement or PreparedStatment객체 생성하기(구성방법의 차이)
			//PreparedStatmen 사용 -> '?' 라는 변수가 존재 => 값을 집어넣고자 하는 부분에 ? 사용
			String insert = "INSERT INTO Students (students_id, students_name) VALUES (?,?)";
			ps = conn.prepareStatement(insert);
			// ? 가 2개면 메소드도 2개 -> 타입을 지정해 줘야한다.(숫자인지 그외의것인지 구분 -> 숫자아니면 ""포함해서 정해진 포멧돌림)
			//statement는 내가 직접 ""붙여줘야한다. 번거로움
			//     => "UPDATE Students SET students_dept ="+ "S" +" WHERE students_id ="+ I;
			//statemanet는 select에 많이 쓰고 그 이외는 preparedstament를 많이 쓴다.
			// sql작성할때 숫자 이외이면 '' 사용, 숫사면 ''사용 ㄴ
			ps.setInt(1, 110); //(몇번째 물음표인지 위치, 값)
			ps.setString(2, "윤달하");;
			
			//4.SQL 실행
			int result = ps.executeUpdate(); //sql문이 실행되면서 건든 레코드를 반환 (몇행이 실행?)-> 따라서 insert update delet는 반환되는 결과가 정수
			
			//5.결과 출력
			System.out.println("insert결과 : "+ result);
			
			//SELECT------------------------------------
			//3.Statement or PreparedStatment객체 생성하기
			stmt = conn.createStatement(); //매개변수 없음
			
			//4.SQL 실행
			//preparedstatment -> 미완성의 sql문을 받아서 ?를 받아서 대치시킴 
			//                  => 한번 값(미완성)을 받은 후 자기 메소드 이용해서 미완성 완성 시킨 후 실행
			//statment -> 그대로 보내버림
			String select = "SELECT students_id, students_name, students_dept FROM Students";
			rs = stmt.executeQuery(select);
			
			//5.결과 출력
			while(rs.next()) {
				int id = rs.getInt("students_id");
				String name = rs.getString("students_name");
				String dept = rs.getString("students_dept");
				
				System.out.printf("학번: %d, 이름: %s, 학년: %s \n", id, name, dept);
			}
			
			//UPDATE-------------------------------------
			//3.Statement or PreparedStatment객체 생성하기
			String udpate = "UPDATE Students SET students_dept = ? WHERE students_id = ?";
			ps = conn.prepareStatement(udpate);
			ps.setInt(2, 110);
			ps.setString(1, "3학년");
			
			//4.SQL 실행
			result = ps.executeUpdate();
			
			//5.결과 출력
			System.out.println("update 결과 : "+ result);
				
			//DELETE-------------------------------------
			//3.Statement or PreparedStatment객체 생성하기
			stmt = conn.createStatement();
			
			//4.SQL 실행
			String delete = "DELETE FROM students WHERE students_id = " + 110;
			result = stmt.executeUpdate(delete);
			
			//5.결과 출력
			System.out.println("delete 결과 : "+ result);
			
		}catch(ClassNotFoundException e) {//e -> 예외관련 모든 것이 들어있는 변수
			System.out.println("JDBC Driver Loding Fail");
		}catch(SQLException e) {
			System.out.println("SQL관련 예외: "+ e.getMessage()); //오류 메세지 간단 출력
			e.printStackTrace();//자세한 오류 메세지 출력
			
			//SQL관련 예외: [SQLITE_BUSY] The database file is locked (database is locked)
			//locked -> 누가 먼저 접근 해서 못건드는것
			//          변경된거 저장하든지 취소하든지 하라는 것ㄴ
			//primary => 유니크해야하는데 입력 데이터중에 중복되는게 있다는 뜻(계속같은데이터 올라갈려고하면)
		}catch(Exception e) { //모든예외의 부모 -> 기타로 사용 
			e.printStackTrace(); //오류 full내용
		}finally {
			try {
				//6. 자원해제하기
				if(rs != null)rs.close(); //re.close()도 SQL이라서 오류
				if(stmt != null)stmt.close();
				if(ps != null)ps.close();
				if(conn != null)conn.close();
			}catch(SQLException e) {
				System.out.println("정상적으로 자원이 해제되지 않았습니다.");
			}
			
		}
	}
}
