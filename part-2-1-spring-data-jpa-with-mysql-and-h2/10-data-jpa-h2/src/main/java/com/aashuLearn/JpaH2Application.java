package com.aashuLearn;

import com.aashuLearn.entity.Employee;
import com.aashuLearn.repository.EmpRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaH2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JpaH2Application.class, args);

		EmpRepository empRepository = context.getBean(EmpRepository.class);

		Employee emp = new Employee();
		emp.setEsal(1000.00);
		emp.setEname("Aashu");

		Employee save = empRepository.save(emp);

		System.out.println("Record Saved...");

		System.out.println(save);
	}

}
