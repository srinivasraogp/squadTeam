package com.rmisecurity.trade.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rmisecurity.trade.model.Stock;
import com.rmisecurity.trade.service.TradeTwoService;

@CrossOrigin
@RestController
@RequestMapping("rmisecurity") 
public class TradeController {
	
	
	@Autowired
	private TradeTwoService tradeTwoService;

	@GetMapping("/version")
	public String version() {
		return "10.10.10:10";
	}

	@GetMapping("/{userid}")
	public List<Stock> getSummary(@PathVariable("userid") String userName) { 
		
		
		List<Stock> listOfStock = new ArrayList<>(); 
		Stock stock = null;
		Map<String, Integer> tradeStock =  tradeTwoService.getTradeStock(userName);
		 for (Map.Entry<String,Integer> entry : tradeStock.entrySet()) {
			 stock = new Stock();
			 stock.setStockName(entry.getKey());
			 stock.setQuantity(entry.getValue().toString());
			 listOfStock.add(stock);
		 }

		return listOfStock;
	}
}
