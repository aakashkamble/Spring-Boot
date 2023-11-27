package com.food.FoodApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.food.FoodApp.dao.FoodOrderDao;
import com.food.FoodApp.dto.FoodOrder;
import com.food.FoodApp.dto.Item;
import com.food.FoodApp.repository.FoodOrderRepository;

public class FoodOrderController {
	@Autowired
	FoodOrderDao foodOrderDao;

	@PostMapping
	public FoodOrder placeFoodOrder(@RequestBody FoodOrder foodOrder) {
		return foodOrderDao.saveFoodOrder(foodOrder);
	}
public FoodOrder saveFoodOrder(FoodOrder foodOrder) {
		List<Item> listOfItems = foodOrder.getItems();
		List<Item> res = new ArrayList<>();
		if (listOfItems.isEmpty()) {
			foodOrder = FoodOrderRepository.save(foodOrder);
		} else {
			foodOrder = FoodOrderRepository.save(foodOrder);
			for (Item item : listOfItems) {
				item.setFoodOrder(foodOrder);
				res.add(iteamRepo.save(iteam));
			}
			foodOrder.setItems(res);
		}
		return foodOrder;
		
		 
	}

}
