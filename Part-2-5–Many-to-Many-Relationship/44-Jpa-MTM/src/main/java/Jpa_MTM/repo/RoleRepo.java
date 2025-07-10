package Jpa_MTM.repo;

import Jpa_MTM.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Integer>
{
}
