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
	
	static int printStar(char ch, int cnt){	//메소드명은 소문자로 시작 
		for(int i =0; i <cnt; i++) {
			System.out.print(ch);
		}
		System.out.println();
		
	//	return; 	//다시 호출자 메소드로 돌아감
		return ch + cnt;
	}
	//메소드 정의
	public static void main(String[] args) {
		int code = printStar('A', 10);	//메소드 호출
		System.out.println("Hello");
		printStar('!', 20);
		System.out.println("Hi");
		printStar('-', 5);
		System.out.println("Bye");
		printStar('#', 8);
		System.out.println(code);
		
		
	

	}

}
