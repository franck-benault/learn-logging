package net.franckbenault.learning.log4j;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.junit.jupiter.api.Test;

class LearningLog4jTest {
	

	@Test
	void testLogCreate() {
		
		Logger logger = Logger.getLogger("MyLogger");
		logger.info("Hello");

	}
	
	@Test
	void testLogAndAppender() {
		
		Logger logger = Logger.getLogger("MyLogger");
		ConsoleAppender appender = new ConsoleAppender();
		logger.addAppender(appender);
		
		logger.info("Hello");
		

	}
	
	@Test
	void testLogAndAppenderSysout() {
		
		Logger logger = Logger.getLogger("MyLogger");
		ConsoleAppender appender = new ConsoleAppender(new PatternLayout("%p %t %m%n"), 
				ConsoleAppender.SYSTEM_OUT);
		logger.addAppender(appender);
		
		logger.info("Hello");
		

	}

}
