package com.spring.beans;

public class Entity {
	private int numberOfSets;
	private int numberOfWheels;
	private int capacity;

	public Entity(int numberOfSets, int numberOfWheels, int capacity) {
		this.numberOfSets = numberOfSets;
		this.numberOfWheels = numberOfWheels;
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Available sets :" + numberOfSets + ",  wheels :" + numberOfWheels + " capacity :" + capacity;
	}
}
