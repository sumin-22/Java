package kr.ac.kopo.day01;

public class VariableMain03 {

	public static void main(String[] args) {
		
		int a;
		byte b =10;
		
		a = b; //byte�� int���� ũ�Ⱑ �۱� ������ ������ ����ȯ ����
		b = (byte)a;
		
		System.out.println(10 + 20);
		System.out.println(10 + 20.0); // ū ���� Ÿ���� ���󰡰� �ȴ�. 10�� int, 20.0�� double
		System.out.println(10 + (int)20.0);
		
		double d = 10 + 20.2; //10 + 20.2 ���� d�� ����. ���⼭ ������ ����ȯ�� �Ͼ��. 
		System.out.println(d);
		
		int e = 10 + (int)20.2;
		System.out.println(e);
			
		
		
		

	}

}
