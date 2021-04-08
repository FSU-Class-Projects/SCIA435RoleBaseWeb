package edu.fsu.scia435.bootstrap;


import edu.fsu.scia435.model.Role;
import edu.fsu.scia435.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    RoleService roleService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent){

        Role role = new Role();
        role.setName("ROLE_FACULTY");
        role.setDescription("Faculty");

        roleService.save(role);
    }
}
