package com.project1cbs.test;

import com.project1cbs.dao.GetFreeCabsDao;
import com.project1cbs.dao.GetFreeCabsDaoImpl;
import com.project1cbs.service.CabBooking;
import com.project1cbs.service.CabBookingImpl;

import junit.framework.TestCase;

public class TestGetFreeCabsDaoImpl extends TestCase {

	public void testGetFreeCabs() {
		CabBooking dao = new CabBookingImpl();
		assertTrue(dao.getFreeCabs().size() >= 1);
	}

}
