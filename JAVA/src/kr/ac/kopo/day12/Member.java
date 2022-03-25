package kr.ac.kopo.day12;

public class Member {
	
	private String name;
	private String phone;
	
	@Override
	public String toString() {
		return "Member [이름 = " + name + ", 전화번호 = " + phone + "]";
	}

	public Member(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		Member m =(Member)obj;
		if(!this.name.equals(m.name)) {
			return false;
		}
		if(!this.phone.equals(m.phone)) {
			return false;
		}
		return true;
	}
	
	

}
