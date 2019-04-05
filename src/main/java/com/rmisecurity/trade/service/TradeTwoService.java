package com.rmisecurity.trade.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.rmisecurity.trade.model.Stock;

@Repository
public interface TradeTwoService {

	//@Query(value = "select stock_name, user_id as user_name ,sum(unit_price) from ingdb.stockdetails group by user_id,stock_name",nativeQuery = true)
	public Map<String, Integer> getTradeStock(String userName);
	
	
	
}
