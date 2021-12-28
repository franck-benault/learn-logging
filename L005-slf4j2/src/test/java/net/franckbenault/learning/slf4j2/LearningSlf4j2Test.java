package net.franckbenault.learning.slf4j2;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LearningSlf4j2Test {

	private static final Logger LOGGER =  LoggerFactory.getLogger(LearningSlf4j2Test.class);

	@Test
	public void testLogCreate() {
		
		Logger logger = LoggerFactory.getLogger("MyLogger");
		logger.info("Hello1");
		LOGGER.info("Hello1");

	}
	
	
	@Test
	public void testLogLevel() {
		
		Logger logger = LoggerFactory.getLogger("MyLogger");
		
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
		
		//logger.fatal("Hello3");
		//LOGGER.fatal("Hello3");
		
	}
	
	@Test
	public void testLogIsXXEnabled() {
		
		Logger logger = LoggerFactory.getLogger("MyLogger");
		
		if(logger.isTraceEnabled()) logger.trace("Hello3");
		if(LOGGER.isTraceEnabled()) LOGGER.trace("Hello3");
		
		if(logger.isDebugEnabled()) logger.debug("Hello3");
		if(LOGGER.isDebugEnabled()) LOGGER.debug("Hello3");
		
		if(logger.isInfoEnabled()) logger.info("Hello3");
		if(LOGGER.isInfoEnabled()) LOGGER.info("Hello3");
		
		if(logger.isErrorEnabled()) logger.error("Hello3");
		if(LOGGER.isErrorEnabled()) LOGGER.error("Hello3");
		
	}
	
	@Test
	public void testLogFluentApiSimpleExamples() {
		
		Logger logger = LoggerFactory.getLogger("MyLogger");
		
		String simpleMessage = "Hello4";
		logger.atTrace().log(simpleMessage);
		LOGGER.atTrace().log(simpleMessage);
		
		logger.atDebug().log(simpleMessage);
		LOGGER.atDebug().log(simpleMessage);
		
		logger.atInfo().log(simpleMessage);
		LOGGER.atInfo().log(simpleMessage);
		
		logger.atWarn().log(simpleMessage);
		LOGGER.atWarn().log(simpleMessage);
		
		logger.atError().log(simpleMessage);
		LOGGER.atError().log(simpleMessage);
				
	}
	
	@Test
	public void testLogFluentApiAdvancedExamples() {
		
		Logger logger = LoggerFactory.getLogger("MyLogger");
		
		String divisionMessage = "division {} by {} , res= {} ";
		String simpleMessageWithArgument = "Hello5 arg1={}, Arg2={}";
		
        int newT = 15;
        int oldT = 16;
        // using fluent API
        logger.atInfo().addKeyValue("oldT", oldT).addKeyValue("newT", newT).log("Temperature changed.");          
	 
        logger.atInfo().addArgument(15L).addArgument(17L).log(simpleMessageWithArgument);
	
        int a= 1;
        int b=0;
        Integer res =null;
	
        try {
        	res = a/b;
        } catch (Exception e) {
        	logger.atInfo()
        		.setCause(e).addArgument(a).addArgument(b).addArgument(res)
        		.log(divisionMessage);
        }
	}

}
