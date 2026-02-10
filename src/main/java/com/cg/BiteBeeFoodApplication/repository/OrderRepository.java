package com.cg.BiteBeeFoodApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.BiteBeeFoodApplication.entity.Orders;
import com.cg.BiteBeeFoodApplication.entity.User;

@Repository
public interface OrderRepository extends JpaRepository<Orders,Integer>{
	public List<Orders> findOrderByUser(User user);

}
