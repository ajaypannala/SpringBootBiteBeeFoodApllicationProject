package com.cg.BiteBeeFoodApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.BiteBeeFoodApplication.entity.Products;
import com.cg.BiteBeeFoodApplication.repository.ProductRepository;

@Service
public class ProductServices {
	@Autowired
	ProductRepository repo;
	
	public void addProduct(Products p) {
		repo.save(p);
	}
	public List<Products> getAllProducts(){
		List<Products> products=repo.findAll();
		return products;
	}
	public Products getProductById(int id) {
	Products product=repo.findById(id).get();
	return product;
	}
	public void deleteProducts(int id) {
		repo.deleteById(id);
	}
	public void updateProduct(Products p,int id) {
		Products product=repo.findById(id).get();
		product.setPname(p.getPname());
		product.setPprice(p.getPprice());
		product.setPdescription(p.getPdescription());
		repo.save(product);
	}
	public Products getProductByName(String name) {
		Products product=repo.findByPname(name);
		if(product!=null) {
			return product;
		}
		return null;
		
		
	}
	
	


}
