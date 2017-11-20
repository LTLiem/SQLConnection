package upskills.sqlcon.service;

import java.util.List;

import upskills.sqlcon.model.TradeHeader;
import upskills.sqlcon.model.TradeHeaderKey;


public interface TradeHeaderService {
	
	public void createTradeHeader(TradeHeader tradeHeader);
	
	public void deleteTradeHeader(TradeHeader tradeHeader);
	
	public void updateTradeHeader(TradeHeader tradeHeader);
	
	public List<TradeHeader> getAllTradeHeader(); 
	
	public TradeHeader getTradeHeaderByFGT(TradeHeaderKey key);
	
}
