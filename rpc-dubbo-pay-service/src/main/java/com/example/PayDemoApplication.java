package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**mvn package  -Dmaven.test.skip=true
 * @author LS-0323
 *
 */
@SpringBootApplication
@ImportResource({"classpath:config/spring-context.xml"})
public class PayDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayDemoApplication.class, args);
	}

}
