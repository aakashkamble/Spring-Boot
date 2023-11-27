package com.food.FoodApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.FoodApp.dto.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
