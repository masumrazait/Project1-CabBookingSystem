package com.project1cbs.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.project1cbs.model.Cab;

import com.project1cbs.util.HibernateDbcon;

public class GetACabDao {
    public Cab getAcab(Integer cabId) {
    	SessionFactory sessionFactory = HibernateDbcon.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Cab cab = session.get(Cab.class, cabId);
	
		session.close();
		sessionFactory.close();
		return cab;
    }
}
