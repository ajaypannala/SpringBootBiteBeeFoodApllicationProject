package com.cg.BiteBeeFoodApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cg.BiteBeeFoodApplication.entity.Products;
import com.cg.BiteBeeFoodApplication.service.ProductServices;

@Controller
public class ProductController {
	@Autowired
	ProductServices service;
	    @GetMapping("/addProduct")
	    public String addProductPage(Model model) {
	        model.addAttribute("product", new Products());
	        return "Add_Product";
	    }
	    @PostMapping("/addingProduct")
	    public String addProduct(@ModelAttribute Products product) {
	        service.addProduct(product);
	        return "redirect:/admin/services";
	    }
	    @GetMapping("/updateProduct/{id}")
	    public String updateProductPage(
	            @PathVariable int id,
	            Model model) {
	    	 Products product = service.getProductById(id);
	         model.addAttribute("product", product);
	         return "Update_Product";
	     }
	    @PostMapping("/updatingProduct/{id}")
	    public String updateProduct(
	            @PathVariable int id,
	            @ModelAttribute Products product) {

	        service.updateProduct(product, id);
	        return "redirect:/admin/services";
	    }
	    @GetMapping("/deleteProduct/{id}")
	    public String deleteProduct(@PathVariable int id) {
	        service.deleteProducts(id);
	        return "redirect:/admin/services";
	    }
	 

}
