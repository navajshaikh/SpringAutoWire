package com.autowire;

public class Car {
	
	
	private String name;
	private int quantity;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", quantity=" + quantity + "]";
	}
	
	

}
