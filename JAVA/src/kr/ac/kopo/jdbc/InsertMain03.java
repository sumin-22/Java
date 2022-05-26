package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMain03 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = 		"jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user = 		"scott";
			String password =   "tiger";
			
			conn = DriverManager.getConnection(url, user, password);
			
			Scanner sc = new Scanner(System.in);
			System.out.print("id : ");
			String id = sc.nextLine();
			System.out.print("Name : ");
			String name = sc.nextLine();
			
			//?만 가능
			String sql = "insert into t_test(id,name) values (?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행이 삽입되었습니다.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			//같은 try - catch로 묶어주면 안됨. 각각 종료해줘야한다.
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}	
		}
	}
}
