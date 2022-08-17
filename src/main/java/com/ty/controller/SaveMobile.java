package com.ty.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Mobile;
import com.ty.dto.Sim;

public class SaveMobile {
	private static final String List = null;

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		Mobile mobile = new Mobile();
		mobile.setName("redmi");
		mobile.setCost(16000);
		
		Sim sim1 = new Sim();
		sim1.setImrc(333);
		sim1.setProvider("jio");
		
		Sim sim2 = new Sim();
		sim2.setImrc(444);
		sim2.setProvider("DoComo");
		
		List<Sim> sim = new ArrayList<Sim>();
		sim.add(sim1);
		sim.add(sim2);

		mobile.setSim(sim);
		transaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		transaction.commit();
		System.out.println("data stored");

	}
}
