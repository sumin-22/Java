package kr.ac.kopo.day08.extend;

//	관리자는 사원의 한 형태라는 조건 부합 => 상속 관계 표현
public class Manager02 extends Employee {

	Employee[] empList;		//관리사원목록
	
	public Manager02() {}
	
	Manager02(String name, int salary, String grade, Employee[] empList){
		super(); 
		this.name = name;		// private사용 시 this쓰면 에러남
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
				
	}
	@Override
	void info() {
		super.info();	//Manager02랑 Employee에도 info가 존재하기때문
		System.out.println("사원명 : " + name + ", 연봉 : " + salary + "만원, 직급 : " + grade);
		System.out.println("-------------------------------------");
		System.out.println("\t관리사원 목록");
		System.out.println("-------------------------------------");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("-------------------------------------");
	}
	

}
