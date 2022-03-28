package kr.ac.kopo.day13;

import java.io.Serializable;

public class Icecream implements Serializable {
	
	private String name;
	private int price;
	
	
	@Override
	public String toString() {
		return "Icecream [name=" + name + ", price=" + price + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Icecream(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Icecream() {
		super();
		
	}
	

}
