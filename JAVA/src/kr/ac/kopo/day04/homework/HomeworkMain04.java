package kr.ac.kopo.day04.homework;

public class HomeworkMain04 {

	public static void main(String[] args) {
		
		int star =1;
		for(int i=1; i <=9; i++) {
			for (int j=1; j <=5; j++) {
				if(j < star) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			
			System.out.println();
			if (i <5) {
				star++;
			} else {
				star--;
			}
		}
				
		
		
		/*
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				for(int j =1; j <=5; j++) {
					if (j < i) {
						System.out.print("-");
					}else {
						System.out.print("*");
					}
				}
			} else {
				for (int j =1; j <=5; j++) {
					System.out.print(j < 10-i ? "-" : "*");
				}
			}
			System.out.println();
		}
		*/
		
		
		
		/*
		int space =0, star =5;
		for(int i=1; i <=9; i++) {
			
			for(int j =1; j <= space; j++ ) {
				System.out.print("-");
			}
			for (int j=1; j <= star; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			if(i <5) {
				space++;
				star--;
			} else {
				space--;
				star++;
			}
		}
		*/
		
		
		
		/*
		for(int i =1; i <=9; i++) {
			if (i <=5) {
				for(int j = 1; j <= i-1; j++) {
					System.out.print("-");
				}
				for(int j =1; j <= 6-i; j++) {
					System.out.print("*");					
				}
			} else {
				for(int j =1; j <= 9-i; j++) {
					System.out.print("-");
				}
				for(int j = 1; j <= i-4; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		 */
	}

}
