package kr.ac.kopo.day07;

import java.util.Arrays;

public class StringMain03 {

	public static void main(String[] args) {
		String str = "hello world!";
		
		/*
		for(int i =0; i < str.length(); i++) {
			if(str.charAt(i) == 'r')
				System.out.println("r위치 : " + i);
		}
		*/
		
		String search = "l";
		System.out.println(search + "위치 : " + str.indexOf(search));
		System.out.println(search + "위치 : " + str.indexOf(search,5));
	
		System.out.println("< " + search + " 위치 검색 > ");
		search = "l";
		int index = str.indexOf(search);
		while(index != -1) {
			System.out.println("시작인덱스 : " + index);
			index = str.indexOf(search, index+1);
		}
		
		str = "hello world!";
		
		String subStr = str.substring(3,8); // [3] ~ [8-1] 문자열로 변환
		System.out.println("substring(3,8) : " + subStr);
		System.out.println("substring(6) : " + str.substring(6));
		
		str = "hello" + "!!!";
		str = "hello".concat(" :)");
		System.out.println(str);
		
		String result = str.replace("l", "rr");
		System.out.println("replace(\"l\", \"rr\") : " + result);
		
		str = "    hello    ";
		System.out.printf("[%s] 길이 : %d\n", str, str.length());
		result = str.trim();
		System.out.printf("[%s] 길이 : %d\n", result, result.length());
		
		str = "Hello world!";
		System.out.println("str : "+ str);
		System.out.println("대문자 : " + str.toUpperCase());
		System.out.println("소문자 : " + str.toLowerCase());
		
		String data = "시멘틱에러 : 드라마";
		String[] bookInfo = data.split(":");
		System.out.println("split() : " + Arrays.toString(bookInfo));
		
		int num = 1230;
		int num2 = 901;
		String strNum = String.valueOf(num);
		String strNm2 = String.valueOf(num2);
		System.out.println(strNum + strNm2);
	}

}
