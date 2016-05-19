package personsManagement.web.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import personsManagement.web.config.AppConfig;

@SpringBootApplication
public class PersonWebapiV1Application {

	public static void main(String[] args) {
		
		SpringApplication.run(AppConfig.class, args);
		
	}
}
