package com.cg.BiteBeeFoodApplication.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int uid;
	private String uname;
	private String uemail;
	private String upassword;
	private String unumber;
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	private List<Orders> orders;
	
	
	public User(int uid, String uname, String uemail, String upassword, String unumber, List<Orders> orders) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uemail = uemail;
		this.upassword = upassword;
		this.unumber = unumber;
		this.orders = orders;
	}
	public User() {
		
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getUnumber() {
		return unumber;
	}
	public void setUnumber(String unumber) {
		this.unumber = unumber;
	}
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", uemail=" + uemail + ", upassword=" + upassword
				+ ", unumber=" + unumber + ", orders=" + orders + "]";
	}
	
	

}
