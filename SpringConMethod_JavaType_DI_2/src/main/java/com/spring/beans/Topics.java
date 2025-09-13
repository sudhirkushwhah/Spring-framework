package com.spring.beans;

public class Topics {
	private String topic_Name1;
	private String topic_Name2;
	private String topic_Name3;
	private String topic_Name4;
	private String topic_Name5;

	public Topics(String topic_Name1, String topic_Name2, String topic_Name3, String topic_Name4, String topic_Name5) {
		this.topic_Name1 = topic_Name1;
		this.topic_Name2 = topic_Name2;
		this.topic_Name3 = topic_Name3;
		this.topic_Name4 = topic_Name4;
		this.topic_Name5 = topic_Name5;
	}

	@Override
	public String toString() {
		return  topic_Name1 + "\n" + topic_Name2 + "\n" + topic_Name3 + "\n" + topic_Name4 + "\n" + topic_Name5;
	}

}
