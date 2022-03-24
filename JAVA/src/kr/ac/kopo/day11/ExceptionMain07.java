package kr.ac.kopo.day11;

import java.util.Scanner;

class MismatchEvenExcepction extends Exception{

	public MismatchEvenExcepction() {
		super();	
	}

	public MismatchEvenExcepction(String message) {
		super(message);
	}
}

public class ExceptionMain07 {

	public static void main(String[] args) throws Exception {	//JVM에 맡기기!!!!
		
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("짝수를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num < 0 || num %2 ==1) {
				throw new MismatchEvenExcepction(num  + "은 짝수가 아닙니다");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		/*
		 * if(num < 0 || num %2 ==1) { System.out.println("Error-!"); 
		 * } else {
		 * System.out.println("짝수 : " + num); }
		 */
	}

}
