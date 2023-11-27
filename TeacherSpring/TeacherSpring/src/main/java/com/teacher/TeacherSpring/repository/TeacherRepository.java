package com.teacher.TeacherSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teacher.TeacherSpring.dto.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
