import java.util.Scanner;

public class HomeworkMain04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2 - 9단을 입력 : ");
		int dan = sc.nextInt();
		
		System.out.println("*** " + dan + "단 ***");
		for(int i =1; i <=9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i );
		}
	}
}
