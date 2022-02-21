package net.franckbenault.learning.tinylog;

import org.junit.jupiter.api.Test;
import org.tinylog.Logger;

public class LearningTinylogTest {
	
	@Test
	public void testLogCreate() {
		
		Logger.info("Hello1");


	}
	
	
	@Test
	public void testLogLevel() {
		

		
		Logger.trace("Hello3");
		
		Logger.debug("Hello3");

		Logger.info("Hello3");
	
		Logger.warn("Hello3");
			
		Logger.error("Hello3");
			
	}
	
	@Test
	public void testLogTag() {
		

		
		Logger.tag("SYSTEM").trace("Hello4 S");		
		Logger.tag("SYSTEM").debug("Hello4 S");
		Logger.tag("SYSTEM").info("Hello4 S");
		Logger.tag("SYSTEM").warn("Hello4 S");		
		Logger.tag("SYSTEM").error("Hello4 S");
			
		Logger.tag("APP").trace("Hello4 A");		
		Logger.tag("APP").debug("Hello4 A");
		Logger.tag("APP").info("Hello4 A");
		Logger.tag("APP").warn("Hello4 A");		
		Logger.tag("APP").error("Hello4 A");
	}


}
