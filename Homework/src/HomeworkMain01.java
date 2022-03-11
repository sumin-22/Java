import java.util.Scanner;

public class HomeworkMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 - 100 사이의 정수를 입력 : ");
		int num = sc.nextInt();
		
		for(int i =1; i <= num; i++) {
			System.out.print(i + " ");
		}
		

	}

}
