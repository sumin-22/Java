package kr.ac.kopo.day13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * tan.jpg (입력장치) -> tan2.jpg 복사 (출력장치)
 */

public class IOMain03 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			
			fis = new FileInputStream("iotest/tan.jpg");
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("iotest/tan3.jpg");
			bos = new BufferedOutputStream(fos);
			
			long start = System.currentTimeMillis();
			
			while(true) {
				int c = bis.read();	//byte 읽기
				if(c == -1) break;
				bos.write(c);	// byte형태로 저장
			}
			
			fos.flush();
			
		} catch( Exception e) {
			e.printStackTrace();
		} finally {
			
			if(bis != null) {
				try {
					bis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if(bos != null) {
				try {
					bos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			try {
				if(fis != null)
					fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if(fos != null)
					fos.close();
			} catch(Exception e ) {
				e.printStackTrace();
			}
		}
		
		System.out.println("파일 복사가 완료되었습니다");

	}

}
