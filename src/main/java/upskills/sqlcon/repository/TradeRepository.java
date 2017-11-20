package upskills.sqlcon.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import upskills.sqlcon.model.Trade;


public interface TradeRepository extends CrudRepository<Trade, Integer> {
	
	public List<Trade> findByUserId(int userId);
	
}
