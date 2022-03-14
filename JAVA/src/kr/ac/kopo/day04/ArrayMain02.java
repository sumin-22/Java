package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain02 {

	public static void main(String[] args) {
		
		//문자를 여러개 가지는 배열을 생성하고 싶다
		//String[] strArr = {"데이터분석", "자바", "교육"};
		
		String[] strArr = new String[3]; //null값으로 초기화
		strArr[0] = "데이터분석";
		strArr[1] = "자바";
		strArr[2]= "교육";
		
		System.out.println("문자열의 총 개수 : " + strArr.length + "개");
		/*
		 * 배열의 전체 원소 출력 방식
		 * 1. index를 이용한 출력
		 * 2. 1.5버전의 for문을 이용한 출력 -> 입력할 때는 쓰지 않는다. 검색할 때 주로 사용
		 * 3. Arrays.toString() 메소드를 이용한 출력
		 */
		
		System.out.println("< index를 이용한 출력 >");
		for (int i =0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		System.out.println("<1.5버전의 for문 이용 출력");
		for(String s: strArr) { //변수선언 : 배열명 strArr에 있는 모든 원소를 s로 어세스
			//String s = strArr[0]
			//String s = strArr[1]
			//String s = strArr[2]
			//String s = strArr[strArr.length -1]
			System.out.println(s);
		}
		
		System.out.println("< Arrays.toString() 메소드 이용 출력 >");
		String result = Arrays.toString(strArr);      //"[원소, 원소, 원소, ...]"
		System.out.println(result);
		
		
		/*
		System.out.println("첫번째 문자열 : " + strArr[0]);
		System.out.println("첫번째 문자열 : " + strArr[1]);
		System.out.println("첫번째 문자열 : " + strArr[2]);
		*/

	}

}
