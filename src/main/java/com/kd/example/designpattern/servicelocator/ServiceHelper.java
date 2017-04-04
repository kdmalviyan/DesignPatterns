package com.kd.example.designpattern.servicelocator;

public class ServiceHelper {
	public static ServiceType getServiceByName(String name) {
		for (ServiceType serviceEnum : ServiceType.values()) {
			if (serviceEnum.getName().equalsIgnoreCase(name)) {
				return serviceEnum;
			}
		}
		return null;
	}

	public static ServiceType getServiceByID(int id) {
		for (ServiceType serviceEnum : ServiceType.values()) {
			if (serviceEnum.getId() == id) {
				return serviceEnum;
			}
		}
		return null;
	}
}
