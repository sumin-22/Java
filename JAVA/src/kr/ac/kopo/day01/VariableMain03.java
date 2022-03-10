package kr.ac.kopo.day01;

public class VariableMain03 {

	public static void main(String[] args) {
		
		int a;
		byte b =10;
		
		a = b; //byte가 int보다 크기가 작기 때문에 묵시적 형변환 가능
		b = (byte)a;
		
		System.out.println(10 + 20);
		System.out.println(10 + 20.0); // 큰 수의 타입을 따라가게 된다. 10은 int, 20.0은 double
		System.out.println(10 + (int)20.0);
		
		double d = 10 + 20.2; //10 + 20.2 값이 d로 들어간다. 여기서 묵시적 형변환이 일어난다. 
		System.out.println(d);
		
		int e = 10 + (int)20.2;
		System.out.println(e);
			
		final int NUM = 100;
		System.out.println("num : " + NUM);
		
		
		char ch = '!';
		ch = '\'';
		ch = '\n';
		ch = '\\';
		System.out.println(ch);
		
		
		String path =" D:\\Lecture\\java-workspace";
		System.out.println(path);
		
		String str = "\"ab\"";
		System.out.println(str);
		
		

	}

}
