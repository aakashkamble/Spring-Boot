package com.company.controller;

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

import com.company.dao.CompanyDAO;
import com.company.dto.Company;

@RestController
public class CompanyController {
	@Autowired
	CompanyDAO companyDAO;
	
	@PostMapping("/company")
	public Company saveData(@RequestBody Company company)
	{
		return companyDAO.saveCompany(company);
	}
	@GetMapping("/getAll")
	public List<Company> getAllData()
	{
		return companyDAO.getAll();
	}
	@GetMapping("/get/{id}")
	public Company getById(@PathVariable int id)
	{
		Optional<Company> op=companyDAO.getByCompanyId(id);
		if(op.isEmpty())
		{
			return null;
		}
		else
		{
			return op.get();
		}
	}
	@PutMapping("/update")
	public Company updateData(@RequestBody Company company)
	{
		return companyDAO.updateCompany(company);
	}
	@DeleteMapping("/delete")
	public String deleteById(@RequestParam int id)
	{
		Optional<Company> op=companyDAO.getByCompanyId(id);
		
		if(op.isPresent())
		{
			companyDAO.deleteById(id);
			return "Company Data is Deleted";
			
		}
		else
		{
			return "Data is not found";
		}
	}

}
