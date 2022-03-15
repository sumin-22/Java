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
		sc.nextLine();
		
		int sum = 0;
		Icecream [] icArr = new Icecream[count];
		
		for(int i =0; i < count; i++) {
			icArr[i] = new Icecream();
			System.out.printf("*** %d번째 아이스크림 구매정보 *** \n",i+1);
			System.out.print("아이스크림명 : ");		
			icArr[i].name = sc.nextLine();
			
			System.out.print("아이스크림 가격 : ");	
			icArr[i].price = sc.nextInt();
			sc.nextLine();
			
			sum += icArr[i].price;
		}
		
		for(Icecream ic : icArr) {
			System.out.println(ic.name + ic.price);
		}
		
		for(int i = 0; i <count; i++) {
			System.out.println(i+1 + icArr[i].name + icArr[i].price);
		}
		System.out.println(sum);
	}

}
