package com.project1cbs.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.project1cbs.exception.CabUnavailableException;
import com.project1cbs.model.BookingRequests;
import com.project1cbs.model.Cab;
import com.project1cbs.model.Employee;
import com.project1cbs.util.HibernateDbcon;

@SuppressWarnings({ "unused", "deprecation" })
public class BookCabDaoImpl implements BooKCabDao{

	public void bookAcabDao(Employee emp, Cab cab) throws CabUnavailableException{
		
			SessionFactory sessionFactory = HibernateDbcon.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tx = session.getTransaction();
			tx.begin();
			BookingRequests b = new BookingRequests(cab,emp);
			
			session.save(b);
			
			@SuppressWarnings("unused")
			Integer cabId = cab.getCabId();
			Cab bookedCab = session.get(Cab.class, cab.getCabId());
			bookedCab.setBookingStatus(1);
			session.saveOrUpdate(bookedCab);
			tx.commit();
			session.close();
			sessionFactory.close();
			
		
	}
   
}
