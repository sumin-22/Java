package kr.ac.kopo.day06;

class ExamMethod{
	
	int getSum(int a, int b){
		return a+b;
	}
}

public class MethodMain03 {

	public static void main(String[] args) {
		
		ExamMethod exam = new ExamMethod();
		int sum = exam.getSum(10, 20);
		System.out.println("10 + 20 = " + sum);
		

	}

}
