package com.ty.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Bus;
import com.ty.dto.Organization;

public class OrganizationSave {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		Organization organization = new Organization();
		organization.setName("KSRTC");
		organization.setAddress("Karnataka");

		Bus bus1 = new Bus();
		bus1.setType("ac");
		bus1.setCapacity(30);

		Bus bus2 = new Bus();
		bus2.setType("Ayravatha");
		bus2.setCapacity(40);

		List<Bus> bus = new ArrayList<Bus>();
		bus.add(bus1);
		bus.add(bus2);

		organization.setBus(bus);
		transaction.begin();
		entityManager.persist(organization);
		entityManager.persist(bus1);
		entityManager.persist(bus2);
		transaction.commit();
		System.out.println("data stored");

	}
}
