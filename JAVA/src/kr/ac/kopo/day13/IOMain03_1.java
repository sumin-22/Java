package kr.ac.kopo.day13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

import kr.ac.kopo.util.FileClose;

/*
 * 콘솔모드에서
 * java IOMain03_1 tan.jpg tan2.jpg  입력시
 * 
 * tan.jpg -> tan2.jpg 복사
 */

public class IOMain03_1 {

	public static void main(String[] args) {
		
		System.out.println("args : " + Arrays.toString(args));
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			
			fis = new FileInputStream(args[0]);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(args[1]);
			bos = new BufferedOutputStream(fos);
			
			long start = System.currentTimeMillis();
			
			while(true) {
				int c = bis.read();
				if(c == -1) break;
				bos.write(c);
			}
			
			fos.flush();
			
		} catch( Exception e) {
			e.printStackTrace();
			
		} finally {
			
			FileClose.close(bis, fis);
			FileClose.close(bos, fos);
		
//			FileClose.close(bis);
//			FileClose.close(bos);
//			
//			FileClose.close(fis);
//			FileClose.close(fos);
		}
		
		
		/*finally {
			
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
		}*/
		
		System.out.println("파일 복사가 완료되었습니다");

	}

}
