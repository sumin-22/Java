package kr.ac.kopo.day01;

/* 
 	 상수종류
 	 1. 정수
 	 2. 실수
 	 3. 문자형
 	 4. 문자열
 	 5. 논리형
 */

public class PrintMain {

	public static void main(String[] args) {
		
		System.out.println(10);
		System.out.println(06.13);
		System.out.println('V');
		System.out.println("Hello");
		System.out.println(true);
		
		System.out.println(23 + "살");
		System.out.println(10 + "+" + 20 + "=" + (10+20));
		
		System.out.printf("%d살\n",27);
		System.out.printf("%d + %d = %d\n", 10,20,10+20);
		System.out.printf("[%7d]\n",1200);
		System.out.printf("[%7d]\n",950);
		System.out.printf("[%7d]\n",85000);
		
		System.out.printf("[%05d]\n",35);
		System.out.printf("[%05d]\n",1230);
		System.out.printf("[%.2f]\n", 12.3091);
		System.out.printf("%7.1f원",1019.8);
		
		}

}
