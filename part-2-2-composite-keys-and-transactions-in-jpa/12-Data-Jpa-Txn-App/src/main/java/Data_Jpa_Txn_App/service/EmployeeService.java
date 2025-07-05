package Data_Jpa_Txn_App.service;

import Data_Jpa_Txn_App.entity.Address;
import Data_Jpa_Txn_App.entity.Emp;
import Data_Jpa_Txn_App.repo.AddrRepo;
import Data_Jpa_Txn_App.repo.EmpRepo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Getter
@Setter
public class EmployeeService
{
    private EmpRepo empRepo;
    private AddrRepo addrRepo;

    @Transactional(rollbackFor = Exception.class)
    public void saveData()
    {
        Emp emp = new Emp();
        emp.setEname("Ram");
        emp.setEsal(35000.00);

        Emp saves = empRepo.save(emp);

        int i = 10/0;

        Address address = new Address();
        address.setCity("Prayag");
        address.setState("UP");
        address.setCountry("In");
        address.setType("Permanent");

        address.setEmpId(saves.getEid());

        addrRepo.save(address);
    }
}
