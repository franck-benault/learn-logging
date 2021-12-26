package net.franckbenault.learning.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;


public class LearningLog4j2Test {
	
	
	private static final Logger LOGGER =  LogManager.getLogger(LearningLog4j2Test.class);

	@Test
	public void testLogCreate() {
		
		Logger logger = LogManager.getLogger("MyLogger");
		logger.info("Hello1");
		LOGGER.info("Hello1");

	}
	
	
	@Test
	public void testLogLevel() {
		
		Logger logger = LogManager.getLogger("MyLogger");
		
		logger.trace("Hello3");
		LOGGER.trace("Hello3");
		
		logger.debug("Hello3");
		LOGGER.debug("Hello3");
		
		logger.info("Hello3");
		LOGGER.info("Hello3");
		
		logger.warn("Hello3");
		LOGGER.warn("Hello3");
		
		logger.error("Hello3");
		LOGGER.error("Hello3");
		
		logger.fatal("Hello3");
		LOGGER.fatal("Hello3");
		
	}
	
	@Test
	public void testLogIsDebugEnabled() {
		
		Logger logger = LogManager.getLogger("MyLogger");
		
		if(logger.isDebugEnabled()) logger.trace("Hello3");
		if(LOGGER.isDebugEnabled()) LOGGER.trace("Hello3");
		
		if(logger.isDebugEnabled()) logger.debug("Hello3");
		if(LOGGER.isDebugEnabled()) LOGGER.debug("Hello3");
		
		if(logger.isDebugEnabled()) logger.info("Hello3");
		if(LOGGER.isDebugEnabled())LOGGER.info("Hello3");
		
	}

}
