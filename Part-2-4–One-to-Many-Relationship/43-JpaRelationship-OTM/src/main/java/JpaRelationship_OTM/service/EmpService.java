package JpaRelationship_OTM.service;

import JpaRelationship_OTM.entity.Address;
import JpaRelationship_OTM.entity.Employee;
import JpaRelationship_OTM.repo.AddrRepo;
import JpaRelationship_OTM.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class EmpService
{
    @Autowired
    private EmpRepo empRepo;

    @Autowired
    private AddrRepo addrRepo;

    public void saveEmp()
    {
        // one emp can have multiple addreess

        Address a1 = new Address();
        a1.setCity("GNT");
        a1.setState("AP");
        a1.setCountry("India");
        a1.setAddressType("Permanent");

        Address a2 = new Address();
        a2.setCity("HYD");
        a2.setState("TG");
        a2.setCountry("India");
        a2.setAddressType("Present");

        Employee e = new Employee();
        e.setEmpName("Aashu");
        e.setEmpSalary(5000.00);


        // associating emp with address
        a1.setEmployee(e);
        a2.setEmployee(e);

        // associate address with emp
        e.setAddr(Arrays.asList(a1, a2));

//        save parent record
        empRepo.save(e);

    }


//    =================================================================

    public void saveAdd()
    {
        // one emp can have multiple addreess

        Address a1 = new Address();
        a1.setCity("GNT");
        a1.setState("AP");
        a1.setCountry("India");
        a1.setAddressType("Permanent");

        Address a2 = new Address();
        a2.setCity("HYD");
        a2.setState("TG");
        a2.setCountry("India");
        a2.setAddressType("Present");

        Employee e = new Employee();
        e.setEmpName("Aashu");
        e.setEmpSalary(5000.00);


        // associating emp with address
        a1.setEmployee(e);
        a2.setEmployee(e);

        // associate address with emp
        e.setAddr(Arrays.asList(a1, a2));

//        save parent record(address record)
        empRepo.save(e);
        addrRepo.save(a1);
        addrRepo.save(a2);

    }



//    get parent record(employee record)
    public void getEmployee()
    {
        empRepo.findById(1);
    }

//    fetch child only (address record)
    public  void getAddress()
    {
        addrRepo.findById(1);
    }

//    delete the parent record
    public void deleteEmp()
    {
        empRepo.deleteById(1);
    }

}
