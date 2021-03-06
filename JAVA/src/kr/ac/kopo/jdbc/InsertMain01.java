package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

// id: 'hong' name : '홍길동' 레코드 삽입
/*
 * 작업순서
 * 1. 드라이버 로딩
 * 2. DB 접속 및 Connection 얻어오기
 * 3. sql 실행 객체 얻어오기
 * 4. 쿼리 시행 및 결과 얻어오기
 * 5. 접속 종료
 */

public class InsertMain01 {

	public static void main(String[] args) {
		//트랜잭션에서는 사용 불가, auto commit이 자동으로 일어나기 때문
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 완료... ");
			
			//2. DB 접속 및 Connection 객체 얻기
			String url = 		"jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = 		"scott";
			String password =   "tiger";
			
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("conn : " + conn);
			
			//3. sql 실행객체 얻어오기
			stmt = conn.createStatement();
			String sql = "insert into t_test(id, name) values('hong','홍길동')";
			
			//4. sql을 실행하고 결과를 얻어오기
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총 " + cnt + "개 행이 삽입되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//5. 접속 종료
			//만들어진 순서 반대로 종료 (statement 먼저 종료 후 connection 종료)
			if(stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			//같은 try - catch로 묶어주면 안됨. 각각 종료해줘야한다.
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
