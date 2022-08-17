package com.ty.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.FoodOrder;
import com.ty.dto.Item;

public class SaveFood {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		FoodOrder order = new FoodOrder();
		order.setPhno(821785221);
		order.setAddress("Basavanagudi");
		order.setCustomerName("sonu");

		Item item1 = new Item();
		item1.setName("Dhosa");
		item1.setQuantity(1);
		item1.setCost(80);

		Item item2 = new Item();
		item2.setName("poori");
		item2.setQuantity(3);
		item2.setCost(40);

		List<Item> item = new ArrayList<Item>();
		item.add(item1);
		item.add(item2);

		order.setItem(item);
		transaction.begin();
		entityManager.persist(order);
		entityManager.persist(item1);
		entityManager.persist(item2);

		transaction.commit();
		System.out.println("data stored");

	}
}
