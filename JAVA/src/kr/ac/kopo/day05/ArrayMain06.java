package kr.ac.kopo.day05;

public class ArrayMain06 {

	public static void main(String[] args) {
	//	int[][] arr = new int [3][4];                      //2차원 배열
		int [] ar01 = new int [4];
		int [] ar02 = new int [4];
		int [] ar03 = new int [4];
		int [][] arr = {ar01, ar02, ar03};
		System.out.println("arr : " + arr);
		System.out.println("arr.length : " + arr.length);
		
		for(int i =0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j =0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
