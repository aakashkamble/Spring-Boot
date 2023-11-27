package com.springboot.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.springboot.DTO.UserDTO;
import com.springboot.entity.User;
import com.springboot.exception.ErrorDetails;
import com.springboot.exception.ResourceNotFoundException;
import com.springboot.service.UserService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService service;
	
	
	@PostMapping("/createUser")
	public ResponseEntity<User> createUserDetails(@RequestBody User user) {
		 
		User saveUser= service.createUser(user);
		return new ResponseEntity<>(saveUser,HttpStatus.CREATED);
		 
		 

		
	}
	

	
	@PostMapping("/createUserDTO")
	public ResponseEntity<UserDTO> createUserDTO(@Valid @RequestBody UserDTO userDTO){
		UserDTO savedUser=service.createUserDTO(userDTO);
		return new ResponseEntity<UserDTO>(savedUser,HttpStatus.OK);
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<User> getUserId(@PathVariable("id") long userid) {
		User user=service.getUserById(userid);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@GetMapping("/getByUserDTOId/{id}")
	public ResponseEntity<UserDTO> getUserDTOId(@PathVariable("id") long userid) {
		UserDTO user=service.getUserDTOById(userid);
		return new ResponseEntity<UserDTO>(user,HttpStatus.OK);
	}
	@GetMapping("/getAll")
	public ResponseEntity<List<User>> getAll(){
		List<User> list= service.getAllUsers();
		return new ResponseEntity<List<User>>(list,HttpStatus.OK); 
	}
	
	@GetMapping("/getAllUserDTO")
	public ResponseEntity<List<UserDTO>> getAllUserDTO(){
		List<UserDTO> list= service.getAllUserDTO();
		return new ResponseEntity<List<UserDTO>>(list,HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<User> updateUser(@PathVariable("id") long userId,@Valid @RequestBody User user){
		user.setId(userId);
		User updatedUser=service.updateUser(user);
		return new ResponseEntity<>(updatedUser,HttpStatus.OK);
	}
	
	@PutMapping("/updateDTO/{id}")
	public ResponseEntity<UserDTO> updateUserDTO(@PathVariable("id") long userId,@RequestBody UserDTO user){
		user.setId(userId);
		UserDTO updatedUser=service.updateUserDTO(user);
		return new ResponseEntity<>(updatedUser,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") long userId){
		service.deleteUser(userId);
		return new ResponseEntity<>("User delete Sucessfully",HttpStatus.OK);
	}

	
	
//	@ExceptionHandler(ResourceNotFoundException.class)
//	public ResponseEntity<ErrorDetails> handleResourceNotFoundException( ResourceNotFoundException exception,WebRequest webRequest){
//		
//		ErrorDetails errorDetails=new ErrorDetails(
//				
//				LocalDateTime.now(),
//				exception.getMessage(),
//				webRequest.getDescription(false),
//				"USER_NOT_FOUND"
//				
//				);
//		
//		return new ResponseEntity<ErrorDetails>(errorDetails,HttpStatus.NOT_FOUND);
//		
//	}
}
