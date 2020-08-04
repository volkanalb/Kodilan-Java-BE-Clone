package com.vvv.kodilan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vvv.kodilan.model.Company;

public interface ICompanyRepository extends JpaRepository<Company, Long>{

}
