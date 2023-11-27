package com.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.person.dao.PersonDAO;
import com.person.dto.Person;

@RestController
public class PersonController {
	@Autowired
	PersonDAO personDAO;
	
	@PostMapping("/person")
	public Person saveData(@RequestBody Person person)
	{
		return personDAO.savePerson(person);
	}

}
