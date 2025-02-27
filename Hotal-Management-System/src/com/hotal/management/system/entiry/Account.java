package com.hotal.management.system.entiry;

import com.hotal.management.system.enums.AccountStatus;

public class Account {
	private String id;
	private String pasword;
	private AccountStatus status;
	
	public boolean resetPassword() {return true;};
}
