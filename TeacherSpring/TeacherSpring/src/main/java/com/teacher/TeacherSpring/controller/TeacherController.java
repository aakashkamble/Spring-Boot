package com.teacher.TeacherSpring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.teacher.TeacherSpring.dao.TeacherDAO;
import com.teacher.TeacherSpring.dto.Teacher;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController

public class TeacherController {
	@Autowired
	TeacherDAO teacherDAO;
	
	@PostMapping("/teachers")
	public Teacher saveData(@RequestBody Teacher teacher)
	{
		return teacherDAO.saveTeacher(teacher);
	}

	@GetMapping("/getData/{id}")
	@ApiOperation(value = "Get a greeting message", response = String.class)
	public Teacher getById(@PathVariable int id)
	{
		Optional<Teacher> op=teacherDAO.getByTeacherId(id);
		
		if(op.isEmpty())
		{
			return null;
		}
		else
		{
			return op.get();
		}
	}
	@GetMapping("/getAll")
	public List<Teacher> getAllData()
	{
		return teacherDAO.getAll();
	}
	@PutMapping("/update")
	public Teacher updateTeacherData(@RequestBody Teacher teacher)
	{
		return teacherDAO.updateTeacher(teacher);
	}
	@DeleteMapping("/delete")
	public String deleteTeacherById(@RequestParam int id)
	{
		Optional<Teacher> tOptional=teacherDAO.getByTeacherId(id);
		if(tOptional.isPresent())
		{
			teacherDAO.deleteById(id);
			return "Teacher id is deleted";
		}
		else
		{
			return "Data is not found";
		}
	}
}
