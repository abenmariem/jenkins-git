package spring.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import spring.java.EmailConfig;
import spring.java.service.BlogPostService;
import spring.java.service.impl.BlogPostServiceImpl;
import spring.java.service.impl.WordPressBlogPostServiceImpl;

@Configuration
@ComponentScan(basePackages={"spring.java"})
@Import(value={EmailConfig.class})
public class ApplicationConfig {

	//default name of the bean is method name
	@Bean
	public BlogPostService blogPostService(){
		return new BlogPostServiceImpl();
	}
	
	@Bean
	public BlogPostService wordpressBlogPostService(){
		return new WordPressBlogPostServiceImpl();
	}
	
	
}
