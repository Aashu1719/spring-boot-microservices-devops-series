package JpaRelationship.service;

import JpaRelationship.entity.Passport;
import JpaRelationship.entity.Person;
import JpaRelationship.repo.PassportRepo;
import JpaRelationship.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;

@Service
public class PersonService
{
    @Autowired
    private PersonRepo personRepo;

    @Autowired
    private PassportRepo passportRepo;

    public void savePerson()
    {
        Person person = new Person();
        person.setPersonName("Aashu");
        person.setPersonGender("Male");
        person.setPersonDb(LocalDate.now().minusYears(20));

        Passport passport = new Passport();
        passport.setPassportNum("HJSH765");
        passport.setIssueDate(LocalDate.now());
        passport.setExpDate(LocalDate.now().plusYears(10));

//        association
        person.setPassport(passport);
        passport.setPerson(person);


//      save parent
        personRepo.save(person);

    }

//        get the person(parent) data
    public void getPerson()
    {
        personRepo.findById(1);
    }

    //        get the passport(child) data
    public void getPassport()
    {
        personRepo.findById(1);
    }

    public void deletePerson()
    {
        personRepo.deleteById(1);
    }
}
