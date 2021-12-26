package net.franckbenault.learning.log4j;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.junit.Rule;
import org.junit.jupiter.api.Test;

class LearningLog4jTest {



	@Test
	void testLogCreate() {
		
		Logger logger = Logger.getLogger("MyLogger");
		logger.info("Hello1");


	}
	
	@Test
	void testLogAndAppender() {
		
		Logger logger = Logger.getLogger("MyLogger");
		ConsoleAppender appender = new ConsoleAppender();
		logger.addAppender(appender);
		
		logger.info("Hello2");

	}

}
