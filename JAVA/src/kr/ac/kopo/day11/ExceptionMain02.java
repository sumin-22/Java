package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain02 {

	public static void main(String[] args) {
		
		System.out.println("Main Start..!");
		try {			
			Random r = new Random();
			int num = r.nextInt(3);
			System.out.println("num : " + num);
			System.out.println(10 / num);
			
			String str = "Hello";
			System.out.println("str : " + str);
			System.out.println(str.charAt(10));
			
		} catch(Exception e) {	//묵시적 형변환
			System.out.println("예외 발생-! : " + e.getMessage());
		} 
		
		System.out.println("Main End..!");

	}

}
