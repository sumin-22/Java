package kr.ac.kopo.day06;

import java.util.Scanner;

public class Gugudan {
	
	int getDan(){
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		return dan;
	}
	
	
	void print(int dan) {
		System.out.println("*** " + dan +"단 ***");
		for(int i =1; i <=9; i++) {
			System.out.printf("%d * %d = %d\n",dan, i, dan*i);
		}
	}
	
	void print() {	//오버로딩 지원
		for(int dan =2; dan <=9; dan++) {
			/*System.out.println("*** " + dan +"단 ***");
			for(int i =1; i <=9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan *i);
			}*/
			print(dan);
			
		}
		
	}
	void print(int start, int end) {
		for(int dan = start; dan <= end; dan++) {
			print(dan);
		}
		
	}

}
