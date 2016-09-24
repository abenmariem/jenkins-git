package springmvc.java.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import springmvc.java.domain.BlogPost;
import springmvc.java.service.BlogPostService;

public class WordPressBlogPostServiceImpl implements BlogPostService{

	private static final Logger LOGGER = LoggerFactory.getLogger(WordPressBlogPostServiceImpl.class);
	
	public void savePost(BlogPost post) {
		
		LOGGER.debug("WordPressBlogPostServiceImpl : savePost called");
		
	}

}
