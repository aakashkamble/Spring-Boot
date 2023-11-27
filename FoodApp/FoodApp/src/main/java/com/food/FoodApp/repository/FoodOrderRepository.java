package com.food.FoodApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.FoodApp.dto.FoodOrder;

public interface FoodOrderRepository extends JpaRepository<FoodOrder, Integer> {

}
