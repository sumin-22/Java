package kr.ac.kopo.day07;

public class Member {
	//멤버변수
	String name; // = "알수없음" <- 이것도 가능 (바뀌지 않는 값을 때만 가능) 
	int age;
	String bloodType;
	
	Member() {
		/*this*/name = "알수없음"; // 생략가능 
		age = -1;
		bloodType = " 알수없음";
	}
	
	Member(String name){
		this.name = name;
		age = -1;
		bloodType = "알수없음";
	}
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
		bloodType = "알수없음";
	}
	
	Member(String name, int age, String bloodType){	//지역변수 name, 멤버변수 name이 있음  지금 이건 지역변수임
		this.name = name; // 멤버변수와 지역변수의 이름이 같아 구분이 어려움. 이를 위해 this를 사용. this.멤버변수 = 지역변수
		this.age = age;
		this.bloodType = bloodType;
	}  
	
	void info() {
		System.out.println("이름 : "+ name + ", 나이 : "+ age +", 혈액형 : " + bloodType);
		// name age bloodtype은 지역 변수 X
	}

}
