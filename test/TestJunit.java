package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.MessageUtil;

public class TestJunit {
	//for testing
	String message = "hello";/// this will come from testing side
	String msg = "hello";/// this will come from testing side
	
	
	MessageUtil messageutil = new MessageUtil(message);
	
	@Test
	public void testshowMessage() {
		
		assertEquals(message,messageutil.showMessage());
		
	}
	
	@Test
	public void testValidateText() {
		
		assertEquals(msg,messageutil.showMessage());
		
	}
	
	




}
