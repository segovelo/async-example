package com.segovelo.async;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AsyncExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AsyncExampleApplication.class, args);
		
        System.out.println("\n\n\t Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        System.out.println("\n\n ===========================  Bean names =============================");
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
        System.out.println("\n\n ========================================================================");
	}

}
