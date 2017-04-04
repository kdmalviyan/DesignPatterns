package com.kd.example.designpattern.servicelocator;

public class InitialContext {
	public static Service lookup(ServiceType serviceType) {
		if (ServiceType.EMAIL_SERVICE.equals(serviceType)) {
			return new EmailService(serviceType.getName());
		} else if (ServiceType.SMS_SERVICE.equals(serviceType)) {
			return new SMSService(serviceType.getName());
		}
		return null;
	}
}
