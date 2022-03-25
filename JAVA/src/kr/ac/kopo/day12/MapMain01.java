package kr.ac.kopo.day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
 * Map : key, value 쌍의 집합, key에 대한 중복 (X)
 * 	- HashMap
 * 	- TreeMap
 */

public class MapMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		
		map.put("V", "1230");
		map.put("JK", "0901");
		map.put("SUGA", "0309");
		map.put("JIN", "1204");
		
		System.out.println("< 패스워드 변경 서비스 >");
		System.out.print("아이디 입력 : ");
		String id  =sc.nextLine();
		
		if(!map.containsKey(id)) {
			System.out.println("입력하신 ["+id+"]는 존재하지 않습니다");
			System.out.println("서비스를 종료합니다");
			return; //메인 return시 종료
		}
		
		System.out.print("기존 패스워드를 입력하세요 : ");
		String password = sc.nextLine();
		if(!map.get(id).equals(password)) {			//문자열이라 동등비교 X
			System.out.println("패스워드가 일치하지않습니다");
			System.out.println("서비스를 종료합니다");
			return;
		}
		
		System.out.print("변경할 패스워드르 입력하세요 : ");
		String newpassword = sc.nextLine();
		map.put(id, newpassword);
		System.out.println("패스워드가 변경되었습니다");
		
		
		
		
		
		
		
		

	}

}
