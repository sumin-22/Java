package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * 작업순서
 * 1.드라이버 로딩 
 * 2.DB접속 및 연결객체 얻어오기
 */

public class DBTestMain {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			System.out.println("드라이버 로딩 완료... ");
			
			Connection conn = DriverManager.getConnection(
								"jdbc:oracle:thin:@192.168.119.119:1521:dink",
								"scott",
								"tiger"
			);
			System.out.println("DB접속 성공 :" + conn);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
