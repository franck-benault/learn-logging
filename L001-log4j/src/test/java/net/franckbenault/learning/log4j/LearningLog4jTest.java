package net.franckbenault.learning.log4j;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

class LearningLog4jTest {

	private static final Logger LOGGER =  Logger.getLogger(LearningLog4jTest.class);

	@Test
	public void testLogCreate() {
		
		Logger logger = Logger.getLogger("MyLogger");
		logger.info("Hello1");
		LOGGER.info("Hello1");

	}
	
	@Test
	public void testLogAndAppender() {
		
		Logger logger = Logger.getLogger("MyLogger");
		ConsoleAppender appender = new ConsoleAppender();
		logger.addAppender(appender);
		
		logger.info("Hello2");

	}
	
	@Test
	public void testLogLevel() {
		
		Logger logger = Logger.getLogger("MyLogger");
		
		logger.trace("Hello3");
		LOGGER.trace("Hello3");
		
		logger.debug("Hello3");
		LOGGER.debug("Hello3");
		
		logger.info("Hello3");
		LOGGER.info("Hello3");
		
		logger.error("Hello3");
		LOGGER.error("Hello3");
		
		logger.fatal("Hello3");
		LOGGER.fatal("Hello3");
		
	}
	
	@Test
	public void testLogIsDebugEnabled() {
		
		Logger logger = Logger.getLogger("MyLogger");
		
		if(logger.isDebugEnabled()) logger.trace("Hello3");
		if(LOGGER.isDebugEnabled()) LOGGER.trace("Hello3");
		
		if(logger.isDebugEnabled()) logger.debug("Hello3");
		if(LOGGER.isDebugEnabled()) LOGGER.debug("Hello3");
		
		if(logger.isDebugEnabled()) logger.info("Hello3");
		if(LOGGER.isDebugEnabled())LOGGER.info("Hello3");
		
	}


}
