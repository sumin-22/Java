package kr.ac.kopo.day12;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set : 순서(X), 중복 (X)
 * 	- HashSet
 * 	- TreeSet
 * 	- 인덱스 사용 X
 */

public class SetMain {

	public static void main(String[] args) {
		
//		Set<String> set = new HashSet<>();
		Set<String> set = new TreeSet<>();
		set.add("V");
		set.add("JK");
		set.add("SUGA");
		set.add("RM");
		set.add("JIN");
		set.add("V");	//중복 불가 
		
		System.out.println("전체 원소의 개수 : " + set.size() + "개");
		System.out.println();
		/* 
		 * 전체 데이터 접근방법 3가지
		 * 1. 1.5버전의 for문 이용
		 * 2. toArry() 메소드 이용
		 * 3. Iterator 객체 이용
		 */
		
		System.out.println("< 1.5버전의 for문 이용한 출력 >");
		for(String str : set) {
			System.out.println(str);	//순서가 X
		}
		System.out.println();
		System.out.println("< toArray를 이용한 출력 >");	//return타입 : object
		Object[] arr = set.toArray();
		for(int i =0; i < arr.length; i++) {
			System.out.println(arr[i]);	
		}
		
		/*
		 * Iterator(순환객체) 주요메소드
		 * 	- hasNext() : 뒤에 데이터가 있는지 물어보기
		 * 	- next() 	: 데이터 접근
		 */
		System.out.println();
		System.out.println(" < Iterator을 이용한 출력 > ");
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next()); 	//next해서 접근해야해!! 꼭!! 
		}
		

	}

}
