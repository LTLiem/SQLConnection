package upskills.sqlcon.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upskills.sqlcon.model.TradeHeader;
import upskills.sqlcon.model.TradeHeaderKey;
import upskills.sqlcon.repository.TradeHeaderRepository;
import upskills.sqlcon.service.TradeHeaderService;

@Service("TradeHeaderService")
public class TradeHeaderServiceImpl implements TradeHeaderService {

	@Autowired
	private TradeHeaderRepository tradeHeaderRepository;
	
	public void createTradeHeader(TradeHeader tradeHeader) {
		tradeHeaderRepository.save(tradeHeader);
	}

	public void deleteTradeHeader(TradeHeader tradeHeader) {
		tradeHeaderRepository.delete(tradeHeader);
	}

	public void updateTradeHeader(TradeHeader tradeHeader) {
		tradeHeaderRepository.save(tradeHeader);
	}

	public List<TradeHeader> getAllTradeHeader() {
		List<TradeHeader> tradeHeaderList = new ArrayList<TradeHeader>();
		this.tradeHeaderRepository.findAll()
				.forEach(tradeHeaderList::add);
		return tradeHeaderList;
	}

	public TradeHeader getTradeHeaderByFGT(TradeHeaderKey key) {
		return tradeHeaderRepository.findByTradeHeaderKey(key);
	}

}
