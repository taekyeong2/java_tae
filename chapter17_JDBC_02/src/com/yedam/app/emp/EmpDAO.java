package com.yedam.app.emp;

import java.util.List;

public interface EmpDAO { //해당되는 테이블에 접근할때 쓰는 메소드 시그니처 정의
	//전체조회
	List<EmpVO> selectAll();
	
	//단건조회(매개변수는 포괄적으로)
	EmpVO selectOne(EmpVO empVo);
	
	//등록
	void insert(EmpVO empVo); //nn이라서 모든 데이터가 필요
	
	//수정
	void update(EmpVO empVo);
	
	//삭제
	void delete(int empNo);
}
