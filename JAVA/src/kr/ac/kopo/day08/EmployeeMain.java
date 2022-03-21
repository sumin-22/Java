package kr.ac.kopo.day08;

public class EmployeeMain {

	public static void main(String[] args) {
		
//		int totalEmployee = 0;
		
		Employee e = new Employee("김태형", 3300, "사원");
//		totalEmployee++;
		Employee e2 = new Employee("전정국", 3800, "대리");
//		totalEmployee++;
		
//		e.name =""; <= 이렇게 안하는게 좋아용
		
		e.info();
//		e.employeeCntInfo();
		e2.info();
		e2.employeeCntInfo();
		
		
		
//		System.out.println("입사한 총 사원 수 : " + totalEmployee + "명");

	}

}
