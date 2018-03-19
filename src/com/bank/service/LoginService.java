package com.bank.service;

import java.util.List;

import com.bank.entity.PrimaryAccount;

public interface LoginService {

	String loginCheck(String customerID, String password);
	public List <PrimaryAccount> getAccount(String accountID);

}
