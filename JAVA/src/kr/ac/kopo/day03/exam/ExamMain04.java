package kr.ac.kopo.day03.exam;

public class ExamMain04 {

	public static void main(String[] args) {
		
		for(int i =1; i <=5; i++){
			int num = 0;
			num += i;
				for(int j = 1; j <=5 ; j++) {
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
	}
}
