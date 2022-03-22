package kr.ac.kopo.day09.abs03;

import java.util.Scanner;

public class Menu {
	
	private Scanner sc = new Scanner(System.in);
	
	public String select() {
		System.out.print("프린터를 선택하세요 (1.LG 2.SAMSUNG 3.HP) -> ");
		String type = sc.nextLine();
		return type;
	}
	
	
	public void print(String type) {
		Printer p =null;
		switch(type) {
		case "1" :
			p = new LGPrinter();
			p.print();
			break;
		case "2" :
			p  = new SamsungPrinter();
			p.print();
			break;
		case "3" :
			p = new HpPrinter();
			p.print();
			break;
		}
		if( p!= null) {			
			p.print();
		}
	}
	public void process() {
		String type = select();
		print(type);
		
	}

}
