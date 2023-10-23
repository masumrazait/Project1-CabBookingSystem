package com.project1cbs.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.project1cbs.model.Cab;
import com.project1cbs.util.HibernateDbcon;

public class AddCabDaoImpl implements AddCabDao{
    
	 public static final Logger logger = LogManager.getLogger(AddCabDaoImpl.class);
	public void addCabDao(Cab cab) {
		logger.info("In add cab function...");
		Session session = HibernateDbcon.getSessionFactory().openSession();
		Transaction tx = session.getTransaction();
		tx.begin();
		
		session.save(cab);
		
		tx.commit();
		session.close();
		logger.info(" add cab function executed seccessfully");

	}

}
