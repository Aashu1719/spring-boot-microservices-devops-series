package com.aashu.learn.repository;

import com.aashu.learn.entity.Product;
import com.aashu.learn.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer>
{
}