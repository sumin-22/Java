package kr.ac.kopo.day07;

/*
 * 생성자 특징
 * 1. 클래스명과 동일
 * 2. 반환형이 없다
 * 3. 디폴트 생성자 지원 : 클래스내에 생성자가 존재하지 않은 경우 JVM이 자동으로 생성
 * 4. 오버로딩 지원
 * 5. 멤버변수 속성의 초기화
 */
class Car {
	
	Car(){	// 앞에 void를 붙이면 출력 X 생성자가 아닌 일반 메소드로 인식하기 때문
		System.out.println("Car() 생성자 호출 ... ");
	}
	
	Car(int i, String s){
		System.out.println("Car(int, String) 생성자 호출...");
	}
	
}

public class ConstructorMain01 {

	public static void main(String[] args) {
		
		Car c = new Car();   // 생성자 호출. JVM이 디폴트 생성자 자동으로 만들어줌. class내에 생성자가 하나도 정의되어 있지 않은 경우.
		Car c3 = new Car(1230, "V");

	}

}
