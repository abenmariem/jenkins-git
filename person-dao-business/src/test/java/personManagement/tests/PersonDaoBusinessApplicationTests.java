package personManagement.tests;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.common.collect.Lists;

import personsManagement.config.DomainAndPersistanceConfig;
import personsManagement.entities.Person;
import personsManagement.repositories.PersonRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DomainAndPersistanceConfig.class)
@ActiveProfiles("test")
public class PersonDaoBusinessApplicationTests {
	
	@Autowired
	private PersonRepository personRepository;

	@Before
	public void init(){
		
	}
	
	
	@After
	public void cleanUp(){
		
	}
	
	@Test
	@Transactional
	public void findAll() {
		
		Person p = new Person("kamel", "Ben kamel", "kamel.jpg", "kamel.pdf");
		personRepository.save(p);
		
		Person p2 = new Person("ali", "Ben ali", "ali.jpg", "ali.pdf");
		personRepository.save(p2);
		
		
		List<Person> list = Lists.newArrayList(personRepository.findAll());
		System.out.println("size = "+list.size());
	    Assert.assertEquals(2, list.size());
			
	}
	
	@Test
	@Transactional
	public void insertandFind() {
		
		Person p = new Person("kamel", "Ben kamel", "kamel.jpg", "kamel.pdf");
		Person savedPerson = personRepository.save(p);
		//getting the saved person
		Person foundPerson = personRepository.findOne(savedPerson.getId());
		Assert.assertEquals(foundPerson.getFirstName(),p.getFirstName());
			
	}
	
	

	
	
	
	
	

}
