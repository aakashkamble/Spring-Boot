package com.food.FoodApp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.food.FoodApp.dto.FoodOrder;
import com.food.FoodApp.repository.FoodOrderRepository;
import com.food.FoodApp.repository.ItemRepository;

public class FoodOrderDao {
	@Autowired
	FoodOrderRepository foodOrderRepo;

	@Autowired
	ItemRepository iteamRepo;

	public FoodOrder saveFoodOrder(FoodOrder foodOrder) {
		return foodOrderRepo.save(foodOrder);
		 
	}

	public Optional<FoodOrder> getFoodOrderById(int id) {
		return foodOrderRepo.findById(id);
	}

	public List<FoodOrder> getAllFoodOrder() {
		return foodOrderRepo.findAll();
	}

	public FoodOrder updateFoodOrder(FoodOrder foodOrder) {
		return foodOrderRepo.save(foodOrder);
	}

	public void deleteFoodOrder(int id) {
		foodOrderRepo.deleteById(id);
	}

}
