package upskills.sqlcon.repository;

import org.springframework.data.repository.CrudRepository;

import upskills.sqlcon.model.TradeIssueMap;
import upskills.sqlcon.model.TradeIssueMapKey;

public interface TradeIssueMapRepository extends CrudRepository<TradeIssueMap, TradeIssueMapKey> {

}
