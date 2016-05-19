package personsManagement;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import personsManagement.web.boot.PersonWebapiV1Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PersonWebapiV1Application.class)
@WebAppConfiguration
public class PersonWebapiV1ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
