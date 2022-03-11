package kr.ac.kopo.day03.exam;

public class ExamMain10 {

	public static void main(String[] args) {
	
		for (int i =0; i < 9; i++) {
			if (i <5) {
				for(int j =0; j < i+1; j++) {
					System.out.print("*");	
				}
			} else {
				for(int j=0; j <9-i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
