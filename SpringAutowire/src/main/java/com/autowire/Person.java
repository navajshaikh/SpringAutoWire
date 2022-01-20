package com.autowire;

public class Person {
	
	private String name;
	private int salary;
	private Car car;
	private BankDetails bankDetails;
	@Override
	public String toString() {
		return "Person [name=" + name + ", salary=" + salary + ", car=" + car + ", bankDetails=" + bankDetails + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public BankDetails getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
	public Person(String name, int salary, Car car, BankDetails bankDetails) {
		super();
		this.name = name;
		this.salary = salary;
		this.car = car;
		this.bankDetails = bankDetails;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
