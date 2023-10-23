package com.project1cbs.test;

import java.util.ArrayList;
import java.util.List;

import com.project1cbs.dao.GetBookingResults;
import com.project1cbs.dao.GetBookingResultsDaoImpl;
import com.project1cbs.dao.RequestDao;
import com.project1cbs.dao.RequestDaoImpl;
import com.project1cbs.exception.BookingIdNotFoundException;
import com.project1cbs.model.BookingResult;

import junit.framework.TestCase;

public class TestRequestDaoImpl extends TestCase {

	public void testAcceptRequest() {
		RequestDao dao = new RequestDaoImpl();
		GetBookingResults resDao = new GetBookingResultsDaoImpl();
		List<BookingResult> bRes = new ArrayList<>();
		bRes = resDao.getBookingResult();
		try {
			dao.acceptRequest(3);
			assertTrue(bRes.size() >= 3);
		} catch (BookingIdNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void testRejectRequest() {
		RequestDao dao = new RequestDaoImpl();
		GetBookingResults resDao = new GetBookingResultsDaoImpl();
		List<BookingResult> bRes = new ArrayList<>();
		bRes = resDao.getBookingResult();
		try {
			dao.acceptRequest(3);
			assertTrue(bRes.size() >= 3);
		} catch (BookingIdNotFoundException e) {
			e.printStackTrace();
		}
	}

}
