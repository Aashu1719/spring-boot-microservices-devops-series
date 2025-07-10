package JpaRelationship_OTM.repo;

import JpaRelationship_OTM.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee, Integer>
{
}
