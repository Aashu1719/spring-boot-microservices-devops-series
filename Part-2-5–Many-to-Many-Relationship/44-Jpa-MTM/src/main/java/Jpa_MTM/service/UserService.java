package Jpa_MTM.service;

import Jpa_MTM.entity.Role;
import Jpa_MTM.entity.User;
import Jpa_MTM.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserService
{
    @Autowired
    private UserRepo userRepo;

    public void saveUser()
    {
        Role r1 = new Role();
        r1.setRoleName("Admin");

        Role r2 = new Role();
        r2.setRoleName("Manager");

        User u = new User();
        u.setUname("Ashok");
        u.setGender("Male");

        // set roles to user
        u.setRoles(Arrays.asList(r1, r2));

        // save parent
        userRepo.save(u);
    }
}
