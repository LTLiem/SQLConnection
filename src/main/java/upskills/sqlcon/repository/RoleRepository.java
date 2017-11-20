package upskills.sqlcon.repository;

import org.springframework.data.repository.CrudRepository;

import upskills.sqlcon.model.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {
	public Role findByName(String name);
}
