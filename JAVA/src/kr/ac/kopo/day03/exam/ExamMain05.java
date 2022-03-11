package kr.ac.kopo.day03.exam;

public class ExamMain05 {

	public static void main(String[] args) {
		
		for(int i =0; i <5; i++){
			int num = 5;
			num -= i;
				for(int j = 1; j <=5 ; j++) {
				System.out.print(num);
				num++;
			}
			System.out.println();
		}

	}

}
