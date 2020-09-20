package com.Service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Bean.AccountDetails;
import com.Bean.Transactions;
import com.Dao.PassbookDao;

public class PassbookServiceImpl {
	//Use case for Printing Passbook
	@Autowired
	private PassbookDao dao;

	public List<Transactions> printPassbook(long accountId) 
	{
		List<Transactions>  productsList=dao.fetch(accountId); 
		return productsList;
		
	}
	
	public List<Transactions> accountSummary(Long accountId, Date startDate, Date endDate)
		{
			List<Transactions> accountSummary=dao.getTransations(accountId, startDate, endDate);
			return accountSummary;
		}

}
