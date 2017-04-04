package com.kd.example.designpattern.servicelocator;

public class EmailService extends MessagingService {

	public EmailService(String name) {
		super(name);
	}

	@Override
	public void execute() {
		System.out.println("Email Sent successfully...");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmailService other = (EmailService) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
