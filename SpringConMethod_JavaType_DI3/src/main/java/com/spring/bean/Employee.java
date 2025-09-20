package com.spring.bean;

public class Employee {

	private String name;
	private int id;
	private double salary;
	private BankDetail bankDetail;

	public Employee(String name, int id, double salary, BankDetail bankDetail) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.bankDetail = bankDetail;
	}

	public void display() {
		System.out.println("name :" + name);
		System.out.println("id :" + id);
		System.out.println("salary :" + salary);
		System.out.println("bankDeatail :" + bankDetail);
	}

}
