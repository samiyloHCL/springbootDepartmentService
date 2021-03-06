package com.example.demo;

import java.util.concurrent.Executor;

import org.apache.tomcat.util.threads.ThreadPoolExecutor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.example.demo.service.QuoteService;

@EnableAsync
@EnableScheduling
@SpringBootApplication
public class SpringBootDepartmentMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDepartmentMicroserviceApplication.class, args);
		
		
	}
	
	@Bean
	public QuoteService getQuoteService() {
		return new QuoteService();
	}
	
	@Bean
	public Executor taskExecutor() {
		
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		
		executor.setCorePoolSize(2);
		executor.setMaxPoolSize(2);
		executor.setQueueCapacity(500);
		executor.setThreadNamePrefix("Tara Thread");
		executor.initialize();
		
		return executor;
	}

}
