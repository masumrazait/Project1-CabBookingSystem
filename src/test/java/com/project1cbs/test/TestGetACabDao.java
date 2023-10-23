package com.project1cbs.test;
import com.project1cbs.dao.GetACabDao;
import com.project1cbs.model.Cab;

import junit.framework.TestCase;


public class TestGetACabDao extends TestCase {
    


	public void testGetAcab() {
		GetACabDao dao = new GetACabDao();
		Cab cab = new Cab();
		
		cab.setCabId(2);
		cab.setCabModel("sedan");
		cab.setDriverName("Ashoke");
		cab.setDrivMobNo("8888888888");
		cab.setBookingStatus(0);
		assertNotSame(cab.getCabModel(),dao.getAcab(2).getCabModel());
		assertNotSame(cab.getDriverName(),dao.getAcab(2).getDriverName());
		assertNotSame(cab.getDrivMobNo(),dao.getAcab(2).getDrivMobNo());
	
	}

}
