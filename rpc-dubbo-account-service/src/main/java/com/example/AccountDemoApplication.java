package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
/*@ComponentScan("com.example")*/
@ImportResource({"classpath:config/spring-context.xml"})
public class AccountDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountDemoApplication.class, args);
		
	}

}
