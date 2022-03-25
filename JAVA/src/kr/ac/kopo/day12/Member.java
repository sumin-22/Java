package kr.ac.kopo.day12;

import java.util.Objects;

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
	public int hashCode() {
		return Objects.hash(name, phone);
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Member other = (Member) obj;
//		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
//	}

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
