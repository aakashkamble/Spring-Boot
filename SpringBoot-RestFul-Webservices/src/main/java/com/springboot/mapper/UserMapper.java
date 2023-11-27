package com.springboot.mapper;

import com.springboot.DTO.UserDTO;
import com.springboot.entity.User;

public class UserMapper {
	
	//convert User JPA Entity into User DTO
	public static UserDTO mapToUserDTO(User user) {
		
		UserDTO userDTO=new UserDTO(
				user.getId(),
				user.getFirstName(),
				user.getLastName(),
				user.getEmail()
				);
		return userDTO;
	}
	
	//Convert UserDTO into User JPA Entity
	
//	public static User mapToUser(UserDTO userDTO) {
//		User user=new User(
//				userDTO.getId(),
//				userDTO.getFirstName(),
//				userDTO.getLastName(),
//				userDTO.getEmail()
//				);
//		return user;
//	}

	public static User mapToUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		User user=new User(
				userDTO.getId(),
				userDTO.getFirstName(),
				userDTO.getLastName(),
				userDTO.getEmail()
				);
		return user;
	}
	

}
