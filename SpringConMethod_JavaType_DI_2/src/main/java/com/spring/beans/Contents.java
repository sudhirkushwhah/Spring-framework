package com.spring.beans;

public class Contents {
	private int content_No;
	private String contentWise;
	private Topics topics;

	public Contents(int content_No, String contentWise, Topics topics) {
		this.content_No = content_No;
		this.contentWise = contentWise;
		this.topics = topics;
	}

	@Override
	public String toString() {
		return content_No + " " + contentWise +" \n"+ " topics :" + topics;
	}

}
