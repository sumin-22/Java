package kr.ac.kopo.day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import kr.ac.kopo.util.FileClose;

/* 
 * iotest/IOMain04.java => IOMain04.java.txt복사
 */

public class IOMain05 {
	public static void mian(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader("iotest/IOMain04.java");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("iotest/IOMain04.java.txt");
			bw = new BufferedWriter(fw);
			
			while (true) {
				int c = br.read();
				if (c == -1) break;
				bw.write(c);
			}
			
			bw.flush();
			System.out.println("파일 복사를 완료하였습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br);
			FileClose.close(bw);
			
			
		}
		
	}

}
