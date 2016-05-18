package personsManagement.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import personsManagement.config.DomainAndPersistanceConfig;
import personsManagement.entities.Person;
import personsManagement.managers.IPersonManager;

@SpringBootApplication
public class PersonDaoBusinessApplication {

	public static void main(String[] args) {

		// on prépare la configuration
		SpringApplication app = new SpringApplication(DomainAndPersistanceConfig.class);
		app.setLogStartupInfo(false);
		// on la lance
		ConfigurableApplicationContext context = app.run(args);
		
		IPersonManager personManager;
		Person person;
		try{
			// métier
			personManager =context.getBean(IPersonManager.class);
			
//			Person person = (Person) new Person("Mohamed", "Ben Mohamed", "/photos/mohamed.jpg", "/cv/mohamed.pdf").build(1L, 1L);
			
			person= (Person) personManager.addPerson("Mohamed", "Ben Mohamed", "/photos/mohamed.jpg", "/cv/mohamed.pdf").build(1L, 1L);
			
		}
		catch (Exception ex) {
			System.out.println("Exception : " + ex.getCause());
			ex.printStackTrace();
		}
		
		// fermeture du contexte Spring
		context.close();
		
	}
}
