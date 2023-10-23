package com.project1cbs.dao;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.project1cbs.exception.BookingIdNotFoundException;
import com.project1cbs.model.BookingRequests;
import com.project1cbs.model.BookingResult;
import com.project1cbs.util.HibernateDbcon;

public class RequestDaoImpl implements RequestDao{
    
	Session session = HibernateDbcon.getSessionFactory().openSession();
	 public static final Logger logger = LogManager.getLogger(RequestDaoImpl.class);

	public void acceptRequest(Integer bookingReqId) throws BookingIdNotFoundException {
		
		logger.info("In AcceptRequest function....");
		BookingRequests bReq = (BookingRequests)session.get(BookingRequests.class, bookingReqId);
		
		 
		//Creating BookingResult obj
		BookingResult br = new BookingResult();
		br.setBrId(bReq);
		br.setStatus("Accepted");
		Transaction tx = session.getTransaction();
		tx.begin();
		
		session.save(br);
		
		
		bReq.setCheckedOrNot(1);
		session.update(bReq);
		
		
		
		
		tx.commit();
		
		session.close();
		logger.info(" AcceptRequest function executed success fully");

 	 
	}

	
	public void rejectRequest(Integer bookingReqId) throws BookingIdNotFoundException{
		// TODO Auto-generated method stub
		//getting BookingRequests obj
		logger.info("In rejectRequest function....");

		BookingRequests bReq = (BookingRequests)session.get(BookingRequests.class, bookingReqId);
		
		BookingResult br = new BookingResult(bReq,"Rejected");//Creating BookingResult obj
		Transaction tx = session.getTransaction();
		tx.begin();
		
	    session.save(br);
		bReq.setCheckedOrNot(1);
		session.update(bReq);
			
		
		tx.commit();
		
		session.close();
		logger.info("rejectRequest function executed successfully....");
        
	}

}
