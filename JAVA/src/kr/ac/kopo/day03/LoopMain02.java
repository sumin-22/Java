package kr.ac.kopo.day03;


/*
 	while(expr){
 		statement;
 	}
 	
 	for (init; expr; incre) {
 		statement;
 	}
 	
 	
 	
 	aaa:	while() {
 				switch() {
 					case 'A':
 					  break:
 					  break aaa;
 			}
 	-> 중첩된 반복문을 한번에 빠져나갈 때 break를 사용할 수 있다. 뒤에 이름을 붙여주어야 한다
 */

public class LoopMain02 {

	public static void main(String[] args) {
		
		int cnt = 1;
		do {
			System.out.println("Hello");
			cnt ++;
		} while(cnt <=5);	
		
		/*
		  int cnt = 1;
		  while (cnt <=5) {
		  	System.out.println("Hello");
		  	++cnt
		  }
		  		 */
		System.out.println("--------------------");
		
		
		cnt = 1;
		while(true) { //true는 무한루프
			System.out.println("Hello");
			++ cnt;
			
			if (cnt > 5) {
				break;    //switch문 이외에 반복문에도 break사용 가능. while 문을 빠져나오게 된다.
			}
		}
	}
}
