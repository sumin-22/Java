package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain01 {

	public static void main(String[] args) {
		
		System.out.println("Main Start..!");
		Random r = new Random();
		int num = r.nextInt(3);
		System.out.println("num : " + num);
		System.out.println(10 / num);
		System.out.println("Main End..!");

	}

}
