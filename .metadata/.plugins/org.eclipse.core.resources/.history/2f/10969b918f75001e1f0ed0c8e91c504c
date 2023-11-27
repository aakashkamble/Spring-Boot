package com.example.Loginpage1.controller;
import com.example.Loginpage1.model.*;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Loginpage1.Service.userservice;
import com.example.Loginpage1.model.Login;
@CrossOrigin("*")

@RestController
@RequestMapping("/login")
public class LoginControlller {
	
@Autowired 
 userservice userService ;


@PostMapping("/create")
public Login save(@RequestBody Login login) {
	return userService.savedata(login);
	

}
@GetMapping("/getData")
public List<Login> getAll(){
	return userService.getLogindetails();
}

@DeleteMapping("/delete")
public void delete(int id){
	 userService.delete(id);
	 
}
@PostMapping(path = "/auth")
public ResponseEntity<?> Login(@RequestBody Login login)
{
System.out.println(login.getUsename());
Login userDetail = null;
String responce="";
int status=403;
try {
	  userDetail=userService.checkLogindetails(login.getUsename(), login.getPassword());
	  responce="Login successfully";
	  status=200;
	 
}catch(Exception e) {
	System.out.println(e);
	responce="Invalid Login Details";
	
}

return ResponseEntity.status(status).body(responce);


}
}
