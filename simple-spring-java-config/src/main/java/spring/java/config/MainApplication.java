package spring.java.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.java.config.ApplicationConfig;
import spring.java.domain.BlogPost;
import spring.java.service.BlogPostService;
public class MainApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		BlogPostService postService = context.getBean(BlogPostService.class);
		
//		BlogPostService postService = (BlogPostService) context.getBean("blogPostService");
		BlogPost post = new BlogPost();
		post.setTitle("My blog post");
		post.setContent("This is a good blog post");
		postService.savePost(post);
		
		((ConfigurableApplicationContext) context).close();
	}


}
