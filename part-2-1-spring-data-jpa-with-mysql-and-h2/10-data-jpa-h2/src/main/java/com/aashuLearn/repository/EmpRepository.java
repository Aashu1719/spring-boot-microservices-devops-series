package com.aashuLearn.repository;

import com.aashuLearn.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Employee, Integer>
{
}
