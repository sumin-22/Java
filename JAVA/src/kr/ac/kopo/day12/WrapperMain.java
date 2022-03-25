package kr.ac.kopo.day12;

/*
 * 기본자료형을 멤버변수로 가지는 클래스
 * 논리값, 숫자, 실수, 문자, 문자열을 레퍼런스 타입으로 만들어주는 클래스
 * 
 * 기본자료형		Wrapper Class
 * boolean		Boolean
 * char			Character
 * byte			Byte
 * short		Short
 * int			Integar
 * long			Long
 * float		Float
 * double		Double
 * 
 * class Boolean{
 * 		private boolean value;
 */

public class WrapperMain {

	public static void main(String[] args) {
		
		int i = 100;
		Integer i2 = new Integer(100);
		Integer i3 = 100;	//auto boxing
		int i4 = new Integer(100);	//auto unboxing
		
		System.out.println(Integer.parseInt("123") + 100);		//기본자료형
		System.out.println(Integer.valueOf("123")+ 100);		//리턴타입: 레퍼런스의 integer
		//제너릭은 무조건 레퍼런스만 되기 때문에 기본자료형을 이용하려면 wrapper class를 이용해야한다 

	}

}
