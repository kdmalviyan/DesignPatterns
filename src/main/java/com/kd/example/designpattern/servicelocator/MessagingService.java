package com.kd.example.designpattern.servicelocator;

public abstract class MessagingService implements Service {
	public MessagingService(String name) {
		super();
		this.name = name;
	}

	protected String name;

	@Override
	public String getName() {
		return name;
	}
}
