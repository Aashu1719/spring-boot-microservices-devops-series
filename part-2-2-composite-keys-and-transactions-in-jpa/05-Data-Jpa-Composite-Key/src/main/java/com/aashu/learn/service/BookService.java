package com.aashu.learn.service;


import com.aashu.learn.entity.Book;
import com.aashu.learn.entity.BookPk;
import com.aashu.learn.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService
{
    @Autowired
    private BookRepository bookRepository;

    public void saveBook()
    {
        BookPk pk = new BookPk(102, "Java");

        Book book = new Book(1000.00, "James", pk);

        bookRepository.save(book);

        System.out.println("Record saved...");
    }

    public void getBook()
    {
        BookPk pk = new BookPk(101, "Java");
        Optional<Book> findById = bookRepository.findById(pk);
        if (findById.isPresent())
        {
            System.out.println(findById.get());
        }
    }
}
