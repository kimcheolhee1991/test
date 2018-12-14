package com.method.call;

import java.util.ArrayList;

public class Ch99JDBCCall {

	public static void main(String[] args) {
		
		Ch99JDBCImpl t = new Ch99JDBCImpl();

		ArrayList<EmpVO> list = t.empList();
	//	ArrayList<EmpVO> list = t.empList("job", "CLERK");
	//	ArrayList<EmpVO> list = t.empList("empno", 7499);
		
		list = t.empList("deptno", 10);
				
		System.out.println(list.size());
		for(EmpVO evo : list) {
			System.out.println(evo.getEmpno() + "\t" + evo.getEname());
		}
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i).getEmpno() + "\t" + list.get(i).getEname());
//			또는,
//			EmpVO evo = list.get(i);
//			System.out.println(evo.getEmpno() + "\t" + evo.getEname());
//		}
		
		
		
		//삭제 ------------------------------
		int delRes = t.empDelete(7902);
		System.out.println(delRes+"건 삭제");
		
		//수정 ------------------------------
		int uptRes = t.empUpdate(9000, 7369);
		System.out.println(uptRes+"건 수정");
		
		//입력 ------------------------------
		int insRes = t.empInsert(8001, "아무개");
		System.out.println(insRes+"건 입력");
				
	}

}
