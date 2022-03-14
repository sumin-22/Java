package kr.ac.kopo.day04.homework;

import java.util.Scanner;

public class HomeworkMain05 {

	public static void main(String[] args) {
		
		/*
		int star =1;
		for(int i = 1; i <=9; i++) {// 전체 9개애서 앞, 뒤 *의 개수를 제외하고 나머지는 모두 '-'
			for (int j =1; j <=9; j++) {
				if(j <= star || j >= 10-star) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
			if (i <5)
				star++;
			else
				star--;
		}
		
		*/
		
		
		
		int star = 4;
		for(int i =1; i <=9; i++) {
			for(int j =1;j <=9; j++) {
				if(j <= star || j >= 10-star) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
			if (i <5)
				star--;
			else
				star++;
		}
		
		System.out.println();
		System.out.println();
		
		int space = 0;
		for(int i =1; i<=9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j <= space || j >= 10-space) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			if (i <5)
				space++;
			else
				space--;
		}
		
		System.out.println();
		System.out.println();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("3 ~ 40 사이의 라인 수를 입력하세요 : ");
		
		int line = sc.nextInt();
		
		if(line % 2 ==0) //짝수를 받았을 때 라인을 홀수로 만들어 주기
			line--;
		
		int star2 = line/2;
		for(int i=1; i <=line; i++) {
			for(int j=1; j <=line; j++) {
				if(j <= star2 || j >=(line+1) - star2) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
			if (i < (line/2)+1)
				star2--;
			else
				star2++;
			
			
		}
		
		Scanner s = new Scanner(System.in);
		System.out.print("3 ~ 40 사이의 라인 수를 입력하세요 : ");
		
		int line2 = s.nextInt();
		
		if(line2 % 2 ==0)
			line2--;
		
		int space2 = 0;
		for(int i = 1; i <=line2; i++) {
			for(int j =1; j <= line2; j++) {
				if(j<= space2 || j >= (line2+1)-space2) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			if (i < (line/2)+1)
				space2++;
			else
				space2--;
		}
		
	/*
	 * 	int star = 4;
		for(int i =1; i <=9; i++) {
			for(int j =1;j <=9; j++) {
				if(j <= star || j >= 10-star) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
			if (i <5)
				star--;
			else
				star++;
	 */
		
		

	}

}
