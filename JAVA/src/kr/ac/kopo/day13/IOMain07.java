package kr.ac.kopo.day13;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import kr.ac.kopo.util.FileClose;

public class IOMain07 {
	
	public static void write() {
		Icecream ice = new Icecream("월드콘", 2000);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("iotest/object.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(ice);
			
			System.out.println("object.txt 저장완료...");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(oos, fos);
		}
	}

	public static void main(String[] args) {
		write();

	}

}
