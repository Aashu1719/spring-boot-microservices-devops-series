package JpaRelationship_OTM.repo;

import JpaRelationship_OTM.entity.Address;
import JpaRelationship_OTM.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddrRepo extends JpaRepository<Address, Integer>
{

}
