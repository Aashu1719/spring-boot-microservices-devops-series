package Data_Jpa_Txn_App.repo;

import Data_Jpa_Txn_App.entity.Address;
import Data_Jpa_Txn_App.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddrRepo extends JpaRepository<Address, Integer> {
}
