package com.cg.BiteBeeFoodApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.BiteBeeFoodApplication.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer>{
	public Admin findByAdminEmail(String email);

}
