package com.yedam.app.emp;

import java.util.ArrayList;
import java.util.List;

import com.yedam.app.common.DAO;

public class EmpDAOImpl extends DAO implements EmpDAO {
	//싱글톤
	private static EmpDAO instance = null;
	
	public static EmpDAO getInstance() {
		if(instance == null)
			instance = new EmpDAOImpl();
		return instance;
	}
	

	@Override
	public List<EmpVO> selectAll() {
		List<EmpVO> list = new ArrayList<>();
		try {
			connect();
			
			stmt = conn.createStatement();
			String sql = "SELECT * FROM employees";
			rs = stmt.executeQuery(sql);
			int count = 0;
			while(rs.next()) {
				EmpVO empVo = new EmpVO();
				empVo.setEmpNo(rs.getInt("emp_no"));
				empVo.setBirthDate(rs.getString("birth_date"));
				empVo.setFirstName(rs.getString("first_name"));
				empVo.setLastName(rs.getString("last_name"));
				empVo.setGender(rs.getString("gender"));
				empVo.setHireDate(rs.getString("hire_date"));
				
				list.add(empVo);
				
				if(++count >=20) break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}

	@Override
	public EmpVO selectOne(EmpVO empVo) {
		EmpVO findVo = null;
		try {
			connect();
			stmt = conn.createStatement();
			
			String sql = "SELECT * FROM employees WHERE emp_no = "+ empVo.getEmpNo();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				findVo = new EmpVO();
				findVo.setEmpNo(rs.getInt("emp_no"));
				findVo.setBirthDate(rs.getString("birth_date"));
				findVo.setFirstName(rs.getString("first_name"));
				findVo.setLastName(rs.getString("last_name"));
				findVo.setGender(rs.getString("gender"));
				findVo.setHireDate(rs.getString("hire_date"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return findVo;
	}

	@Override
	public void insert(EmpVO empVo) {
		try {
			connect();
			String sql = "INSERT INTO employees VALUES (?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empVo.getEmpNo());
			pstmt.setString(2, empVo.getBirthDate());
			pstmt.setString(3, empVo.getFirstName());
			pstmt.setString(4, empVo.getLastName());
			pstmt.setString(5, empVo.getGender());
			pstmt.setString(6, empVo.getHireDate());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("정상적으로 등록되었습니다.");
			}else {
				System.out.println("정상적으로 등록되지 않았습니다.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}

	@Override
	public void update(EmpVO empVo) {
		try {
			connect();
			String sql = "UPDATE employees SET first_name = ? WHERE emp_no =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, empVo.getFirstName());
			pstmt.setInt(2, empVo.getEmpNo());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("정상적으로 수정되었습니다.");
			}else {
				System.out.println("정상적으로 수정되지 않았습니다.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}

	@Override
	public void delete(int empNo) {
		try {
			connect();
			stmt = conn.createStatement();
			String sql = "DELETE FROM employees WHERE emp_no ="+ empNo;
			int result = stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("정상적으로 삭제되었습니다..");
			}else {
				System.out.println("정상적으로 삭제되지 않았습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}

}
