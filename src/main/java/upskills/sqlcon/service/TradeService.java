package upskills.sqlcon.service;

import java.util.List;

import upskills.sqlcon.model.Trade;

public interface TradeService {
	
	public void createTrade(Trade trade);
	
	public void deleteTrade(Trade trade);
	
	public void updateTrade(Trade trade);
	
	public List<Trade> getAllTrade(); 
	
	public Trade getTradeByNb(int nb);
	
	public List<Trade> getTradeByUserId(int userId);
}
