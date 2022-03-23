package kr.ac.kopo.day10;

import java.util.Random;

/*final*/ class Super{
	private /*final*/ double PI = 3.14;		//상수변수는 대문자
	
	Super(){
		PI = 3.41592;
	}
	
	/*final*/ void call() {
		System.out.println("SUPER::call()");
	}
}

class Sub extends Super{	//클래스에 final이 붙으면 부모 클래스가 될 수 없다
	void call() {
		System.out.println("SUB::call()");
	}
}

class MyRandom extends Random{

	@Override
	public int nextInt(int bound) {
		return super.nextInt(bound) + 1;	//0이 아닌 1부터의 범위
	}
	public int nextInt(int start, int end) {
		return super.nextInt(end - start) + start;
	}
	
}


//class MyStirng extends String{
//	
//}
//String 클래스는 final이라 상속 X


public class FinalMain {

	public static void main(String[] args) {
		
//		Super su = new Sub();
//		su.call();
		
		MyRandom r = new MyRandom();
		int random = r.nextInt(10);
		System.out.println(random);
		
//		Random r = new Random();
//		int random = r.nextInt(90) + 10;
//		int random = r.nextInt(10) + 1;
		
		

		
	}

}
