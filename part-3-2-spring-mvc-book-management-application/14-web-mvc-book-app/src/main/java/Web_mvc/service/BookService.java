package Web_mvc.service;

import Web_mvc.entity.Book;

import java.util.List;

public interface BookService
{
    public List<Book> getAllBooks();

    public boolean saveBook(Book book);

    public void deleteBook(Integer bookId);

    public Book getBookById(Integer bookId);
}
