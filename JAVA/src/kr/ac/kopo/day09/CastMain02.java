package kr.ac.kopo.day09;

public class CastMain02 {

	public static void main(String[] args) {
		
//		Child01 c = new parent(); 	//오류 : 자식의 공간이 더 크기 때문
//		Child01 c = (Child01)new parent();	//부모의 공간만 잡혀 있기 때문
		
		parent p = new Child01();	//묵시적 형변환 
		Child01 c = (Child01)p;		//명시적 형변환 가능. 그래야 p가 부모와 자식의 공간을 가지기 때문
		
		c.sleep();
		c.study();
		
	}

}
