package com.example.Loginpage1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Loginpage1.model.Login;
import java.util.Optional;
@Repository
public interface UserRepository extends  JpaRepository<Login, Integer>{
	
//	Boolean findOne(String usename);

}
