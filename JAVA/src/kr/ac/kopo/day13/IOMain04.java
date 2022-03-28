package kr.ac.kopo.day13;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class IOMain04 {
	
	public static void write() {
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("iotest/data.dat");
			dos = new DataOutputStream(fos);
			char c = 'A';
			
//			fos.write(c);
			dos.writeChar(c);
			
			fos.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fos);
		}
	}

	public static void main(String[] args) {
		
		write();
		

	}

}