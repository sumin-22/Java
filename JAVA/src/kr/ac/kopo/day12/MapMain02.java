package kr.ac.kopo.day12;

import java.util.HashMap;
import java.util.Map;

/*
 * 	alt + shift + s 누른 후
 * 	-> c 선택: 기본생성장
 * 	-> o 선택: 매개변수 생성자
 * 	-> r 선택: getter/setter 메소드
 * 	-> v 선택: override/implement 메소드
 * 	-> s 선택: toString() 메소드
 */

class Member{
	private String name;
	private String phone;
	
	public Member(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
}

class Car {
	private String name;
	private String carNumber;
	
	public Car(String name, String carNumber) {
		super();
		this.name = name;
		this.carNumber = carNumber;
	}
}

public class MapMain02 {

	public static void main(String[] args) {
		
		Map<Member, Car> map = new HashMap<>();
		
		map.put(new Member("김태형", "010-1995-1230"), new Car("소나타", "97가 0901"));
		map.put(new Member("전정국", "010-1997-0901"), new Car("K5", "95나 1230"));

	}

}
