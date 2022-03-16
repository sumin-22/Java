package kr.ac.kopo.day06;
/*
 	**********
 	Hello
 	**********
 	Hi
 	**********
 	Bye
 	**********
 	
 	반환형 메소드명([파라미타]) {
 		문장;
 		문장;
 	}
 */

public class MethodMain01 {
	
	static void printStar(){	//메소드명은 소문자로 시작 
		System.out.println("**********");
	}
	//메소드 정의
	public static void main(String[] args) {
		printStar();	//메소드 호출
		System.out.println("Hello");
		printStar();
		System.out.println("Hi");
		printStar();
		System.out.println("Bye");
		printStar();
		
	

	}

}
