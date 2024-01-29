package com.cybage.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinpracticeApplicationTests {
	public static Logger logger=LoggerFactory.getLogger(JenkinpracticeApplication.class);

	@Test
	 public void contextLoads() {
		logger.info("Test CASE  executing");
//		logger.info("test seconf running");
		assertEquals(true,true);
	}

}
