package com.student.studentSpring.dao;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.studentSpring.dto.Student;
import com.student.studentSpring.repository.StudentRepository;

@Repository
public class StudentDAO {
	
	StudentRepository repo;
	
	public Student saveEmployee(Student emp)
	{
		return repo.save(emp);
	}
	
	
	public List<Student> getAll()
	{
		return repo.findAll();
	}

	public void deletedate() {
		repo.deleteAll();
	}

	

}
