package upskills.sqlcon.repository;

import org.springframework.data.repository.CrudRepository;

import upskills.sqlcon.model.TradeHeader;
import upskills.sqlcon.model.TradeHeaderKey;

public interface TradeHeaderRepository extends CrudRepository<TradeHeader, TradeHeaderKey>{
	
	public TradeHeader findByTradeHeaderKey(TradeHeaderKey key);
	
}
