package com.ty.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Mobile;
import com.ty.dto.Sim;

public class GetMobileById {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		Mobile mobile = entityManager.find(Mobile.class, 1);
		System.out.println("Mobile id is :" + mobile.getId());
		System.out.println("Mobile name is :" + mobile.getName());
		System.out.println("Mobile cost is :" + mobile.getCost());
		System.out.println("-------------------------");
		System.out.println("sim1 id is :" + mobile.getSim().get(1).getId());
		System.out.println("sim1 provider is :" + mobile.getSim().get(1).getProvider());
		System.out.println("sim1 imrc is :" + mobile.getSim().get(1).getImrc());
		System.out.println("-------------------------");
		

//		List<Sim> sims = mobile.getSim();
//		if (!sims.isEmpty()) {
//			for (Sim s : sims) {
//				System.out.println("Sim id is :" + s.getId());
//				System.out.println("Sim provider is :" + s.getProvider());
//				System.out.println("sim imrc is :" + s.getImrc());
//				System.out.println("-------------------------");
//
	}

}
