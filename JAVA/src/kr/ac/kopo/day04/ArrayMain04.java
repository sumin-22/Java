package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain04 {

	public static void main(String[] args) {
		
	//배열 초기화 방법 2가지
	//  int []arr = {10, 20, 30, 40, 50};
		int [] arr = new int[] {10, 20, 30, 40, 50};
		
	//  arr = {5, 4, 3};    // 이 선언은 배열의 선언부와 같이 쓰일 때만 사용 가능하다
		arr = new int[] {5, 4, 3};  // new랑만 사용 가능
		
		System.out.println("arr : " + Arrays.toString(arr));
	}

}
