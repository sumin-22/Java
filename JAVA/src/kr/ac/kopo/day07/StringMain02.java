package kr.ac.kopo.day07;

public class StringMain02 {

	public static void main(String[] args) {
		
	//	String str = "Hello";	//상수 문자열
	//	String str2 = "Hello";
		String str = new String("Hello");
		String str2 = new String("HELLO");
		
		
		if (str == str2) {
			System.out.println("주소비교 : 같다");
		} else {
			System.out.println("주소비교 : 다르다");
		}
		
		if(str.equals(str2) == true) {
			System.out.println("문자열 비교 : 같다");
		} else {
			System.out.println("문자열 비교 : 다르다");
		}
		System.out.println("대소문자 관계없이 문자열 비교 : " + str.equalsIgnoreCase(str2));
		
		String [] names = {"김태형", "김태형", "전정국", "민윤기", "박지민","김석진","정호석","김남준"};
		
		System.out.println("< 전체 이름이 김태형인 사람 출력 >");
		for(String name : names) {
			if(name.equals("김태형")) {
				System.out.println(name);
			}
		}
		System.out.println("< 성이 김씨인 사람 출력 >");
		for(String name : names) {
			if(name.startsWith("김")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 이름이 태형인 사람 출력 >");
		for(String name : names) {
			if(name.endsWith("태형")){
				System.out.println(name);
			}
		}
		System.out.println("< 이름에 민이 포함된 사람 출력 >");
		for(String name : names) {
			if(name.contains("민")) {
				System.out.println(name);
			}
		}
		
		str = "apple";
		str2 = "banana";
		
		int compare = str.compareTo(str2);
		if(compare == 0) {
			System.out.println(str + " == " + str2);
		} else if(compare > 0) {
			System.out.println(str + " > " + str2);
		} else {
			System.out.println(str + " < " + str2);
		}

	}

}
