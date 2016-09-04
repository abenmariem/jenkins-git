package spring.java.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import spring.java.domain.BlogPost;
import spring.java.service.BlogPostService;

public class BlogPostServiceImpl implements BlogPostService {

	private static final Logger LOGGER = LoggerFactory.getLogger(BlogPostServiceImpl.class);
	
	@Override
	public void savePost(BlogPost post) {
		
		LOGGER.debug("BlogPostServiceImpl : savePost called");
		
	}

}
