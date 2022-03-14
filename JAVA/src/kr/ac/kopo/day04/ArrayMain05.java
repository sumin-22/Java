package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain05 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 50, 70, 30};
		//int[] copy = arr;  //복사복을 만드는 것이 목적 <= shallow copy
		
		// deep copy, 공간도 만들고 값도 복사
		int [] copy = new int[arr.length]; 
		System.arraycopy(arr,0, copy, 0, arr.length);
		/*
		 * for(int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		*/
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copy : " + Arrays.toString(copy));
		
		copy[2] = 100;
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copy : " + Arrays.toString(copy));
	
		/*이 경우 arr의 값도 같이 수정되고 있다. why? 같은 주소값을 복사했기 때문
		 * 이를 shallow copy(얕은 복사)라고 한다
		 */
		
		
	}

}
