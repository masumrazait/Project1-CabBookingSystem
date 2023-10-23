package com.project1cbs.test;

import com.project1cbs.dao.GetCabRequestsDaoImpl;

import junit.framework.TestCase;

public class TestGetCabRequestsDaoImpl extends TestCase {

	public void testGetBookingRequests() {
		GetCabRequestsDaoImpl dao = new GetCabRequestsDaoImpl();
		assertTrue(dao.getBookingRequests().size() >= 1);
	}

}
