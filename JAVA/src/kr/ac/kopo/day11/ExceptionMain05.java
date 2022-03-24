package kr.ac.kopo.day11;

import java.io.FileReader;

public class ExceptionMain05 {

	public static void main(String[] args) {
		
		System.out.println("Main Start..!");
		
		for(int i =0; i < 5; i++) {
			try {
				System.out.println("Loop...");
				if(i==3) {
					FileReader fr = new FileReader("a.txt");
				}
			} catch(Exception fnfe) {
				fnfe.printStackTrace();
				break;
			} finally {
				System.out.println("End loop...");
			}
		}
		System.out.println("Main End..!");
	}

}
