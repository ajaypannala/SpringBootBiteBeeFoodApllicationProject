package com.cg.BiteBeeFoodApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.BiteBeeFoodApplication.entity.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products,Integer>{
	public Products findByPname(String pname);

}
