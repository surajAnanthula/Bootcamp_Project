package com.Bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Passbook")
public class Transactions {
	@Id   //primary
	@Column(length=5)  //length of column 
	private int transactionId;
	@Column(length=10)
	private String transactionType;
	@Column(length=10)
	private float transactionAmount;
	@Column
	private Date transDate;
	@Column
	private String transFrom;
	@Column
	private String transTo;
	
	public Date getTransDate() {
		return transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	public String getTransFrom() {
		return transFrom;
	}
	public void setTransFrom(String transFrom) {
		this.transFrom = transFrom;
	}
	public String getTransTo() {
		return transTo;
	}
	public void setTransTo(String transTo) {
		this.transTo = transTo;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public float getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(float transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	
	
	
	

}
