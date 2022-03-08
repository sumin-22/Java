package kr.ac.kopo.day01;

public class VariableMain03 {

	public static void main(String[] args) {
		
		int a;
		byte b =10;
		
		a = b; //byte가 int보다 크기가 작기 때문에 묵시적 형변환 가능
		b = (byte)a;
		
		
		

	}

}
