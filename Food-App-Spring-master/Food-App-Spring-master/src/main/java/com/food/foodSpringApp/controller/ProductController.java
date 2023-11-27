package com.food.foodSpringApp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.foodSpringApp.dao.ProductDao;
import com.food.foodSpringApp.dto.Product;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductDao productDao;
	
	@PostMapping
	public Product saveProduct(@RequestBody Product product)
	{
		return productDao.saveProduct(product);
	}
	
	@GetMapping("{id}")
	public Product getByProductId(int id)
	{
		Optional<Product> op=productDao.getProductById(id);
		if(op.isEmpty())
		{
			return null;
		}
		else
		{
			return op.get();
		}
	}
	
	

}
