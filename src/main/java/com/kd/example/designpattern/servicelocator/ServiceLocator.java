package com.kd.example.designpattern.servicelocator;

public class ServiceLocator {
	private static ServiceCache cache = new ServiceCache();

	public static Service getService(ServiceType serviceType) {
		Service service = cache.getService(serviceType);
		if (service == null) {
			System.out.println("Not found in cache...");
			service = InitialContext.lookup(serviceType);
			cache.addService(service);
		} else {
			System.out.println("Service from cache..");
		}
		return service;
	}
}
