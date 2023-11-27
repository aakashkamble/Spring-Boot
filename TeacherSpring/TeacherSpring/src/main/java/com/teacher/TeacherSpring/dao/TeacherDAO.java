package com.teacher.TeacherSpring.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.teacher.TeacherSpring.dto.Teacher;
import com.teacher.TeacherSpring.repository.TeacherRepository;

@Repository
public class TeacherDAO {
	@Autowired
	TeacherRepository repo;
	
	
	public Teacher saveTeacher(Teacher teacher)
	{
		return repo.save(teacher);
	}
	
	public Optional<Teacher> getByTeacherId(int id)
	{
		return repo.findById(id);
	}
	
	public List<Teacher> getAll()
	{
		return repo.findAll();
	}
	
	public Teacher updateTeacher(Teacher teacher)
	{
		return repo.save(teacher);
	}
	
	public void deleteById(int id)
	{
		repo.deleteById(id);
	}

}
