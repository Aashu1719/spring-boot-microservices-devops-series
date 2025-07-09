package JpaRelationship.repo;

import JpaRelationship.entity.Passport;
import JpaRelationship.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepo extends JpaRepository<Passport, Integer>
{
}
