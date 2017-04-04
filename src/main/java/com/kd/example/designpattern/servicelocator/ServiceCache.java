package com.kd.example.designpattern.servicelocator;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author kuldeep
 *
 */
public class ServiceCache {

	public ServiceCache() {
		services = new ArrayList<Service>();
	}

	private List<Service> services;

	public Service getService(ServiceType serviceType) {
		for (Service service : services) {
			if (service.equals(serviceType)) {
				return service;
			}
		}
		return null;
	}

	public void addService(Service service) {
		if (!services.contains(service)) {
			services.add(service);
		}
	}
}
