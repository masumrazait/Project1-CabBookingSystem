package com.project1cbs.test;

import com.project1cbs.dao.GetBookingResults;
import com.project1cbs.dao.GetBookingResultsDaoImpl;

import junit.framework.TestCase;

public class TestGetBookingResultsDaoImpl extends TestCase {

	public void testGetBookingResult() {
		GetBookingResults dao = new GetBookingResultsDaoImpl();
		assertTrue(dao.getBookingResult().size()>=1);
	}

}
