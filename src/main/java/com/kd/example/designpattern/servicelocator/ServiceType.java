package com.kd.example.designpattern.servicelocator;

public enum ServiceType {

	EMAIL_SERVICE("EmailService", 1), SMS_SERVICE("SMSService", 2);
	private String name;
	private int id;

	ServiceType(String name, int id) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
