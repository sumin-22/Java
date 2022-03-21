package kr.ac.kopo.day08.extend;

//	관리자는 사원의 한 형태라는 조건 부합 => 상속 관계 표현
public class Manager03 extends Employee {

	Employee[] empList;		//관리사원목록
	
	public Manager03() {
		
	}
	
	Manager03(String name, int salary, String grade, Employee[] empList){
		super(name, salary, grade);	//초기화가 되어있을 때는 생략 불가능. 반드시 명시
		this.empList = empList;
				
	}
	@Override
	void info() {
		super.info();	//Manager02랑 Employee에도 info가 존재하기때문
//		System.out.println("사원명 : " + name + ", 연봉 : " + salary + "만원, 직급 : " + grade);
		System.out.println("-------------------------------------");
		System.out.println("\t관리사원 목록");
		System.out.println("-------------------------------------");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("-------------------------------------");
	}
	

}
