package kr.ac.kopo.day07;

public class StringMain01 {

	public static void main(String[] args) {
		
		String str = new String("Hello");
		char[] chars = {'H', 'e','l','l','o'};
		String str2 = new String(chars);
		byte[] bytes = {65, 67, 98, 120};
		String str3 = new String(bytes);
		
		System.out.println("str : " + str);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);

	}

}
