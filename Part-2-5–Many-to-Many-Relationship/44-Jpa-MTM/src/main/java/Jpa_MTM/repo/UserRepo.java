package Jpa_MTM.repo;

import Jpa_MTM.entity.Role;
import Jpa_MTM.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer>
{
}
