package com.student.studentSpring.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.studentSpring.dao.StudentDAO;
import com.student.studentSpring.dto.Student;


@RestController
public class StudentController {
	@Autowired
	StudentDAO studentDAO;
	
	
	@PostMapping("/add")
	public Student saveData(@RequestBody Student emp)
	{
		return studentDAO.saveEmployee(emp);
	}
	
	
	@GetMapping("/get")
	public List<Student> getAllEmployee()
	{
		return studentDAO.getAll();
	}
	@GetMapping("/get/{id}")
	public Student getId(int id) {
		return studentDAO.getById(id);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Void> delete() {
		studentDAO.deletedate();
		return null;
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteById(int id) {
		studentDAO.deleteByIdStudentData(id);
		return null;
	}


	public Object getStatusCode() {
		// TODO Auto-generated method stub
		return null;
	}

}