package com.kd.example.designpattern.servicelocator;

public class ServiceLocatorDemo {
	public static void main(String args[]) {
		Service emailService = ServiceLocator.getService(ServiceType.EMAIL_SERVICE);
		Service smsService = ServiceLocator.getService(ServiceType.SMS_SERVICE);
		emailService.execute();
		smsService.execute();

		emailService = ServiceLocator.getService(ServiceType.EMAIL_SERVICE);
		smsService = ServiceLocator.getService(ServiceType.SMS_SERVICE);
		emailService.execute();
		smsService.execute();
	}
}
