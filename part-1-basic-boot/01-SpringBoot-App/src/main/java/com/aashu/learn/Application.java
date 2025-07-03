package com.aashu.learn;

import com.aashu.learn.util.PwdUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public PwdUtils getInstance()
	{
//		logic
		return new PwdUtils();
	}
}
