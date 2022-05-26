package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/*
 * 아이디 입력: park
 * 이름 입력 : 박길동
 * 1개 행을 삽입하였습니다.
 */

public class InsertMain02 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. DB접속
			String url = 		"jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String id  =		"scott"; 
			String password =	"tiger";
			
			conn = DriverManager.getConnection(url,id,password);
			System.out.println("conn: " + conn);
			
			//3. 실행객체 얻어오기
			Scanner sc = new Scanner(System.in);
			System.out.print("id : ");
			String i = sc.nextLine();
			System.out.print("Name : ");
			String name = sc.nextLine();
			
			String sql = "insert into t_test(id, name) ";
				   // 'id' ,'name' 형태로 넣어주어야한다
				   sql += "values(\'" +  i + "\', \'" + name + "\')";
			stmt = conn.createStatement();
			
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
