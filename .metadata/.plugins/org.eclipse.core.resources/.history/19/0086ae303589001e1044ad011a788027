package com.student.studentSpring.controller;

import

static org.junit.Assert.assertEquals;
import
 
static org.junit.Assert.assertNotNull;
import
 
static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import
 
org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.student.studentSpring.controller.StudentController;
import com.student.studentSpring.dao.StudentDAO;
import com.student.studentSpring.dto.Student;

@SpringBootTest

@AutoConfigureMockMvc

public class StudentControllerTest
{

    @Autowired   
    private MockMvc mockMvc;

    @Autowired
    private StudentDAO studentDAO;

    @Test
    public void testSaveData() throws Exception {
        Student student = new Student();
        student.setName("John Doe");
        student.setAge(23);
        student.setSalary(23000.0);

        when(studentDAO.saveEmployee(student)).thenReturn(student);

//        RequestBuilder request = MockMvcRequestBuilders.post("/add").contentType("application/json").content(asJsonString(student)).build();
//        MvcResult result = mockMvc.perform(request).andReturn();
        MockHttpServletRequest request = MockMvcRequestBuilders.get("/add").contentType("application/json").buildRequest(null);
        MvcResult result = mockMvc.perform((RequestBuilder) request).andReturn();

        assertEquals(200, result.getResponse().getStatus());
    }

    @Test

    
public void testGetAllEmployee() throws Exception {
        List<Student> students = studentDAO.getAll();

        MockHttpServletRequest request = MockMvcRequestBuilders.get("/get").buildRequest(null);
        MvcResult result = mockMvc.perform((RequestBuilder) request).andReturn();

        assertEquals(200, result.getResponse().getStatus());
        assertNotNull(result.getResponse().getContentAsString());
        assertEquals(students, result.getResponse().getContentAsString());
    }

    
    
}
