package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 	N개의 문장을 표현하기 위해서는 n-1개의 조건식이 필요하다
 	
 	if(조건1) {
 		문장 1;
 	} else{                      조건1일 거짓인 것들 중에서 
 		if(조건2) {               조건2가 참이면 문장2를, 조건이 거짓이면 문장3을 출력
 			문장2;
 		} else{
 			문장3;
 		}
 	}
 	
 	
 	출발한 시간을 입력하세요 (ex 7시 30분 : 730) -> 807
 	버스를 탑니다
 */

public class IFMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("집에서 출발한 시간을 입력하세요 (7시 30분 : 730) -> ");
		int time = sc.nextInt();
		
		if (time < 800) {
			System.out.println("걸어서 학교에 간다");
		} else { 
			if (time < 815) {
				System.out.println("버스를 타고 학교에 간다");
			} else {
				System.out.println("택시를 타고 학교에 간다");
			}
		
		}

	}

}
