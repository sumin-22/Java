package kr.ac.kopo.day11;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
	/*
	 * List : 순서 o, 중복 o
	 * - ArrayList
	 * - LinkedList
	 * 
	 * add()
	 * get()
	 * size()
	 * remove()
	 * isEmpty()
	 * contains()
	 * clear()
	 */

	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();
		list.add("V");
		list.add("JK");
		list.add("SUGA");
		list.add("JIN");
		list.add("V");
		
		
		System.out.println("전체 원소의 개수 : " + list.size() + "개");
		
		System.out.println("< PRINT > ");
		for(int i =0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("\"V\" 삭제 : " + (list.remove("V") ? "성공" : "실패"));
		System.out.println("\"V\" 삭제 : " + (list.remove("V") ? "성공" : "실패"));
		System.out.println("\"V\" 삭제 : " + (list.remove("V") ? "성공" : "실패"));
		
		System.out.println("< 1.5버전 >");
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("0번지 문자열 : " + list.get(0));
		System.out.println("0번지에 위치한 문자열 삭제 : " + list.remove(0));
		System.out.println("0번지 문자열 : " + list.get(0));
		
		for(String str : list) {
			System.out.println(str);
		}
		

	}

}
