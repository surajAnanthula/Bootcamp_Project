package com.Dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Bean.Transactions;


public interface PassbookDao extends JpaRepository<Transactions, Long>{

	List<Transactions> fetch(long accountId);
	
	@Query("select * from Transactions * where account_Id=?1 and start_Date=?2 and end_Date=?3")
	List<Transactions> getTransations(long accountId, Date startDate, Date endDate);

}
