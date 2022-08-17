package com.ty.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Bus;
import com.ty.dto.Organization;

public class GetTheOrganizationById {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		Organization organization = entityManager.find(Organization.class, 1);
		System.out.println("Organization Id is :" + organization.getId());
		System.out.println("Organization  Name is :" + organization.getName());
		System.out.println("Organization Address is :" + organization.getAddress());
		System.out.println("----------------------");

		List<Bus> bus = organization.getBus();
		if (!bus.isEmpty()) {
			for (Bus b : bus) {
				System.out.println("Bus Id is :" + b.getId());
				System.out.println("Bus Capacity is :" + b.getCapacity());
				System.out.println("Bus Type is :" + b.getType());

				System.out.println("----------------------");

			}
		}

	}
}
