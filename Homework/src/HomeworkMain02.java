import java.util.Scanner;

public class HomeworkMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 - 100 사이의 정수를 입력 :");
		int num1 = sc.nextInt();
		System.out.print("2 - 10 사이의 정수를 입력 :");
		int num2 = sc.nextInt();
		
		System.out.println("<1 ~ " + num1 + " 사이의 " + num2 +"의 배수를 제외한 정수 출력>");
		for (int i =1; i <= num1; i++) {
			if (i % num2 != 0) {
				System.out.print(i + " ");
			}
		}

	}

}
