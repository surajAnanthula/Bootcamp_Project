package com.Controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Bean.Transactions;
import com.Service.PassbookService;

@RestController
@RequestMapping("/passbook")
public class PassbookController {
	@Autowired
	private PassbookService serviceobj;
	
	@GetMapping("/updatepassbook/{accountId}")
	public List<Transactions> updatePassbook(@PathVariable("accountId") long accountId)
	{
		List<Transactions> p=serviceobj.updatePassbook(accountId); 					
		return p;
	}
	
	@GetMapping("/AccountSummary/{accountId}/{startDate}/{endDate}")
	public List<Transactions> accountSummary(@PathVariable Long accountId,@PathVariable Date startDate,@PathVariable Date endDate)
	{
		List<Transactions> q=serviceobj.accountSummary(accountId,startDate,endDate);
		return q;
		
	}

}
