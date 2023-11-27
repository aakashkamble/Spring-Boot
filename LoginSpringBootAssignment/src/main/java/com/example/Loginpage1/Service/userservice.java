package com.example.Loginpage1.Service;
import com.example.Loginpage1.model.*;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Loginpage1.model.Login;
import com.example.Loginpage1.repository.UserRepository;
import java.util.stream.Collectors;

@Service
public class userservice {
	
	
	UserRepository userRepository;
	
	
	public Login savedata(Login login) {
		return userRepository.save(login);
		
	}
	
//	public List<Login> getLogindetails(){
//		return userRepository.findAll();
//	} 
	public void delete(int id) {
		userRepository.deleteById(id);
	}

	public List<Login> getLogindetails() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	public Login checkLogindetails(String username,String password) throws Exception{
		// TODO Auto-generated method stub
		
//		System.out.println(userRepository.findAll().parallelStream().toList());
		if(userRepository.findAll().parallelStream().noneMatch(p -> p.getUsename().equals(username))) {
			System.out.println("userRepository " + username);
			 throw new Exception("UserName Not Found");
		} if(userRepository.findAll().parallelStream().noneMatch(p -> p.getPassword().equals(password))) {
			System.out.println("userRepository" +password);
			throw new Exception("Wrong Password");
		}
		
		if(userRepository.findAll().parallelStream().filter(p->p.getUsename().equals(username)).collect(Collectors.toList()).get(0) != null) {
			System.out.println("Else userRepository " + username);
			
		}
		
			System.out.println("UserReposistory" +password);
			return userRepository.findAll().parallelStream().filter(p -> p.getPassword().equals(password)).collect(Collectors.toList()).get(0);
		
		
		
		
	}	

}
