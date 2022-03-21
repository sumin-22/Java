package kr.ac.kopo.day08;

public class Employee {
	String 	name;
	int		salary;
	String 	grade;
	
	Employee(){			//기본 생성자 생성 (에러를 줄일 수 있음)
		
	}
	
	Employee(String name, int salary, String grade){
		this.name = name;
		this.salary = salary;
		this.grade = grade;
	}

}
