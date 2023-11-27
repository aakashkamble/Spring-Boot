package com.company.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.dto.Company;
import com.company.repository.CompanyRepository;

@Repository
public class CompanyDAO {
	@Autowired
	CompanyRepository repo;
	
	public Company saveCompany(Company company)
	{
		return repo.save(company);
	}

	public Optional<Company> getByCompanyId(int id)
	{
		return repo.findById(id);
	}
	
	public List<Company> getAll()
	{
		return repo.findAll();
	}
	
	public Company updateCompany(Company company)
	{
		return repo.save(company);
	}
	
	public void deleteById(int id)
	{
		repo.deleteById(id);
	}
}
