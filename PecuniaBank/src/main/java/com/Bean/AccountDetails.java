package com.Bean;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Account")
public class AccountDetails {
	@Id   //primary Key
	@Column(length=12)  //length of column      
	private long accountId;
	@Column(length=15)
	private String branch;
	@Column(length=15)
	private String accountType;
	@Column(length=8)
	private long amount;
	@Column
	private Date lastTransaction;
	
	
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public Date getLastTransaction() {
		return lastTransaction;
	}
	public void setLastTransaction(Date lastTransaction) {
		this.lastTransaction = lastTransaction;
	}
	public AccountDetails(long accountId, String branch, String accountType, long amount, Date lastTransaction) {
		super();
		this.accountId = accountId;
		this.branch = branch;
		this.accountType = accountType;
		this.amount = amount;
		this.lastTransaction = lastTransaction;
	}
	
	

}
