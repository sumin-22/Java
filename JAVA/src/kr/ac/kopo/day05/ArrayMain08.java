package kr.ac.kopo.day05;

public class ArrayMain08 {

	public static void main(String[] args) {
		String[] strArr = new String[3];
		
		strArr[0] = "Hello";
		strArr[1] = new String("Good");
		strArr[2] = "Bye Bye -!";
		
		for(String str : strArr) {
			System.out.println(str);
		}
	}
}
