package upskills.sqlcon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upskills.sqlcon.model.TradeIssueMap;
import upskills.sqlcon.repository.TradeIssueMapRepository;
import upskills.sqlcon.service.TradeIssueMapService;


@Service("TradeIssueMapService")
public class TradeIssueMapServiceImpl implements TradeIssueMapService {

	@Autowired
	private TradeIssueMapRepository tradeIssueMapRepository;
	
	public void createTradeIssueMap(TradeIssueMap tradeIssue) {
		tradeIssueMapRepository.save(tradeIssue);
	}

	public void deleteTradeIssueMap(TradeIssueMap tradeIssue) {
		tradeIssueMapRepository.delete(tradeIssue);
	}

	public void updateTradeIssueMap(TradeIssueMap tradeIssue) {
		tradeIssueMapRepository.save(tradeIssue);
	}
	

}
