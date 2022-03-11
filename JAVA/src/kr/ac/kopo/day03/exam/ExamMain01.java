package kr.ac.kopo.day03.exam;

/*
 	
 */


public class ExamMain01 {

	public static void main(String[] args) {
		
		//***** 를 출력하고 싶다. 어떻게 하면 될까용?
		// ctrl + alt + 아래 화살표 :복붙
		// ctrl + d :지우기 
		// Alt 키 누르고 위아래로 옮길 수 있음
		
//		for(int i = 1; i <=5; i++){
//			System.out.print("*");
//			System.out.println();
//		}
		
		
//		for(int i = 1;i <=10 ; i++) {		//while(true)가 무한루프 for문은 for( ; ;) 형태
											//일반적으로는 i를 사용
//		for(int i = 10; i>=1 ; i--) {
//		for(int i = 0; i <= 9; i++) {
//		for(int i = 5; i <= 14 ; i++) {
//			System.out.println("Hello");
//		}
		
	
		// *****를 반복해서 출력하려면?
		
//		for (int i = 1; i <= 3; i++){ 
//		System.out.print("*****\n");
//		}
		
//		for (int i = 1; i <=3; i++) {
			
//			for (int j = 1; j <=5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		int num = 5;
		for (int i =1; i <=5; i++) {
			System.out.print(num--);
		}
		System.out.println();
		
		for (int j = 1; j <=5; j++) {
			System.out.print(6-j);
		}
		System.out.println();
		
		for(int k = 5; k >=1; k-- ) {
			System.out.print(k);
		}
		
		

	}

}
