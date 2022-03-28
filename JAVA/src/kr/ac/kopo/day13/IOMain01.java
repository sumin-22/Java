package kr.ac.kopo.day13;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain01 {

	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		System.out.println("키보드 입력을 하세요. ctrl+z 입력시 종료");
		
		while(true) {
			try {
				int c = isr.read();
				if (c == -1) break;
				System.out.print((char)c);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
//		while(true) {
//			try {
//				int c = is.read();	
//				if (c == -1);
//				System.out.print((char)c);
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			
//		}

	}

}
