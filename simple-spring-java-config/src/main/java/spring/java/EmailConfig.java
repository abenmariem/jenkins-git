package spring.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.java.service.EmailService;
import spring.java.service.impl.EmailServiceImpl;

@Configuration
public class EmailConfig {

	@Bean
	public EmailService emailService(){
		return new EmailServiceImpl();
	}
	
}
