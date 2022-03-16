package kr.ac.kopo.day06.homework;

import java.util.Scanner;

class Icecream{
	String name;
	int prie;
}

public class HomeworkMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이스크림 구매 개수 : ");
		int count = sc.nextInt();
		sc.nextLine();
		
		Icecream[] iceArr = new Icecream[count];  //주소값을 기억하는 참조배열일 뿐
		for(int i =0; i < count; i++) {
			iceArr[i] = new Icecream();		//눈에 보이는 아이스크림 생성
			
			System.out.println("*** " + (i+1) + "번째 아이스크림 구매정보 입력 ***");
			System.out.print("아이스크림명 : ");
			iceArr[i].name = sc.nextLine();
			System.out.print("아이스크림 가격 : ");
			iceArr[i].prie = Integer.parseInt(sc.nextLine());
		}

	}

}
