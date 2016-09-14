package springmvc.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


//This class is our configuration class
@Configuration 
//enable spring MVC
@EnableWebMvc 
public class WebConfig extends WebMvcConfigurerAdapter {

	//add more beans, rules, etc
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		//add index mapping
		//map any url to a web page here		
		registry.addViewController("/").setViewName("index");
	}
	
	//if a string is returned by a method inside a controller, this string is a name of view
	//In order to use this functionality, we need to define an InternalResourceViewResolver
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
		
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		//maps strings to views
		// for example maps the string index to the concatenation of  prefix/index/suffix
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		
		return resolver;
	}
	
	
}
