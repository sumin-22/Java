package kr.ac.kopo.day05;

import java.util.Scanner;

/*아이스크림 몇개 구입할꺼야? => 3 (키보드 입력)

*** 1번째 아이스크림 구매정보 ***
아이스크림명 : 비비빅(키보드)
아이스크림가격 : 700(키보드)

*** 2번째 아이스크림 구매정보 ***
아이스크림명 : 월드콘(키보드)
아이스크림가격 : 1500(키보드)

*** 3번째 아이스크림 구매정보 ***
아이스크림명 : 메로나(키보드)
아이스크림가격 : 1000(키보드)

< 총 3개의 아이스크림 구매정보 출력 >
번호   아이스크림명    가격
1     비비빅         700
2
3

   총 판매액 : XXXX원
   */
class Icecream {
	String name;
	int price;
}

public class HomeworkMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이스크림 구매 개수 : ");
		int count = sc.nextInt();
		
	
		for(int i = 1; i <= count; i++) {
			System.out.printf("*** %d번째 아이스크림 구매정보 ***",i);
			System.out.println();
			
			Icecream ic = new Icecream();
			System.out.print("아이스크림명 : ");
			ic.name = sc.next();
			System.out.print("아이스크림 가격 : ");
			ic.price = sc.nextInt();
			
			Icecream [] icArr =
		}
		System.out.println(" < 총 " + count + "개의 아이스크림 구매정보 출력 >");

	}

}
