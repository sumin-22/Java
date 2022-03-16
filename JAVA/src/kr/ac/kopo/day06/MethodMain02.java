package kr.ac.kopo.day06;

class 고양이 {
	void 잠을잔다() {
		System.out.println("고양이가 잠을 잡니다");
	}
	void 운다() {
		System.out.println("고양이가 냐-옹합니다");
	}
}

class Method{
	void call() {
		System.out.println("call() 메소드 호출 ... ");
	}
	void call(int i) {
		System.out.println("call(int) 메소드 호출 ...");
	}
	void call(double d) {
		System.out.println("call(double) 메소드 호출 ...");
	}
	void call(String str, int n) {		// String과 int 순서도 중요
		System.out.println("call(String, int) 메소드 호출 ...");
	}
}

public class MethodMain02 {


	public static void main(String[] args) {
		
		Method m = new Method();
		m.call();
		m.call(10);
		m.call(12.30);
		m.call("hello", 5);
		
		
		고양이 나비 = new 고양이();	//고양이 한마리 만들기!
		
		나비.운다();	//객체명.메소드명
		나비.잠을잔다();
	}

}
