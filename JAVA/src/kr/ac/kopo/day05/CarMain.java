package kr.ac.kopo.day05;

// 실행클래스
public class CarMain {

	public static void main(String[] args) {
		
		//new 클래스명();		클래스명 대문자로 써주기!
		Car c = new Car(); 
		c.name = "소나타";	// 문자열은 new 쓰지 않아도 됨
		
		Car c2 = new Car();
		c2.name = "k9";
		
		System.out.println("첫번째 자동차 명 : " + c.name);
		System.out.println("두번째 자동차 명 : " + c2.name);

	}

}
