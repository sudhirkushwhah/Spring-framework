package com.spring.beans;

public class PhoneConfiguration {
	private String processor_type;
	private String memory;
	private String display;

	public void setProcessor_type(String processor_type) {
		this.processor_type = processor_type;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public void setDisplay(String display) {
		this.display = display;
	}
	
	public String toString() {
		return processor_type +"\n"+ memory + "\n"+display;
	}

}
