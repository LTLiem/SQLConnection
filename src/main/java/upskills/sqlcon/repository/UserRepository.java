package upskills.sqlcon.repository;

import org.springframework.data.repository.CrudRepository;

import upskills.sqlcon.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	public User findByName(String name);
}
