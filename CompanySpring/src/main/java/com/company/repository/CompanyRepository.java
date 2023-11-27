package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.dto.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
