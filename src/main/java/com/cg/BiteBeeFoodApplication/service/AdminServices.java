package com.cg.BiteBeeFoodApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.BiteBeeFoodApplication.entity.Admin;
import com.cg.BiteBeeFoodApplication.repository.AdminRepository;

@Service
public class AdminServices {
	@Autowired
	AdminRepository repo;
	public void addAdmin(Admin admin) {
		repo.save(admin);
	}
	public void deleteAdmin(int id) {
		repo.deleteById(id);
	}
	public List<Admin> getAll(){
		List<Admin> list=repo.findAll();
		return list;
	}
	public Admin getAdmin(int id) {
		Admin admin=repo.findById(id).get();
		return admin;
	}
	public void update(Admin admin, int id) {
		Admin a=repo.findById(id).get();
		a.setAdminEmail(admin.getAdminEmail());
		a.setAdminName(admin.getAdminName());
		a.setAdminPassword(admin.getAdminPassword());
		repo.save(a);
		
	}
	public Admin findByAdminEmail(String email) {
		return repo.findByAdminEmail(email);
	}
	public boolean validateAdminCredentials(String email,String password) {
		Admin admin=repo.findByAdminEmail(email);
		if(admin!=null&&admin.getAdminPassword().equals(password)) {
			return true;
		}
		return false; 
	}
	

}
