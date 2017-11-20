package upskills.sqlcon.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upskills.sqlcon.model.Role;
import upskills.sqlcon.repository.RoleRepository;
import upskills.sqlcon.service.RoleService;

@Service("RoleService")
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleRepository roleRepository;

	public void createRole(Role role) {
		roleRepository.save(role);
	}

	public void deleteRole(Role role) {
		roleRepository.delete(role);
	}

	public void updateRole(Role role) {
		roleRepository.save(role);
	}

	public List<Role> getAllRole() {
		List<Role> roleList = new ArrayList<Role>();
		roleRepository.findAll().forEach(roleList::add);
		return roleList;
	}

	public Role getRoleByName(String name) {
		return roleRepository.findByName(name);
	}
	
}
