package com.project1cbs.test;

import com.project1cbs.dao.BooKCabDao;
import com.project1cbs.dao.BookCabDaoImpl;
import com.project1cbs.dao.GetBookingResults;
import com.project1cbs.dao.GetBookingResultsDaoImpl;
import com.project1cbs.exception.CabUnavailableException;
import com.project1cbs.model.Cab;
import com.project1cbs.model.Employee;

import junit.framework.TestCase;

public class TestBookCabDaoImpl extends TestCase {

	public void testBookAcabDao() {
		BooKCabDao bCab = new BookCabDaoImpl();
		Cab cab = new Cab(0,"Modhu","5555555555","suv");
		Employee emp = new Employee("Manu","manu@gmail.com","employee","BBC");
        GetBookingResults cDao = new GetBookingResultsDaoImpl();
       	try {
			bCab.bookAcabDao(emp, cab);
			assertTrue(cDao.getBookingResult().size() > 3);
		} catch (CabUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       	
	}

}
