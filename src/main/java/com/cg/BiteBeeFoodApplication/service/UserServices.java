package com.cg.BiteBeeFoodApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.BiteBeeFoodApplication.entity.User;
import com.cg.BiteBeeFoodApplication.repository.UserRepository;

@Service
public class UserServices {
	 @Autowired
	    private UserRepository userRepository;

	    /* ---------- GET ALL USERS ---------- */
	    public List<User> getAllUser() {
	        return (List<User>) userRepository.findAll();
	    }

	    /* ---------- GET USER BY ID ---------- */
	    public User getUser(int id) {
	        return userRepository.findById(id).orElse(null);
	    }

	    /* ---------- GET USER BY EMAIL ---------- */
	    public User getUserByEmail(String email) {
	        return userRepository.findUserByUemail(email);
	    }

	    /* ---------- CHECK EMAIL EXISTS (REQUIRED FOR REGISTER) ---------- */
	    public boolean existsByEmail(String email) {
	        return userRepository.existsByUemail(email);
	    }

	    /* ---------- ADD USER ---------- */
	    public void addUser(User user) {
	        userRepository.save(user);
	    }

	    /* ---------- UPDATE USER ---------- */
	    public void updateUser(User user, int id) {
	        user.setUid(id);
	        User u=userRepository.findById(id).get();
	        u.setUemail(user.getUemail());
	        u.setUname(user.getUname());
	        u.setUnumber(user.getUnumber());
	        u.setUpassword(u.getUpassword());
	        u.setOrders(user.getOrders());
	        userRepository.save(u);
	    }

	    /* ---------- DELETE USER ---------- */
	    public void deleteUser(int id) {
	        userRepository.deleteById(id);
	    }

	    /* ---------- LOGIN VALIDATION ---------- */
	    public boolean validateLoginCredentials(String email, String password) {

	        if (email == null || password == null) return false;

	        email = email.trim();
	        password = password.trim();

	        User user = userRepository.findUserByUemail(email);

	        if (user == null) return false;

	        return user.getUpassword().equals(password);
	    }
	}

////		repo.save(user);
////	}
//	 @Autowired
//	    private UserRepository userRepository;
//
//	    /* ---------- GET ALL USERS ---------- */
//	    public List<User> getAllUser() {
//	        return (List<User>) userRepository.findAll();
//	    }
//
//	    /* ---------- GET USER BY ID ---------- */
//	    public User getUser(int id) {
//	        return userRepository.findById(id).orElse(null);
//	    }
//
//	    /* ---------- GET USER BY EMAIL ---------- */
//	    public User getUserByEmail(String email) {
//	        return userRepository.findUserByUemail(email);
//	    }
//
//	    /* ---------- CHECK EMAIL EXISTS (REQUIRED FOR REGISTER) ---------- */
//	    public boolean existsByEmail(String email) {
//	        return userRepository.existsByUemail(email);
//	    }
//
//	    /* ---------- ADD USER ---------- */
//	    public void addUser(User user) {
//	        userRepository.save(user);
//	    }
//
//	    /* ---------- UPDATE USER ---------- */
//	    public void updateUser(User user, int id) {
//	        user.setUid(id);
//	        User u=userRepository.findById(id).get();
//	        u.setUemail(user.getUemail());
//	        u.setUname(user.getUname());
//	        u.setUnumber(user.getUnumber());
//	        u.setUpassword(user.getUpassword());
//	        u.setOrders(user.getOrders());
//	        userRepository.save(u);
//	    }
//
//	    /* ---------- DELETE USER ---------- */
//	    public void deleteUser(int id) {
//	        userRepository.deleteById(id);
//	    }
//
//	    /* ---------- LOGIN VALIDATION ---------- */
//	    public boolean validateLoginCredentials(String email, String password) {
//
//	        if (email == null || password == null) return false;
//
//	        email = email.trim();
//	        password = password.trim();
//
//	        User user = userRepository.findUserByUemail(email);
//
//	        if (user == null) return false;
//
//	        return user.getUpassword().equals(password);
//	    }
////	public void updateUser(User user,int id) {
////		User u=repo.findById(id).get();
////		u.setUemail(user.getUemail());
////		u.setUname(user.getUname());
////		u.setUnumber(user.getUnumber());
////		u.setUpassword(user.getUpassword());
////		u.setOrders(user.getOrders());
////		repo.save(u);
////	}
////	public void deleteUser(int id) {
////		repo.deleteById(id);
////	}
////	public boolean validateLoginCredentials(String email,String password) {
////		if(email==null||password==null) {
////			return false;
////			
////		}
////		email =email.trim();
////		password =password.trim();
////		User user=repo.findUserByUemail(email);
////		if(user==null) {
////			return false;
////		}
////		return user.getUpassword().equals(password);
////	}
//
//}
