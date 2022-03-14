package kr.ac.kopo.day04;

public class ArrayMain01 {

	public static void main(String[] args) {
		
		int [] arr; // 초기화가 되어 있지 않다
		
		// 정수 5개를 가지는 배열 생성
		arr = new int[5];
		System.out.println("arr : " + arr);  //자동초기화는 new일 때만 가능하다
		System.out.println("첫번째 원소 : " + arr[0]);
		System.out.println("두번째 원소 : " + arr[1]);
		System.out.println("세번째 원소 : " + arr[2]);
		System.out.println("네번째 원소 : " + arr[3]);
		System.out.println("다섯번째 원소 : " + arr[4]);
		// new때문에 자동초기화가 되어 모두 0의 값을 가진다 
		

	}

}
