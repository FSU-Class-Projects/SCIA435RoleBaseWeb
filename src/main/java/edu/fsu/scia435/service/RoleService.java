package edu.fsu.scia435.service;

import edu.fsu.scia435.model.Role;
import edu.fsu.scia435.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    RoleRepository roleRepository;

    public Role save(Role role){
        return roleRepository.save(role);
    }
}
