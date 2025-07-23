package Web_mvc.service;

import Web_mvc.entity.Book;
import Web_mvc.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService
{
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findByActiveSw("Y");
    }

    @Override
    public boolean saveBook(Book book) {

        book.setActiveSw("Y");

        Book savedBook = bookRepository.save(book);

        return savedBook.getBookId() != null;

//        if (savedBook.getBookId() != null)
//        {
//            return true;
//        }
//        return false;
    }

    @Override
    public void deleteBook(Integer bookId)
    {
//        Hard delete
//        bookRepository.deleteById(bookId);

//        soft delete
        Optional<Book> findById = bookRepository.findById(bookId);
        if (findById.isPresent())
        {
            Book book = findById.get();
            book.setActiveSw("N");
            bookRepository.save(book);
        }
    }

    @Override
    public Book getBookById(Integer bookId) {
        Optional<Book> findById = bookRepository.findById(bookId);
        if (findById.isPresent())
        {
            return findById.get();
        }
        return null;
    }
}
