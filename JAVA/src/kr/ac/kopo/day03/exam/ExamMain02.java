package kr.ac.kopo.day03.exam;

public class ExamMain02 {

	public static void main(String[] args) {
		/* 
		 11111
		 22222
		 33333
		 44444
		 55555
		 */
		System.out.println("------1번-------");
		
		int num1 = 1;
		for (int i =1; i <=5; i++) {
			for (int j=1; j <=5; j++) {
				System.out.print(num1);
			}
			num1++;
			System.out.println();
		}
		
		
		/* 
		 12345
		 12345
		 12345
		 12345
		 12345
		 */
		System.out.println("-------2번-------");
		
		for(int i =1; i <=5; i++) {
			for(int j =1; j <=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		/*
		 12345
		 23456
		 34567
		 45678
		 56789
		 */
		
		System.out.println("-------3번-------");
		
		for(int i =1; i <=5; i++) {
			int num2 =0;
			num2 += i;
				for( int j = 1; j <=5; j++) {
					System.out.print(num2);
					num2++;
				}
				System.out.println();
		}
		
		/*
		 56789
		 45678
		 34567
		 23456
		 12345
		 */
		
		System.out.println("-------4번-------");
		
		for (int i = 1; i<=5;i++) {
			int num3 = 6;
			num3 -= i;
				for(int j = 1; j <=5; j++) {
					System.out.print(num3);
					num3++;
				}
				System.out.println();
		}
		
		
		/*
		 *
		 **
		 ***
		 ****
		 *****
		 */
		
		System.out.println("-------5번-------");
		
		for( int i =1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		
		/*
		 *****
		 ****
		 ***
		 **
		 *
		 */
		
		System.out.println("-------6번-------");
		
		for(int i =0; i<5; i++) {
			for (int j = 1; j <=5-i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		/*
		 *****
		  ****
		   ***
		    **
		     *
		 */
		
		
		System.out.println("-------7번-------");
		
		for(int i =1; i <=5; i++) {
			for (int j = 1; j<=5; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		
		
		/*
		     *
		    **
		   ***
		  ****
		 *****
		 */
		
		System.out.println("-------8번-------");

		for(int i = 1; i <=5; i++) {
			for(int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		
		/*
		 *
		 **
		 ***
		 ****
		 *****
		 ****
		 ***
		 **
		 *
		 */
		
		System.out.println("-------9번-------");
		
		for (int i =1; i <=9; i++) {
			if(i<=5) {
				for(int j =1; j<=i; j++) {
					System.out.print("*");
				}
			} else {
				for(int j =1; j <=10-i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		/* 
		 *****
		 ****
		 ***
		 **
		 *
		 **
		 ***
		 ****
		 *****
		 */
		
		System.out.println("-------10번-------");
		
		for(int i =1; i <=9; i++) {
			if(i<=5){
				for(int j=1; j <=6-i; j++) {
					System.out.print('*');
				}
				
			} else {
				for (int j =1; j<=i-4; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		/*
		 *****
		  ****
		   ***
		    **
		     *
		    **
		   ***
		  ****
		 *****
		 */
		
		System.out.println("-------11번-------");
		
		for(int i=1; i <=9; i++) {
			if(i<=5) {
				for (int j = 1; j <=i-1; j++) {
					System.out.print(" ");				
				}
				for (int k = 1; k <= 6-i; k++) {
					System.out.print("*");
				}
			}else {
				for (int j=1; j<= 9-i; j++) {
					System.out.print(" ");
				}
				for (int k=1; k<=i-4; k++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
