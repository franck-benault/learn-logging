package net.franckbenault.learning.flogger;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

import com.google.common.flogger.FluentLogger;
import com.google.common.flogger.LazyArgs;
import com.google.common.flogger.MetadataKey;
import com.google.common.flogger.StackSize;

class LearningFloggerTest {
	
	private static final FluentLogger logger = FluentLogger.forEnclosingClass();
	
	@Test
	public void testLogCreate() {
	
		logger.atInfo().log("Hello1");

	}
	
	
	@Test
	public void testLogPrintf() {
		
		String world ="world";

		logger.atInfo().log("Hello1 %s.",world);
		logger.atInfo().log("Hello1 %S.",world);

	}
	
	@Test
	public void testLogFluentApiSimpleExamplesLevel() {
		
		String simpleMessage = "Hello2";
		
		logger.atFinest().log(simpleMessage);	
		logger.atFine().log(simpleMessage);		
		logger.atInfo().log(simpleMessage);		
		logger.atWarning().log(simpleMessage);	
		logger.atSevere().log(simpleMessage);
				
	}
	


	@Test
	void testLogFluentApiSimpleKeyValue() {

		String simpleMessage = "Hello4 -";
		
		logger.atInfo()
			.with(MetadataKey.single("key", String.class), "value")
			.log(simpleMessage);
	}
	
	@Test
	public void testLogFluentApiAdvancedExamplesEvery() {
		
		String simpleMessage = "Hello3 -";
		
		for(int i=0 ; i<10_000; i++)
			logger.atInfo().atMostEvery(50, TimeUnit.MILLISECONDS).log(simpleMessage+i);;

		for(int i=0 ; i<12; i++)
			logger.atInfo().every(4).log("log2 "+i);
				
	}
	
	@Test
	public void testLogFluentApiAdvancedExamplesException() {
				
		String divisionMessage = "division %d by %d , res= %d  size %s ";

        int a=1;
        int b=0;
        Integer res =null;
	
        try {
        	res = a/b;
        } catch (Exception e) {
        	logger.atInfo()
        		.withCause(e)
        		.withStackTrace(StackSize.SMALL)
        		.log(divisionMessage, a, b, res,"CAUSE");
        }
        
        try {
        	res = a/b;
        } catch (Exception e) {
        	logger.atInfo()
        		.withStackTrace(StackSize.SMALL)
        		.log(divisionMessage, a, b, res,"SMALL");
        }
        
        try {
        	res = a/b;
        } catch (Exception e) {
        	logger.atInfo()
        		.withStackTrace(StackSize.FULL)
        		.log(divisionMessage, a, b, res,"FULL");
        }
	}
	
	private int slowMethod()  {
		
		try {
			TimeUnit.SECONDS.sleep(25);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 100;
	}

	@Test
	public void testLogFluentApiAdvancedExamplesLazy() {
				
		logger.atInfo().log("Start1");
		logger.atFinest().log("message %d",  LazyArgs.lazy(() -> slowMethod()));
		logger.atInfo().log("end1");

		logger.atInfo().log("Start2");
		logger.atFinest().log("message %d",  slowMethod());
		logger.atInfo().log("end2");


	}
}