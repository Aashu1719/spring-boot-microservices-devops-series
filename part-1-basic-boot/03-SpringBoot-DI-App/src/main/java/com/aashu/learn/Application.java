package com.aashu.learn;

import com.aashu.learn.service.ReportService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

	ReportService reportService =  context.getBean(ReportService.class);
	reportService.printName(100);

	}
}
