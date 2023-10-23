package com.project1cbs.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.project1cbs.dao.GetFreeCabsDao;
import com.project1cbs.dao.GetFreeCabsDaoImpl;
import com.project1cbs.model.Cab;

public class CabBookingImpl implements CabBooking{
    public static final Logger logger = LogManager.getLogger(CabBookingImpl.class);


	public List<Cab> getFreeCabs() {
		logger.info("In cab booking service method....");
		GetFreeCabsDao gfc = new GetFreeCabsDaoImpl();
		List<Cab> freeCabs = new ArrayList<Cab>();
		
		freeCabs = gfc.getFreeCabs();
		return freeCabs;
	}
//End of list cab
    
}
