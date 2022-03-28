package kr.ac.kopo.day13;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class IOMain06 {
	
	public static void write() {
		Icecream ice = new Icecream("비비빅", 1000);
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			
			fos = new FileOutputStream("iotest/icecream.txt");
			dos = new DataOutputStream(fos);
			
			dos.writeUTF(ice.getName());
			dos.writeInt(ice.getPrice());
			
			dos.flush();
			
			System.out.println("icecream.txt에 저장완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dos, fos);
		}
	}

	public static void main(String[] args) {
		
		write();
		

	}

}
