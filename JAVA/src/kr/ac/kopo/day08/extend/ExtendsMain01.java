package kr.ac.kopo.day08.extend;

public class ExtendsMain01 {

	public static void main(String[] args) {
		Employee e = new Employee("김태형", 3300, "사원");
		Employee e2 = new Employee("전정국", 3500, "사원");
		Employee e3 = new Employee("민윤기",4200, "대리");
		Employee e4 = new Employee("정호석", 4300, "대리");
		Employee e5 = new Employee("김남준", 5200, "과장");
		
		Employee [] empList = {e, e4, e5};
//		Manager01 m = new Manager01("김석진", 9000, "부장", empList);
//		Manager02 m = new Manager02("김석진", 9000, "부장", empList);
		Manager03 m = new Manager03("김석진", 9000, "부장", empList);
		
		e.info();
		e2.info();
		e3.info();
		e4.info();
		e5.info();
		
		m.info();
				

	}

}
