package com.cg.BiteBeeFoodApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.BiteBeeFoodApplication.entity.Orders;
import com.cg.BiteBeeFoodApplication.entity.User;
import com.cg.BiteBeeFoodApplication.repository.OrderRepository;

@Service
public class OrderServices {
	@Autowired
	OrderRepository repo;
	public void saveOrder(Orders order) {
		repo.save(order);
	}
	public void updateOrder(int id,Orders order) {
		Orders o=repo.findById(id).get();
		o.setoName(order.getoName());
		o.setoPrice(order.getoPrice());
		o.setoQuantity(order.getoQuantity());
		o.setOrderDate(order.getOrderDate());
		o.setTotalAmount(order.getTotalAmount());
		o.setUser(order.getUser());
		repo.save(o);
	}
	public void deleteOrder(int id) {
		repo.deleteById(id);
	}
	public List<Orders> getOrders(){
		List<Orders> list=repo.findAll();
		return list;
	}
	public List<Orders> getOrdersForUser(User user){
		return repo.findOrderByUser(user);
	}
	public Orders getOrder(int id) {
		Orders order=repo.findById(id).get();
		return order;
	}

}
