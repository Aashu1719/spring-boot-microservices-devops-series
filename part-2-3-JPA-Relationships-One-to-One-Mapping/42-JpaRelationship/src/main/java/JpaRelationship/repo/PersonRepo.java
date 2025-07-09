package JpaRelationship.repo;

import JpaRelationship.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Integer>
{
}
