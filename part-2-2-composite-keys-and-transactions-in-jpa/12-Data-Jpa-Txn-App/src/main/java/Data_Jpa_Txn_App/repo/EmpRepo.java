package Data_Jpa_Txn_App.repo;

import Data_Jpa_Txn_App.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Emp, Integer> {
}
