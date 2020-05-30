package net.franckbenault.learning.flogger;

import org.junit.jupiter.api.Test;

import com.google.common.flogger.FluentLogger;

class LearningFloggerTest {
	
	private static final FluentLogger logger = FluentLogger.forEnclosingClass();

	@Test
	void test() {
		logger.atInfo().log("Log message with: %s", "argument");
		
		for(int i=1 ; i<=12; i++)
			logger.atInfo().every(4).log("log2");
	}

}