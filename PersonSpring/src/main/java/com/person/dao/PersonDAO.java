package com.person.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.person.dto.Person;
import com.person.repository.PersonRepository;
@Repository
public class PersonDAO {
	@Autowired
	PersonRepository repo;
	
	public Person savePerson(Person person)
	{
		return repo.save(person);
	}

}
