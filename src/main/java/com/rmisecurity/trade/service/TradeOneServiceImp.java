package com.rmisecurity.trade.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rmisecurity.trade.model.TradeOneModel;
import com.rmisecurity.trade.repositary.TradeOneRepositary;


@Service
public class TradeOneServiceImp implements TradeOneService {

	@Autowired
	private TradeOneRepositary tradeRepo;
	
	@Override
	public void saveTradeStock(TradeOneModel m) {
		
		tradeRepo.save(m);
		// TODO Auto-generated method stub
		
	}


}
