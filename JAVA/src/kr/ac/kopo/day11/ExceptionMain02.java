package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain02 {

	public static void main(String[] args) {
		
		System.out.println("Main Start..!");
		Random r = new Random();
		int num = r.nextInt(3);
		System.out.println("num : " + num);
		try {			
			System.out.println(10 / num);
		} catch(ArithmeticException ae) {
			System.out.println("예외 발생-! : " + ae.getMessage());
			ae.printStackTrace();
		}
		System.out.println("Main End..!");

	}

}
