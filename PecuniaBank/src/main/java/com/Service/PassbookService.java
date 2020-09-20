package com.Service;

import java.sql.Date;
import java.util.List;

import com.Bean.Transactions;

public interface PassbookService {

	List<Transactions> updatePassbook(long accountId);

	List<Transactions> accountSummary(Long accountId, Date startDate, Date endDate);

}
