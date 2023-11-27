package com.food.FoodApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.FoodApp.dto.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
