package com.ty.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.FoodOrder;
import com.ty.dto.Item;

public class GetFoodById {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		FoodOrder order = entityManager.find(FoodOrder.class, 1);
		System.out.println("FoodOrder id is :" + order.getId());
		System.out.println("FoodOrder Address is :" + order.getAddress());
		System.out.println("FoodOrder Customer name is :" + order.getCustomerName());
		System.out.println("FoodOrder Phno is :" + order.getPhno());
		System.out.println("-------------------------");

		List<Item> item = order.getItem();
		if (!item.isEmpty()) {
			for (Item i : item) {
				System.out.println("Item id is :" + i.getId());
				System.out.println("Item Cost is :" + i.getCost());
				System.out.println("Item Name is :" + i.getName());
				System.out.println("Item  Quantity is :" + i.getQuantity());

				System.out.println("-------------------------");

			}
		}
	}
}