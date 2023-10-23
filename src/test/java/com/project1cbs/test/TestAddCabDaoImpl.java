package com.project1cbs.test;

import com.project1cbs.dao.GetACabDao;
import com.project1cbs.model.Cab;
import com.project1cbs.service.AddCab;
import com.project1cbs.service.AddCabImpl;

import junit.framework.TestCase;

public class TestAddCabDaoImpl extends TestCase {

	public void testAddCabDao() {
		AddCab adCab = new AddCabImpl();
		//Integer bookingStatus, String driverName, String drivMobNo, String cabModel
		Cab cab = new Cab(1,"Modhu","5555555555","suv");
		adCab.addCab(cab);
		GetACabDao gCab = new GetACabDao();
		assertEquals("suv",gCab.getAcab(5).getCabModel());
	}

}
