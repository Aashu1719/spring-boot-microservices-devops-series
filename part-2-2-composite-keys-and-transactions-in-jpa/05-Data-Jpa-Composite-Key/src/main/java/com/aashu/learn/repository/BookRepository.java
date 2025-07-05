package com.aashu.learn.repository;
import com.aashu.learn.entity.Book;
import com.aashu.learn.entity.BookPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, BookPk>
{
}