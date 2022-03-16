package kr.ac.kopo.day06;

public class Gugudan {
	
	void print(int dan) {
		System.out.println("*** " + dan +"단 ***");
		for(int i =1; i <=9; i++) {
			System.out.printf("%d * %d = %d\n",dan, i, dan*i);
		}
	}
	
	void print() {	//오버로딩 지원
		for(int dan =2; dan <=9; dan++) {
			/*System.out.println("*** " + dan +"단 ***");
			for(int i =1; i <=9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan *i);
			}*/
			print(dan);
			
		}
		
	}

}
