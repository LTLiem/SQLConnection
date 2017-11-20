package upskills.sqlcon.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upskills.sqlcon.model.Issue;
import upskills.sqlcon.repository.IssueRepository;
import upskills.sqlcon.service.IssueService;


@Service("IssueService")
public class IssueServiceImpl implements IssueService {
	
	@Autowired
	private IssueRepository issueRepository;

	public void createIssue(Issue issue) {
		issueRepository.save(issue);		
	}

	public void deleteIssue(Issue issue) {
		issueRepository.delete(issue);		
	}

	public void updateIssue(Issue issue) {
		issueRepository.save(issue);		
	}

	public List<Issue> getAllIssue() {
		List<Issue> issueList = new ArrayList<Issue>();
		issueRepository.findAll().forEach(issueList::add);
		return issueList;
	}

	public Issue getIssueById(int id) {
		return issueRepository.findOne(id);
	}
	
	public List<Issue> getIssueByUserId(int userId) {
		return issueRepository.findByUserId(userId);
	}

}
