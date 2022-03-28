package kr.ac.kopo.day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * tan.jpg (입력장치) -> tan2.jpg 복사 (출력장치)
 */

public class IOMain02 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			fis = new FileInputStream("iotest/tan.jpg");
			fos = new FileOutputStream("iotest/tan2.jpg");
			while(true) {
				int c = fis.read();	//byte 읽기
				if(c == -1) break;
				fos.write(c);	// byte형태로 저장
			}
			
			fos.flush();
			
		} catch( Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch(Exception e ) {
				e.printStackTrace();
			}
		}
		
		System.out.println("파일 복사가 완료되었습니다");

	}

}
