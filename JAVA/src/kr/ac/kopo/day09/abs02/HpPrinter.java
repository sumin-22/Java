package kr.ac.kopo.day09.abs02;

public class HpPrinter extends Printer {
	
	public void hpPint() {
		System.out.println("HP프린터에서 출력중...");
	}

	@Override
	public void print() {
		System.out.println("HP프린터에서 프린트중...");
	}
	

}
