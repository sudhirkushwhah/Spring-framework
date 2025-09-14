package com.spring.beans;

public class Car {
	private String car_Name;
	private String car_location;
	private int total_car;
	private Entity entity;

	public Car(String car_Name, String car_location, int total_car, Entity entity) {
		this.car_Name = car_Name;
		this.car_location = car_location;
		this.total_car = total_car;
		this.entity = entity;
	}

	public void printCar() {
		System.out.println("Car :" + car_Name);
		System.out.println("current location :" + car_location);
		System.out.println("number of car :" + total_car);
		System.out.println(entity);
	}

}
