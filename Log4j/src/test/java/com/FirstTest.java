package com;

import org.apache.logging.log4j.*;

public class FirstTest {
	
	private static final Logger log = LogManager.getLogger(FirstTest.class);
	public static void main(String[] args) {
		
	//System.out.println("Hello");	
	log.info("This is informaton message");
	log.debug("this is debug message");
	log.error("this is error message");
	log.fatal("this is error message");
		
	}
}