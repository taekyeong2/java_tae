package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExample {
	public static void main(String[] args) {
		
	
		Connection conn = null;
		Statement stmt = null;;
		PreparedStatement ps = null;
		ResultSet rs = null;
		 
		try {
			Class.forName("org.sqlite.JDBC"); 
						
			String url = "jdbc:sqlite:/D:/div/database/TestDateBase.db";
			conn = DriverManager.getConnection(url);
			
			//============================================
			
			
			//INSERT-------------------------------------
			ps.setInt(1, 110);
			ps.setString(2, "윤달하");;
			
			int result = ps.executeUpdate(); 
			
			System.out.println("insert결과 : "+ result);
			
			stmt = conn.createStatement();
			
			
			String select = "SELECT students_id, students_name, students_dept FROM Students";
			rs = stmt.executeQuery(select);
			
			while(rs.next()) {
				int id = rs.getInt("students_id");
				String name = rs.getString("students_name");
				String dept = rs.getString("students_dept");
				
				System.out.printf("학번: %d, 이름: %s, 학년: %s \n", id, name, dept);
			}
			
			//UPDATE-------------------------------------
			String udpate = "UPDATE Students SET students_dept = ? WHERE students_id = ?";
			ps = conn.prepareStatement(udpate);
			ps.setInt(2, 110);
			ps.setString(1, "3학년");
			
			result = ps.executeUpdate();
			
			System.out.println("update 결과 : "+ result);
				
			//DELETE-------------------------------------
			stmt = conn.createStatement();
						
			String delete = "DELETE FROM students WHERE students_id = " + 110;
			result = stmt.executeUpdate(delete);
						
			System.out.println("delete 결과 : "+ result);
			
		}catch(ClassNotFoundException e) {
			System.out.println("JDBC Driver Loding Fail");
		}catch(SQLException e) {
			System.out.println("SQL관련 예외: "+ e.getMessage()); 
			e.printStackTrace();
			
		}catch(Exception e) { 
			e.printStackTrace(); 
		}finally {
			try {
				if(rs != null)rs.close(); 
				if(stmt != null)stmt.close();
				if(ps != null)ps.close();
				if(conn != null)conn.close();
			}catch(SQLException e) {
				System.out.println("정상적으로 자원이 해제되지 않았습니다.");
			}
			
		}
	}
}
