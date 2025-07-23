package Web_mvc.repo;

import Web_mvc.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer>
{
    public List<Book> findByActiveSw(String status);
}
