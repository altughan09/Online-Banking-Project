package com.bank.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_account")
public class UserAccount {

	@Id
	@Column(name="customer_ID")
	private String customerID;
	
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;

	public UserAccount() {
		
	}

	public UserAccount(String customerID, String password, String email) {
		super();
		this.customerID = customerID;
		this.password = password;
		this.email = email;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserAccount [customerID=" + customerID + ", password=" + password + ", email=" + email + "]";
	}



	

}
