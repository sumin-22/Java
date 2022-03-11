
public class HomeworkMain08 {

	public static void main(String[] args) {
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
