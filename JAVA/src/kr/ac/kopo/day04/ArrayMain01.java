package kr.ac.kopo.day04;

public class ArrayMain01 {

	public static void main(String[] args) {
		
		int [] arr; // 초기화가 되어 있지 않다
		
		// 정수 5개를 가지는 배열 생성
		arr = new int[5];
		System.out.println("arr : " + arr);  //자동초기화는 new일 때만 가능하다
		System.out.println("배열의 원소 총 개수 : " + arr.length + "개");
		System.out.println("첫번째 원소 : " + arr[0]);
		System.out.println("두번째 원소 : " + arr[1]);
		System.out.println("세번째 원소 : " + arr[2]);
		System.out.println("네번째 원소 : " + arr[3]);
		System.out.println("다섯번째 원소 : " + arr[4]);
		// new때문에 자동초기화가 되어 모두 0의 값을 가진다 
		
		System.out.println("-------------------------------");
		
		for(int i =0; i < arr.length; i++) { 
		//배열 개수가 5이기 때문에 5보다 작다는 표현을 더 많이 쓴다. 고정 값이 아닐 수 있기 때문에 배열이름.length를 써준다
			System.out.println(i + "번째 원소 : " + arr[i]);// index의 i 
		}
		
		System.out.println("-------------------------------");
		// 각원소값에 10,20,30,40,50 대입
		/*
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		*/
		
		for(int i =0; i < arr.length; i++) {
			arr[i] = (i+1) * 10;
		}
		
		for(int i =0; i < arr.length; i++) {
			System.out.println(i + "번째 원소 : " + arr[i]);
		}
		
		
	}

}
